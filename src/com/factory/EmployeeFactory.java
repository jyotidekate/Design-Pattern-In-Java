package com.factory;

public class EmployeeFactory {
	
	// get the employee (this method will return the employee)
	public static Employee getEmployee(String empType) {
		if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
			return new AndroidDeveloper();
		}
		else if(empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
			return new WebDeveloper();
		}
		else {
			return null;
		}
	}

}

// String empType -> means which employee you want, if you write/ pass AndroidDeveloper than you'll get/ return the object of AndroidDeveloper
// First do trim matlab aage piche space dale ho for that & because it is String that's why first we'll do trim()
// Object ko create krna & parameter ko accept krne ki ye sari responsibilty EmployeeFactory class ki hai. Jo ki unknow hai client 
// ke nazar me ie., DeveloperClient
