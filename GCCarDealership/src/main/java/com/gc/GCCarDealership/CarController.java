package com.gc.GCCarDealership;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gc.GCCarDealership.dao.CarRepository;
import com.gc.GCCarDealership.entity.Car;

@RestController
public class CarController {

	@Autowired
	CarRepository cr;

	@GetMapping("/test")
	public List<Car> list(@RequestParam("make") String make, @RequestParam("model") String model,
			@RequestParam("year") String year, @RequestParam("color") String color) {
		int counter = 0;
		if (make.isEmpty() == false) {
			counter++;
		}
		if (model.isEmpty() == false) {
			counter++;
		}
		if (year.isEmpty() == false) {
			counter++;
		}
		if (color.isEmpty() == false) {
			counter++;
		}

		if (counter == 1) {
			if (make.isEmpty() == false) {
				return cr.findByMake(make);
			} else if (model.isEmpty() == false) {
				return cr.findByModel(model);
			} else if (year.isEmpty() == false) {
				return cr.findByYear(year);
			} else {
				return cr.findByColor(color);
			}

		} else if (counter == 2) {
			
		} else if (counter == 3) {
			
		} else {
			
		}

		return c;
	}
}
