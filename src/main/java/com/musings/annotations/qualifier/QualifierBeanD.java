package com.musings.annotations.qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class QualifierBeanD {
	
	@Autowired
	@MagicBean
	private QualifierBeanB qualifierBeanB;

	public QualifierBeanB getQualifierBeanB() {
		return qualifierBeanB;
	}

	public void setQualifierBeanB(QualifierBeanB qualifierBeanB) {
		this.qualifierBeanB = qualifierBeanB;
	}

}
