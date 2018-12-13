package boundary;

import java.util.UUID;

import javax.ejb.Stateless;
import javax.inject.Inject;

import control.CarFactory;
import control.CarRepository;
import entity.Car;
import entity.Specification;

@Stateless
public class CarManufacturer {
	@Inject
	CarFactory carFactory;
	@Inject
	CarRepository carRepository;
	
	public Car manufactureCar(Specification spec) {
		Car car = carFactory.createCar(spec);
		carRepository.store(car);
		return car;

	}



}
