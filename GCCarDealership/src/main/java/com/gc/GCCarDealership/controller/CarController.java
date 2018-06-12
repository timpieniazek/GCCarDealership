package com.gc.GCCarDealership.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class CarController {

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
}
