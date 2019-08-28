package com.hkdemircan;

public class Porsche implements Car {

	@Override
	public void name() {
		System.out.println("Car name is : Porsche");
	}

	@Override
	public void price(int salary) {
		System.out.println("Porsche price : " + salary);
	}

}
