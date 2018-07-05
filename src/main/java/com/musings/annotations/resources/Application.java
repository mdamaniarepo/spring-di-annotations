package com.musings.annotations.resources;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		try(AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml")) {
			MyResourcesReader myResourcesReader = context.getBean(MyResourcesReader.class);
			myResourcesReader.printResource();
		}
	}

}
