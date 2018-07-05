package com.musings.annotations.qualifier.scanning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScanningBeanC {
	
	private ScanningBeanB qualifierBeanB;

	public ScanningBeanB getQualifierBeanB() {
		return qualifierBeanB;
	}

	@Autowired
	public void setQualifierBeanB(ScanningBeanB qualifierBeanB) {
		this.qualifierBeanB = qualifierBeanB;
	}

}
