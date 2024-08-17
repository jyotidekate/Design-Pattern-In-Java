package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
	
	private String ip;
	private String importantData;
	private List<String> domain = new ArrayList<String>(); // domain -> reference & new ArrayList<String>(); -> object 
	// That's mean ki inside NetworkConnection we are having another object/ ya second object ka reference hai or jab hum copy krege 
	// to wo reference copy hoga
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getImportantData() {
		return importantData;
	}
	
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	
	public List<String> getDomain() {
		return domain;
	}

	public void setDomain(List<String> domain) {
		this.domain = domain;
	}

	public void loadVeryImportantData() throws InterruptedException {
		this.importantData = "Very very important data";
		domain.add("www.google.com");
		domain.add("www.facebook.com");
		domain.add("www.instagram.com");
		domain.add("www.telegram.com");
		Thread.sleep(5000);
		// suppose it'll take 5 minutes to load [We don't want jab bhi hum har bar object cretae krre to ye 5 min na le]
	}

	@Override
	public String toString() {
		//return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + "]";
		return this.ip + " : " + this.importantData + " : " + this.domain;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// logic for cloning
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp(this.getIp());
		networkConnection.setImportantData(this.getImportantData());
		for(String d : this.getDomain()) {
			networkConnection.getDomain().add(d);
		}
		return networkConnection;
	}
	
}
