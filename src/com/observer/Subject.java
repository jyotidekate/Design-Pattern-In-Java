package com.observer;

public interface Subject {

	void subscribe(Observer ob);
	void unsubscribe(Observer ob);
	void newVideoUploaded(String title);  // matlab agar ap kuch video upload karo to notify ho jaye
	
}

// It'll have 3 imp methods 
// Subject ka matlab hai isko ko subscribe kr sake ya unsubscribe kr sake 
// & notification ke liye hoga ki bhaiya ye notify kr le ie., changes notify kr sake