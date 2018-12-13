package control;

import javax.enterprise.event.Observes;

import entity.CarCreated;

public class CarCreationListener {
	
	public void onCarCreation(@Observes CarCreated carCreated) {
		
		System.out.println("new car created" + carCreated.getIdentifier());
	}

}
