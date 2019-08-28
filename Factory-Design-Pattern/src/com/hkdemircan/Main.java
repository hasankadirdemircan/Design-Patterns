package com.hkdemircan;

public class Main {

	public static void main(String[] args) {
		
		try {
			Bmw bmw = (Bmw) CarFactory.createCar(Bmw.class);
			bmw.name();
			bmw.price(500000);
			
			Porsche porsche = (Porsche) CarFactory.createCar(Porsche.class);
			porsche.name();
			porsche.price(55500000);
			
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
		
	}
}
