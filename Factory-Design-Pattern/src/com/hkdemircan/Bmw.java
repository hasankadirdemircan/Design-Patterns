package com.hkdemircan;

public class Bmw implements Car {

	@Override
	public void name() {
		System.out.println("Car name is : Bmw");
	}

	@Override
	public void price(int salary) {
		System.out.println("Bmw price : " + salary);
	}

}
