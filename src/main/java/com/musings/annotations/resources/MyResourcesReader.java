package com.musings.annotations.resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class MyResourcesReader {

	//@Value("https://www.google.com")
	//@Value("classpath:application-context.xml")
	@Value("file:D:\\Musings\\Spring\\Spring-Practice-Workspace\\spring-di-annotations\\src\\main\\resources\\application-context.xml")
	private Resource resource;

	public void printResource() {
		System.out.println(resource.getClass().getName());

		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
			for (String line = bufferedReader.readLine(); line != null; line = bufferedReader
					.readLine()) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
