package com.gc.GCCarDealership.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gc.GCCarDealership.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

	List<Car> findByMake(String make);
	List<Car> findByModel(String model);
	List<Car> findByYear(String year);
	List<Car> findByColor(String color);
}
