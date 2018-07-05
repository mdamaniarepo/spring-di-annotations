package com.musings.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class ConstructorBean {

	private BeanB beanB;

	private BeanC beanC;

	@Autowired(required=false)
	public ConstructorBean(BeanB beanB) {
		this.beanB = beanB;
	}

	@Autowired(required=false)
	public ConstructorBean(BeanB beanB, BeanC beanC) {
		this.beanB = beanB;
		this.beanC = beanC;
	}

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public BeanC getBeanC() {
		return beanC;
	}

	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}

}
