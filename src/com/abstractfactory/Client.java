package com.abstractfactory;

public class Client {

	public static void main(String[] args) {
		// I want to get android developer
		Employee employee = EmployeeFactory.getEmployee(new AndroidDevFactory());
		System.out.println(employee.name());
		
		// I want to get web developer
		Employee employee2 = EmployeeFactory.getEmployee(new WebDevFactory());
		System.out.println(employee2.name());
		
		// I want to get manager
		Employee employee3 = EmployeeFactory.getEmployee(new ManagerFactory());
		employee3.name();
	}

}




