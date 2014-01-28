package com.languageApp.controller;

import com.languageApp.model.User;
import com.languageApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    UserService userService;

    /**
     * users.jsp
     * retourne la liste de tous les utilisateurs
     * @param model renvoyé à la jsp
     * @return
     */
	@RequestMapping(value = "/admin/getAllUsers",method = RequestMethod.GET)
    public String list(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "users";
    }

    /**
     * adminisatration.jsp
     * @return
     */
    @RequestMapping(value="/admin/administration", method=RequestMethod.GET)
    public ModelAndView firstAdminPage() {
        return new ModelAndView("administration");
    }

    @RequestMapping("/admin/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {

        userService.deleteUserbyId(id);

        return "redirect:/admin/getAllUsers";
    }

    @RequestMapping(value="/admin/second", method=RequestMethod.GET)
    public ModelAndView secondAdminPage() {
        return new ModelAndView("admin-second");
    }

}