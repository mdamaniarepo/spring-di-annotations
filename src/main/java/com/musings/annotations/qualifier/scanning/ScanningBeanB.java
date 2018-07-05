package com.musings.annotations.qualifier.scanning;

import org.springframework.stereotype.Service;

@Service("scanningBeanB")
public class ScanningBeanB {

	private String myString;

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}

}
