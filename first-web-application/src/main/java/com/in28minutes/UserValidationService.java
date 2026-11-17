package com.in28minutes;

public class UserValidationService {

	public boolean isValidUser(String user, String password) {
		if (user.equals("nama") && password.equals("pass")) {
			return true;
		}
		return false;
	}

}
