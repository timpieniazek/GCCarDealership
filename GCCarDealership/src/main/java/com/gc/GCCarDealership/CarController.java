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
		int makeNum = 0;
		int modelNum = 0;
		int yearNum = 0;
		int colorNum = 0;

		if (make.isEmpty() == false) {
			counter++;
			makeNum++;
		}
		if (model.isEmpty() == false) {
			counter++;
			modelNum++;
		}
		if (year.isEmpty() == false) {
			counter++;
			yearNum++;
		}
		if (color.isEmpty() == false) {
			counter++;
			colorNum++;
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
			if (makeNum + modelNum == 2) {
				return cr.findByMakeAndModel(make, model);
			} else if (makeNum + yearNum == 2) {
				return cr.findByMakeAndYear(make, year);
			} else if (makeNum + colorNum == 2) {
				return cr.findByMakeAndColor(make, color);
			} else if (yearNum + modelNum == 2) {
				return cr.findByModelAndYear(model, year);
			} else if (colorNum + modelNum == 2) {
				return cr.findByModelAndColor(model, color);
			} else {
				return cr.findByYearAndColor(year, color);
			}
		} else if (counter == 3) {
			if (makeNum + modelNum + yearNum == 3) {
				return cr.findByMakeAndModelAndYear(make, model, year);
			} else if (makeNum + modelNum + colorNum == 3) {
				return cr.findByMakeAndModelAndColor(make, model, color);
			} else if (makeNum + colorNum + yearNum == 3) {
				return cr.findByMakeAndYearAndColor(make, year, color);
			} else {
				return cr.findByModelAndYearAndColor(model, year, color);
			}
		} else {
			return cr.findByMakeAndModelAndYearAndColor(make, model, year, color);
		}
	}
}
