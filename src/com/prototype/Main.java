package com.prototype;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Creating object using prototype design");
		
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp("192.168.4.4");
		networkConnection.loadVeryImportantData();
		
		// We want new object of NetworkConnection
		// ye hume ek object return krke dega
		try {
			NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
			NetworkConnection networkConnection3 = (NetworkConnection) networkConnection2.clone();
			//NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
			
			System.out.println(networkConnection);
			
			networkConnection.getDomain().remove(0);
			
			System.out.println(networkConnection);
			
			System.out.println(networkConnection2);
			System.out.println(networkConnection3);
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

// I don't want to excute the complex logic again while creating another object because that complex logic is taking time (for example
// 5 minutes. See jab first tym object create hua tha to complex logic bhi excute hua tha usne tab already 5 min liye the but second 
// tym i don't want ki wo fir se 5 min le or complex logic ko excuet krre object create krte tym fir se
// see hume already object mil chuka hai ab jab hume second object create krna hai tab hum us object ka clone create kr skte hai (phle 
// object ka)
// So how we can do that - first jis class ka object create krna hai in that class implements Cloneable
// see networkConnection2 me hume abhi koi bhi importantData load nahi kiya hai 
// In short phle object ko create hone me tym lgra hai cuz of complex code (ie., load hora hai) we have written & second object 
// directly create hora hai cuz hum clone krre hai 