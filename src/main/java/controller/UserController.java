package controller;

import entity.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.CategoryService;
import service.UserService;
import util.CodeUtil;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/User")
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private CategoryService categoryService;

    @RequestMapping("/reg")
    public ModelAndView addUser(User user){
        ModelAndView modelAndView = new ModelAndView();
        String tips = "注册失败";
        if(userService.addUser(user)){
            tips = user.getUSER_NAME() + "注册成功";
        };
        // 添加数据
        modelAndView.addObject(tips);
        // 指定结果页面
        modelAndView.setViewName("result");
        return modelAndView;
    }

    @RequestMapping(value = "/login")
    public ModelAndView loginUser(HttpServletRequest request, HttpServletResponse response, User user){
        ModelAndView modelAndView = new ModelAndView();
        User result = userService.selectUserByUserIdAndPassword(user);
        if (result != null) {
            // 更新用户状态为在线状态
            result.setUSER_STATUS(1);
            userService.updateUser(result);

            request.setAttribute("flist",categoryService.selectFatherCategory());
            request.setAttribute("clist",categoryService.selectSonCategory());
            HttpSession session = request.getSession();
            session.setAttribute("name", result);
            session.setAttribute("isLogin", "1");
            modelAndView.addObject("username",result.getUSER_ID());
            modelAndView.addObject("user",result);
            modelAndView.setViewName("redirect:/index.jsp");
        }else {
            request.setAttribute("msg","用户名或者密码错误哦！");
            modelAndView.addObject("msg","用户名或者密码错误！");
            modelAndView.setViewName("/login.jsp");
        }
        return modelAndView;
    }

    @RequestMapping("/GetCode")
    public void getCode(HttpServletRequest request, HttpServletResponse response){
        // 调用工具类生成的验证码和验证码图片
        Map<String, Object> codeMap = CodeUtil.generateCodeAndPic();
        HttpSession session = request.getSession();
        session.setAttribute("code", codeMap.get("code").toString());
        // 禁止图像缓存。
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", -1);

        response.setContentType("image/jpeg");

        // 将图像输出到Servlet输出流中。
        ServletOutputStream sos;
        try {
            sos = response.getOutputStream();
            ImageIO.write((RenderedImage) codeMap.get("codePic"), "jpeg", sos);
            sos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
