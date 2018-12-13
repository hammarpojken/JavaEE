package control;

import java.util.UUID;

import javax.inject.Inject;

import entity.Car;
import entity.Color;
import entity.Specification;

public class CarFactory {
	
	@Inject
	Color defaultCarColor;
	
	public Car createCar(Specification spec) {
		Car car = new Car();
		car.setIdentifier(UUID.randomUUID().toString());
		car.setColor(spec.getColor() == null ? defaultCarColor : spec.getColor());
		car.setEngineType(spec.getEngineType());
		return car;
	}

}
