package com.musings.annotations.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml")) {
			
			// qualifier using the value attribute and xml qualifier tag
			QualifierBeanA beanA = context.getBean("qualifierBeanA", QualifierBeanA.class);
			System.out.println(beanA.getQualifierBeanB().getMyString());
			
			// qualifier using the default beanId
			QualifierBeanC beanC = context.getBean("qualifierBeanC", QualifierBeanC.class);
			System.out.println(beanC.getQualifierBeanB().getMyString());
			
			// qualifier using annotation
			QualifierBeanD beanD = context.getBean("qualifierBeanD", QualifierBeanD.class);
			System.out.println(beanD.getQualifierBeanB().getMyString());
		}
	}

}
