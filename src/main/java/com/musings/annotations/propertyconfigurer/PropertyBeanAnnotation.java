package com.musings.annotations.propertyconfigurer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("propertyAnnotationBean")
public class PropertyBeanAnnotation extends PropertyBean {

	@Value("${spring.course.name}")
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Value("${spring.course.duration}")
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Value("${spring.course.inprogress}")
	public void setInprogress(boolean inprogress) {
		this.inprogress = inprogress;
	}

}
