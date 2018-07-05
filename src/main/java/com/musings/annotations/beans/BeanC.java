package com.musings.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanC {
	
	private BeanA beanA;

	public BeanA getBeanA() {
		return beanA;
	}

	@Autowired(required=false)
	public void setBeanA(BeanA beanA) {
		this.beanA = beanA;
	}

}
