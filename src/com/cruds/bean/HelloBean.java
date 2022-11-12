package com.cruds.bean;

public class HelloBean {

	private String message;
	
	public HelloBean()
	{
		System.out.println("Inside Hello Bean Const");
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
