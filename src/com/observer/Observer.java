package com.observer;

public interface Observer {

	void notified(String title);
	
}

// Observer will having one imp method 
// Jaise hi Subject state update krenga apne aap se this void notified(); method will get call

