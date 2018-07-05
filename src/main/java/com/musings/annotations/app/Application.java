package com.musings.annotations.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.musings.annotations.beans.BeanA;
import com.musings.annotations.beans.ConstructorBean;

public class Application {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"application-context.xml")) {
			BeanA beanA = applicationContext.getBean("beanA", BeanA.class);
			System.out.println(beanA.getMyString());

			ConstructorBean constructorBean = applicationContext.getBean("contructorBean", ConstructorBean.class);
			System.out.println(constructorBean.getBeanB().getBeanA().getMyString());
			System.out.println(constructorBean.getBeanC().getBeanA().getMyString());
		}

	}

}
