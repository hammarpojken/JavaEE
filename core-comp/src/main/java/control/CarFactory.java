package control;

import java.util.UUID;

import entity.Car;
import entity.Specification;

public class CarFactory {
	
	
	public Car createCar(Specification spec) {
		Car car = new Car();
		car.setIdentifier(UUID.randomUUID().toString());
		car.setColor(spec.getColor());
		car.setEngineType(spec.getEngineType());
		return car;
	}

}
