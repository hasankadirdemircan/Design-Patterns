package com.hkdemircan;

public class CarFactory {
	
	public static Car createCar(Class aClass) throws IllegalAccessException, InstantiationException {
		return (Car) aClass.newInstance();
	}
}
