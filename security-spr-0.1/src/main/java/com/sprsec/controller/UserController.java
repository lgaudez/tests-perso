package com.sprsec.controller;

import com.sprsec.dao.UserDAO;
import com.sprsec.model.User;
import com.sprsec.service.UserService;
import com.sprsec.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by leoG on 24/01/14.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/user/info", method=RequestMethod.GET)
    public String getUserInfo(ModelMap modelmap){
        User user =  userService.getUserbyId(1);
        modelmap.addAttribute("user", user);
        modelmap.addAttribute("test", user.toString());
        return "info";
    }
}