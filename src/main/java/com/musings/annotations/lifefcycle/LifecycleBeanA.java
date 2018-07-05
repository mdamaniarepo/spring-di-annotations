package com.musings.annotations.lifefcycle;

public class LifecycleBeanA {
	
	private LifecycleBeanB lifecycleBeanB;
	
	public void init() {
		System.out.println("post construction of bean B: " + getLifecycleBeanB().toString());
	}
	
	public void destroy() {
		System.out.println("Before destroy...");
	}

	public LifecycleBeanB getLifecycleBeanB() {
		return lifecycleBeanB;
	}

	public void setLifecycleBeanB(LifecycleBeanB lifecycleBeanB) {
		this.lifecycleBeanB = lifecycleBeanB;
	}

}
