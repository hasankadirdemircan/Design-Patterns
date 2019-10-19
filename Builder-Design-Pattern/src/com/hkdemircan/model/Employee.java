package com.hkdemircan.model;

public class Employee {
	private String firstName;
	private String lastName;
	private int age;
	private String position;
	private double salary;
	
	public Employee(EmployeeBuilder employeeBuilder) {
		this.firstName = employeeBuilder.firstName;
		this.lastName = employeeBuilder.lastName;
		this.age = employeeBuilder.age;
		this.position = employeeBuilder.position;
		this.salary = employeeBuilder.salary;
	}
	
	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPosition() {
		return position;
	}


	public double getSalary() {
		return salary;
	}


	public static class EmployeeBuilder{
		private String firstName;
		private String lastName;
		private int age;
		private String position;
		private double salary;
		
		/**
		 * @param firstName -> Required Field
		 * @param position  -> Required Field
		 */
		public EmployeeBuilder(String firstName, String position) {
			this.firstName = firstName;
			this.position = position;
		}
		
		/**
		 * @param lastName -> Optional Field
		 */
		public EmployeeBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		/**
		 * @param age -> Optional Field
		 */
		public EmployeeBuilder setAge(int age) {
			this.age = age;
			return this;
		}
		
		/**
		 * @param salary -> Optional Field
		 */
		public EmployeeBuilder setSalary(double salary) {
			this.salary = salary;
			return this;
		}
		
		public Employee build() {
			return new Employee(this);
		}
		
	}
}
