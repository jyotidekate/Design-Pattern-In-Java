package com.abstractfactory;

public class EmployeeFactory {
	
	// get employee
	public static Employee getEmployee(EmployeeAbstractFactory factory) {
		return factory.createEmployee();
	}

}

// above method will return employee but usko khud nahi pata ki wo kya return krre hoge kyu ki hum isko provide krenge dusri
// EmployeeAbstractFactory class ie., ek dusri abstract layer matlab ek dusra abstract class ya fir interface
// EmployeeFactory is not going to create the object but this will call to EmployeeAbstractFactory to create the object








