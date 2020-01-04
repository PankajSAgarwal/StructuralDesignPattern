package com.pankaj.designpattern.facade.email;

public class StationaryFactory {
	
	public static Stationary createStationary() {
		
		return new HalloweenStationary();
	}

}
