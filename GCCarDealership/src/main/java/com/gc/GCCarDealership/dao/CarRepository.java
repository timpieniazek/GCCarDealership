package com.gc.GCCarDealership.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gc.GCCarDealership.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

	List<Car> findByMake(String make);
	List<Car> findByModel(String model);
	List<Car> findByYear(String year);
	List<Car> findByColor(String color);
	
	List<Car> findByMakeAndModel(String make, String model);
	List<Car> findByMakeAndYear(String make, String year);
	List<Car> findByMakeAndColor(String make, String color);
	List<Car> findByMakeModelAndYear(String make, String model, String year);
	List<Car> findByMakeModelAndColor(String make, String model, String color);
	List<Car> findByMakeYearAndColor(String make, String year, String color);
	List<Car> findByMakeModelYearAndColor(String make, String model, String year, String color);
	
	List<Car> findByModelAndYear(String model, String year);
	List<Car> findByModelAndColor(String model, String color);
	List<Car> findByModelYearAndColor(String model, String year, String color);
	
	List<Car> findByYearAndColor(String year, String color);
	
	
}
