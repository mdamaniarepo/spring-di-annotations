package com.musings.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanB {

	@Autowired(required=false)
	private BeanA beanA;

	public BeanA getBeanA() {
		return beanA;
	}

	public void setBeanA(BeanA beanA) {
		this.beanA = beanA;
	}

}
