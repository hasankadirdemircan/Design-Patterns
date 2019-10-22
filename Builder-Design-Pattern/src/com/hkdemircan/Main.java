package com.hkdemircan;

import com.hkdemircan.model.Employee;

public class Main {

	public static void main(String[] args) {
		Employee kadir = new Employee.EmployeeBuilder("Kadir", "Java Developer")
				.setLastName("Demircan")
				.setAge(24)
				.build();
		
		System.out.println(kadir.getAge());
	}
}
