package com.gc.GCCarDealership.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gc.GCCarDealership.dao.CarRepository;
import com.gc.GCCarDealership.entity.Car;

@RestController
public class CarRestController {
	
	@Autowired
	CarRepository carRepository;
	
	@GetMapping("/searchmake")
	public List<Car> searchMake(@RequestParam("make") String make) {
		List<Car> list = carRepository.findByMake(make);
		return list;
	}

	@GetMapping("/searchmodel")
	public List<Car> searchModel(@RequestParam("model") String model) {
		List<Car> list = carRepository.findByModel(model);
		return list;
	}

	@GetMapping("/searchyear")
	public List<Car> searchYear(@RequestParam("year") String year) {
		List<Car> list = carRepository.findByYear(year);
		return list;
	}

	@GetMapping("/searchcolor")
	public List<Car> searchColor(@RequestParam("color") String color) {
		List<Car> list = new ArrayList<>();
		list = carRepository.findByColor(color);
		return list;
	}

}
