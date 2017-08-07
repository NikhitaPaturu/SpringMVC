package com.aarestu.controller;

import com.aarestu.controller.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView model = new ModelAndView("login");
		return model;
	
	}
	@RequestMapping(value="/formoutput", method = RequestMethod.POST)
	public ModelAndView submitform(@RequestParam("UserName") String UserName, @RequestParam("Email") String Email) {
		ModelAndView model = new ModelAndView("formoutput");
		model.addObject("message", "Details submitted by you : Name : "+UserName+", Email:" + Email);
		return model;
	}

}