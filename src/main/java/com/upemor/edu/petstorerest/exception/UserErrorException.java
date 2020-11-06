package com.upemor.edu.petstorerest.exception;


import com.upemor.edu.petstorerest.model.User;

public class UserErrorException extends User {
	
	private String errorMsg;
	
	public UserErrorException(final String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	public String getErrorMsg() {
		return errorMsg;
	}

}