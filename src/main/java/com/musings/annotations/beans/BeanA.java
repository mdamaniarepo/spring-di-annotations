package com.musings.annotations.beans;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class BeanA {
	
	private String myString;

	public String getMyString() {
		return myString;
	}

	@Required
	@Value("Test 1")
	public void setMyString(String myString) {
		this.myString = myString;
	}
	
}
