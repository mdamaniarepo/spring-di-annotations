package com.musings.annotations.lifefcycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		try (AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"application-context.xml")) {

			LifecycleBeanA lifecycleBeanA = applicationContext.getBean("lifeCycleBeanA", LifecycleBeanA.class);
			System.out.println(lifecycleBeanA.toString());

			LifecycleAnnotationBean lifecycleAnnotationBean = applicationContext.getBean("lifecycleAnnotationBean",
					LifecycleAnnotationBean.class);
			System.out.println(lifecycleAnnotationBean.toString());
		}
	}

}
