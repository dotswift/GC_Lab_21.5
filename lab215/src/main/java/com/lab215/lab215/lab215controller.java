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

	@RequestMapping("/oil-calc")
	public ModelAndView showMilesPerGallon() {
		return new ModelAndView("/oil-calc");
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

	@RequestMapping("/oil-calc-result")
	public ModelAndView showOilResult(@RequestParam("oilGallons") int oilGallons) {
		int result = oilGallons / 5;
		int donation = oilGallons % 5;
		double cost = oilGallons * 4.25;

		ModelAndView mav = new ModelAndView("oil-calc-result");
		mav.addObject("oilGallons", oilGallons);
		mav.addObject("donation", donation);
		mav.addObject("result", result);
		mav.addObject("cost", cost);
		return mav;
	}
	
	@RequestMapping("/roadtrip-games")
	public ModelAndView showGames() {
		ModelAndView mav = new ModelAndView("roadtrip-games");
		return mav;
	}

	@RequestMapping("/roadtrip-games-result")
	public ModelAndView showGamesResult(@RequestParam("adj") String adj, @RequestParam("noun") String noun) {
		ModelAndView mav = new ModelAndView("roadtrip-games-result");
		mav.addObject("adj", adj);
		mav.addObject("noun", noun);
		return mav;
	}
	
	@RequestMapping("/are-we-there")
	public ModelAndView showAreWeThere() {
		ModelAndView mav = new ModelAndView("are-we-there");
		return mav;
	}
	@RequestMapping("are-we-there-result")
	public ModelAndView showAreWeThereResult(@RequestParam("word") String word, @RequestParam("repeat") int repeat) {
		ModelAndView mav = new ModelAndView("are-we-there-result");
		mav.addObject("word", word);
		mav.addObject("repeat",repeat);
		
		
		
		
		return mav;
	}

}
