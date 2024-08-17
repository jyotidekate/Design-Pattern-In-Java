package com.abstractfactory;

public class WebDevFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		return new WebDeveloper();
	}

}

 // Yaha se apko ek employee create krna hai or wo employee hoga Web Developer





