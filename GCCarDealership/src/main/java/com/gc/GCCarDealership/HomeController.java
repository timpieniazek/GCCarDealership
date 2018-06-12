package com.gc.GCCarDealership;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gc.GCCarDealership.dao.CarRepository;
import com.gc.GCCarDealership.entity.Car;

@Controller
public class HomeController {

	@Autowired
	CarRepository cr;
	 
	@RequestMapping("/")
	public ModelAndView index() {

		return new ModelAndView("index");
	}
}
