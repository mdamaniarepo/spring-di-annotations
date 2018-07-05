package com.musings.annotations.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class QualifierBeanA {
	
	@Autowired
	@Qualifier("magicBean")
	private QualifierBeanB qualifierBeanB;

	public QualifierBeanB getQualifierBeanB() {
		return qualifierBeanB;
	}

	public void setQualifierBeanB(QualifierBeanB qualifierBeanB) {
		this.qualifierBeanB = qualifierBeanB;
	}
}
