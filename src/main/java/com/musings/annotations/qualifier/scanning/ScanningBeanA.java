package com.musings.annotations.qualifier.scanning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="scanningBeanB")
public class ScanningBeanA {
	
	@Autowired
	private ScanningBeanB qualifierBeanB;

	public ScanningBeanB getQualifierBeanB() {
		return qualifierBeanB;
	}

	public void setQualifierBeanB(ScanningBeanB qualifierBeanB) {
		this.qualifierBeanB = qualifierBeanB;
	}
}
