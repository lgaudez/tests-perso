package com.sprsec.controller;

import com.sprsec.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LinkNavigation {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView homePage() {
		return new ModelAndView("home");
	}

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public ModelAndView indexPage() {
		return new ModelAndView("home");
	}

    @RequestMapping(value="/welcome", method=RequestMethod.GET)
    public ModelAndView welcome() {
        return new ModelAndView("welcome");
    }
	
	@RequestMapping(value="/sec/moderation", method=RequestMethod.GET)
	public ModelAndView moderatorPage() {
		return new ModelAndView("moderation");
	}
	
	@RequestMapping(value="/admin/administration", method=RequestMethod.GET)
	public ModelAndView firstAdminPage() {
		return new ModelAndView("administration");
	}
	
	@RequestMapping(value="/admin/second", method=RequestMethod.GET)
	public ModelAndView secondAdminPage() {
		return new ModelAndView("admin-second");
	}



}
