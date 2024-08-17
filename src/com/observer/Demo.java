package com.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//YoutubeChannel channel = new YoutubeChannel();
		Subject channel = new YoutubeChannel();
		
		// Ab is YoutubeChannel ko Subscribe krne ke liye humare pass subscriber hone chahiye
		Subscriber aman = new Subscriber("Aman");
		//Subscriber raman = new Subscriber("Raman");
		Observer raman = new Subscriber("Raman");
		
		// Aman has subscribe the channel
		channel.subscribe(aman);
		channel.subscribe(raman);
		
		// Jab bhi channel pe koi video upload hogi -> ie., matlab state change ho jana
		// Isse kya hoga ki aman ka jo method hai ie., notified() wo excute hoga
		channel.newVideoUploaded("Learn Design Pattern");
		channel.newVideoUploaded("New Angular Course");
		
		//========================================================================================
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1 to upload video ");
			System.out.println("Press 2 create new subscriber");
			System.out.println("Press 3 to exit");
			
			int c = Integer.parseInt(br.readLine()); // here we get choice 
			if(c==1) {
				// new video upload code
				System.out.println("Enter video title");
				String videoTitle = br.readLine();
				channel.newVideoUploaded(videoTitle);
			}else if(c==2) {
				// create new subscriber code
				System.out.println("Enter name of subscriber : ");
				String subsName = br.readLine();
				//Subscriber subscriber2 = new Subscriber(subsName);
				Observer subscriber2 = new Subscriber(subsName);
				channel.subscribe(subscriber2);
			}else if(c==3){
				// exit code 
				System.out.println("Thank you for using app");
				break;
			}else {
				// exit wrong input code
				System.out.println("Wrong input");
			}
		}
		
	}

}
