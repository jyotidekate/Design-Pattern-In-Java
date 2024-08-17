package com.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Samosa samosa = Samosa.getSamosa();
		System.out.println(samosa.hashCode());
		
		Samosa samosa1 = Samosa.getSamosa();
		System.out.println(samosa1.hashCode());
		
		System.out.println(Jalebi.getJalebi().hashCode());
		System.out.println(Jalebi.getJalebi().hashCode());
		
		System.out.println("=== 3 Ways to break singleton pattern ===");
		
		System.out.println("1. Reflection API");
		
		// We can easily create first object but not second for that we need 
		Samosa s1 = Samosa.getSamosa();
		System.out.println(s1.hashCode());
		
		// enum Samosa1
		/*
		 * Samosa1 object = Samosa1.INSTANCE; System.out.println(object.hashCode());
		 * object.test();
		 */

		// second object
		Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor(); // From here we get constructor object reference
		constructor.setAccessible(true);
		Samosa s2 = constructor.newInstance(); // Iske help se hum object creat kr skte hai second 
		System.out.println(s2.hashCode());
		
		System.out.println("2. Deserialize");
		
		Samosa obj1 = Samosa.getSamosa();
		System.out.println(obj1.hashCode());
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
		oos.writeObject(obj1);
		System.out.println("Serialization is done...");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
		Samosa obj2 = (Samosa) ois.readObject();
		System.out.println(obj2.hashCode());
		
		System.out.println("3. Cloning");
		
		Samosa obj3 = Samosa.getSamosa();
		System.out.println(obj3.hashCode());
		
		Samosa obj4 = (Samosa) samosa.clone();
		System.out.println(obj4.hashCode());
		
	}
	
}
 
// Agar hashCode dono object ka same aaya matlab dono object same hai

// To use reflection api we need to load class (ie., Samosa)  


























