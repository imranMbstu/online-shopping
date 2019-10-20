package com.imran.onlineShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("welcomeMessage", "Hello!! Mohammed Imran Hossain welcome to Spring MVC world.");
		return mv;
	}
	
	
	@RequestMapping(value = "/test/{welcomeMessage}")
	public ModelAndView test(@PathVariable(value = "welcomeMessage", required = false) String welcomeMessage) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("welcomeMessage", welcomeMessage.isEmpty() ? "Hello There" : welcomeMessage);
		return mv;
	}
}
