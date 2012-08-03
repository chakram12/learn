package com.cg.jsf.cook;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CarBean {
	private Integer carNumber;
	private String carName;
	
	public CarBean(Integer carNumber, String carName){
		this.carNumber = carNumber;
		this.carName = carName;
	}
	
	
	public Integer getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(Integer carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

}
