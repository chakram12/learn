package com.cg.neustar.uvvu.sample;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;




@ManagedBean
@RequestScoped
public class TestBean  {
	
	/**
	 * 
	 */
	


	
	private String name ="kumar";
	
	
	

	public String method1(){
		
		name ="vayyala";
		
		return "maintestpage";
		
		
		
	}
	

public String method2(){
	
	name ="kumarvayyala";
		
		return "maintestpage";
		
		
		
	}


public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}


}
