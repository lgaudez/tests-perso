package com.languageApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LinkNavigation {

    /**
     * Page d'acceuil home.jsp
     * @return
     */

	@RequestMapping(value="/*", method=RequestMethod.GET)
	public ModelAndView homePage() {
		return new ModelAndView("home");
	}

    /**
     * welcome.jsp
     * @return
     */
    @RequestMapping(value="/connected", method=RequestMethod.GET)
    public String welcome() {
        return "connected";
    }

    /**
     * modération
     * @return
     */
	@RequestMapping(value="/sec/moderation", method=RequestMethod.GET)
	public ModelAndView moderatorPage() {
		return new ModelAndView("moderation");
	}




}
