package com.builder;

public class User {

	private final String userId;
	private final String userName;
	private final String emailId;
	
	private User(UserBuilder builder) {
		// initialize -> dusri builder class ki help se isko initialize krenge cuz kahi na kahi we hv to create the object 
		this.userId = builder.userId;
		this.userName = builder.userName;
		this.emailId = builder.emailId;
	}

	public String getUserId() {
		return userId;
	}
	
	public String getUserName() {
		return userName;
	}

	public String getEmailId() {
		return emailId;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + "]";
		//return this.userName + " : " + this.userId + " : " + this.emailId;
	}

	// inner class to create object
	static class UserBuilder{

		private String userId;
		private String userName;
		private String emailId;
		
		public UserBuilder() {
			
		}
		
		// In case of static method
		public static UserBuilder getBuilder() {
			return new UserBuilder();
		}
		
		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}
		
		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		
		public UserBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
		}
	
	}

}

// we'll not create it's setter jisse ki hum iske object pr data set na kr paye, only we'll make it's getter jisse ke ye fields badme 
// na change ho paye bs ek bar hi ap change krlo & we have use final keyword cuz iss object me hum ek hi bar data dalege at initial tym
// if we call build() than automatically humara User object build hoga ie., User object mil jayega
// yaha pr hume immutability mil jayege ie., object ki value change nahi kr payege


