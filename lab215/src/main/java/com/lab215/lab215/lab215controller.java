package com.lab215.lab215;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping("/mileage-result")
	public ModelAndView showMileageResult(@RequestParam("mpg") int mpg, @RequestParam("gallons") int gallons) {
		int result = mpg * gallons;

		ModelAndView mav = new ModelAndView("mileage-result");
		mav.addObject("mpg", mpg);
		mav.addObject("gallons", gallons);
		mav.addObject("result", result);
		return mav;
	}

}
