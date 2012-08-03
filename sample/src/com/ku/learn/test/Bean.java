package com.ku.learn.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Bean {
	
	private String values = "kumar";

	public String getValues() {
		return values;
	}

	public void setValues(String values) {
		this.values = values;
	}

}
