package com.factory;

public class DeveloperClient {
	
	public static void main(String args[]) {
		//Employee employee = new AndroidDeveloper();
		
		Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
		int salary = employee.salary();
		System.out.println("Salary : "+salary);
		
		Employee employee2 = EmployeeFactory.getEmployee("WEB DEVELOPER");
		System.out.println("Salary : "+employee2.salary());
	}

}



