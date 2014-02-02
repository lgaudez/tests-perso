package com.languageApp.controller;

import com.languageApp.model.Role;
import com.languageApp.model.User;
import com.languageApp.service.RoleService;
import com.languageApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Date;

/**
 * Created by leoG on 24/01/14.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    RoleService rs;

    /**
     * renvoie les infos des utilisateurs
     * @param modelmap envoyé à info.jsp
     * @return un utilisateur
     */
    @RequestMapping(value="/user/info", method=RequestMethod.GET)
    public String getUserInfo(ModelMap modelmap){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String login = auth.getName(); ////login
        User user =  userService.getUserbyLogin(login);
        modelmap.addAttribute("user", user);
        //modelmap.addAttribute("test", user.toString());
        return "info";
    }

    /**
     * méthode appelée lors de la requete de la page d'inscription
     * @param m : ce qu'on retourne à inscription.jsp
     * @return renvoie la page inscription.jsp
     */
    @RequestMapping(value="/inscription", method=RequestMethod.GET)
    public String loadFormPage(Model m) {
        m.addAttribute("user", new User());
        return "inscription";
    }

    /**
     * méthode appelé par le formulaire d'inscription
     * @param user, une personne
     * @param m :: Model utilisé par spring
     * @return renvoie un message sur la page d'inscription
     */
    @RequestMapping(value="/inscription", method=RequestMethod.POST)
    public String submitForm(@ModelAttribute @Valid User user, BindingResult result, Model m) {
        if(result.hasErrors()) {
            return "inscription";
        }
        Role r = rs.getRole(3);//ROLE_USER
        user.setRole(r);
        user.setCreated(new Date());
        userService.createUser(user);
        m.addAttribute("message", user.getFirstName() + " " + user.getLastName());
        return "inscription";
    }



}