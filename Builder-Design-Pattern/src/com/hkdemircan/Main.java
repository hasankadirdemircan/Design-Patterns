package com.hkdemircan;

import com.hkdemircan.model.Employee;

public class Main {

	public static void main(String[] args) {
		Employee kadir = new Employee.EmployeeBuilder("kadir", "Java Developer")
				.setLastName("demrcan")
				.setAge(24)
				.setSalary(9999999)
				.build();
		
		System.out.println(kadir.getAge());
	}
}
