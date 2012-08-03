package com.jsfcompref.model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class InplaceSelectBean {

	private List <String> capitalsOptions = new ArrayList<String> ();
	
	public InplaceSelectBean(){
		capitalsOptions.add("hyderaba");
		capitalsOptions.add("karnataka");
		capitalsOptions.add("Delhi");
	}

	public List<String> getCapitalsOptions() {
		return capitalsOptions;
	}

	public void setCapitalsOptions(List<String> capitalsOptions) {
		this.capitalsOptions = capitalsOptions;
	}
}
