package cn.qu360.user.webapp.controller;

import cn.qu360.user.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: jianshe
 * Date: 13-8-20
 * Time: 下午10:10
 */

@Controller
@RequestMapping("/user")
public class UserController {
    private UserManager userManager = null;
    @Autowired
    public void setUserManager(UserManager userManager) {
       this.userManager = userManager;
    }

    @RequestMapping("/getuser")
    public void getUser(){
        userManager.queryForUser("u","p");
        System.out.print("user");
    }

}
