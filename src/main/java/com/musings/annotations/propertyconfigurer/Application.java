package com.musings.annotations.propertyconfigurer;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml")) {
			PropertyBean propertyBean = context.getBean("propertyBean", PropertyBean.class);
			System.out.println(propertyBean.getCourseName());
			System.out.println(propertyBean.getDuration());
			System.out.println(propertyBean.isInprogress());
			
			PropertyBeanAnnotation propertyBeanAnnotation = context.getBean("propertyAnnotationBean", PropertyBeanAnnotation.class);
			System.out.println(propertyBeanAnnotation.getCourseName());
			System.out.println(propertyBeanAnnotation.getDuration());
			System.out.println(propertyBeanAnnotation.isInprogress());
		}
	}

}
