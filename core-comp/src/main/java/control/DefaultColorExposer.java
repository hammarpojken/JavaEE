package control;

import javax.enterprise.inject.Produces;

import entity.Color;

public class DefaultColorExposer {
	
	@Produces
	public Color exposeDefaultColor() {
		
		return Color.RED;
	}

}
