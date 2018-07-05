package com.musings.annotations.lifefcycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("lifecycleAnnotationBean")
public class LifecycleAnnotationBean {
	
	@Autowired
	private LifecycleBeanB lifecycleBeanB;
	
	@PostConstruct
	public void init() {
		System.out.println("post construction of bean B: " + getLifecycleBeanB().toString());
	}
	
	@PreDestroy
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
