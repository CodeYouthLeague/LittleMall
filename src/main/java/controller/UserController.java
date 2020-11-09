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

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

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

    @RequestMapping("/select")
    @ResponseBody
    public List<User> selectUsers(){
        List<User> users = userService.selectUsers();
        System.out.println("程序已执行到这里！");
        return users;
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
            modelAndView.setViewName("result");
        }
        return modelAndView;
    }
}
