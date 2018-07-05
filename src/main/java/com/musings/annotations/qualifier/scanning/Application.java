package com.musings.annotations.qualifier.scanning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml")) {
			
			// qualifier using the value attribute and xml qualifier tag
			ScanningBeanA beanA = context.getBean(ScanningBeanA.class);
			System.out.println(beanA.getQualifierBeanB().getMyString());
			
			// qualifier using the default beanId
			ScanningBeanC beanC = context.getBean(ScanningBeanC.class);
			System.out.println(beanC.getQualifierBeanB().getMyString());
			
			// qualifier using annotation
			ScanningBeanD beanD = context.getBean(ScanningBeanD.class);
			System.out.println(beanD.getQualifierBeanB().getMyString());
		}
	}

}
