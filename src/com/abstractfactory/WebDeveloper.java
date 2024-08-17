package com.abstractfactory;

public class WebDeveloper implements Employee {

	@Override
	public int salary() {
		return 40000;
	}

	@Override
	public String name() {
		return "I am web developer";
	}

}



