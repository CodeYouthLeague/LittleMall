package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/User")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/reg")
    public ModelAndView addUser(User user){
        ModelAndView modelAndView = new ModelAndView();
        String tips = "注册失败";
        int num = userService.addUser(user);
        if(num > 0){
            tips = user.getUSER_NAME() + "注册成功";
        }
        // 添加数据
        modelAndView.addObject(tips);
        // 指定结果页面
        modelAndView.setViewName("result");
        return modelAndView;
    }

    @RequestMapping("/select.do")
    @ResponseBody
    public List<User> selectUsers(){
        List<User> users = userService.selectUsers();
        System.out.println("程序已执行到这里！");
        return users;
    }


}
