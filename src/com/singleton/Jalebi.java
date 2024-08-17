package com.singleton;

// Early Instantiation -

public class Jalebi {
	
	// Eager way of creating singleton object
	private static Jalebi jalebi = new Jalebi();
	
	public static Jalebi getJalebi() {
		return jalebi;
	}

}

// Early ka matlab ye hai ki hum yahi pr object create krenge ek hi bar me ie., private static Jalebi jalebi = new Jalebi();












