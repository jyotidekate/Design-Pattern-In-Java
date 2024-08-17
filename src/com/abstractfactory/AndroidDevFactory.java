package com.abstractfactory;

public class AndroidDevFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		return new AndroidDeveloper();
	}

}

// Yaha se apko ek employee create krna hai or wo employee hoga Android Developer





