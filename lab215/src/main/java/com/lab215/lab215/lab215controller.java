package com.lab215.lab215;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class lab215controller {

	@RequestMapping("/")
	public ModelAndView showHome() {

		ModelAndView mav = new ModelAndView("index");

		return mav;
	}
	
	
	@RequestMapping("/mileage-form")
	public ModelAndView showMileageForm() {
		return new ModelAndView("/mileage-form");
	}
	
	
}
