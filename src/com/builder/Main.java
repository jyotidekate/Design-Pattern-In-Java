package com.builder;

public class Main {

	public static void main(String[] args) {
		// this is method chaining
		User user = new User.UserBuilder()
				.setEmailId("jyoti@gmail.com")
				.setUserId("USERID123")
				.setUserName("Jyoti")
				.build();
		
		System.out.println(user);
		
		// If you want to use static ya fir koi factory method than apko new object krne ki need nahi hai
		User user2 = User.UserBuilder.getBuilder()
				.setEmailId("pooja@gmail.com")
				.setUserId("USERID12345")
				.setUserName("Pooja")
				.build();
		
		System.out.println(user2);
	}
}
