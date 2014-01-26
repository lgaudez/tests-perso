package com.sprsec.controller;

import com.sprsec.dao.UserDAO;
import com.sprsec.model.Role;
import com.sprsec.model.User;
import com.sprsec.service.RoleService;
import com.sprsec.service.RoleServiceImpl;
import com.sprsec.service.UserService;
import com.sprsec.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by leoG on 24/01/14.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    RoleService rs;

    @RequestMapping(value="/user/info", method=RequestMethod.GET)
    public String getUserInfo(ModelMap modelmap){
        User user =  userService.getUserbyId(1);
        modelmap.addAttribute("user", user);
        modelmap.addAttribute("test", user.toString());
        return "info";
    }

    @RequestMapping(value="/inscription", method=RequestMethod.GET)
    public String loadFormPage(Model m) {
        m.addAttribute("user", new User());
        return "inscription";
    }

    @RequestMapping(value="/inscription", method=RequestMethod.POST)
    public String submitForm(@ModelAttribute User user, Model m) {
        Role r = rs.getRole(3);//ROLE_USER
        user.setRole(r);
        userService.createUser(user);
        m.addAttribute("message", "Sauvegardé dans la base de données t'as vu! : " + user.getFirstName() + " " + user.getLastName());
        return "inscription";
    }



}