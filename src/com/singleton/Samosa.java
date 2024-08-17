package com.singleton;

import java.io.Serializable;

// Lazy Instantiation -

public class Samosa implements Serializable, Cloneable{
	
	private static Samosa samosa;
	
	// Constructor
	private Samosa() {
		/*
		 * if(samosa != null) { throw new
		 * RuntimeException("You are trying to break singleton pattern"); }
		 */
	}
	
	/*
	// Lazy way of creating single object
	public static Samosa getSamosa() {
		// Object of this class
		// if(samosa == null) ie., agar samosa ki value null hai that's mean ki iske undar object nahi hia than we'll creat new object
		if(samosa == null) {
			samosa =  new Samosa();
		}
		return samosa;
	}
	*/
	
	// In case of multi thread use this synchronized block 
	public static Samosa getSamosa() {
		if(samosa == null) {
			synchronized (Samosa.class) {
				if(samosa == null) {
					samosa = new Samosa();
				}
			}
		}
		return samosa;
	}
	
	public Object readResolve() {
		return samosa;
	}
	
	/*
	 * @Override public Object clone()throws CloneNotSupportedException { return
	 * super.clone(); }
	 */

	@Override
	public Object clone() {
		return samosa;
	}
}





















