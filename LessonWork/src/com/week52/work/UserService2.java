package com.week52.work;

public class UserService2 {
	public User createUser (String username, String password, String name) {
		User user = new User();
		user.setName("Bennett");
		user.setUserName("Bhammock");
		user.setPassword("ABC123");
		return user;
	}
}
