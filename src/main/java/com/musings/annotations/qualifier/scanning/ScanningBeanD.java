package com.musings.annotations.qualifier.scanning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScanningBeanD {
	
	@Autowired
	private ScanningBeanB qualifierBeanB;

	public ScanningBeanB getQualifierBeanB() {
		return qualifierBeanB;
	}

	public void setQualifierBeanB(ScanningBeanB qualifierBeanB) {
		this.qualifierBeanB = qualifierBeanB;
	}

}
