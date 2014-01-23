package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

    @Autowired private UserDAO userDAO;

	@RequestMapping(value = "/getAllUsers",method = RequestMethod.GET)
         public String list(Model model) {
        List<User> users = userDAO.findAll();
        model.addAttribute("users", users);
        return "index";
    }
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "welcome";
    }
}