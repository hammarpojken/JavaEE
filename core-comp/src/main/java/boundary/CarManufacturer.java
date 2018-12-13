package boundary;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import control.CarFactory;
import control.CarRepository;
import entity.Car;
import entity.CarCreated;
import entity.Specification;

@Stateless
public class CarManufacturer {
	@Inject
	CarFactory carFactory;
	@Inject
	CarRepository carRepository;

	@Inject
	Event<CarCreated> carCreated;

	public Car manufactureCar(Specification spec) {
		Car car = carFactory.createCar(spec);
		carRepository.store(car);
		carCreated.fire(new CarCreated(car.getIdentifier()));
		return car;
		

	}

}
