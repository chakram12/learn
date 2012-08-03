package com.cg.jsf.cook;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 *
 * @author Anghel Leonard
 */
@ManagedBean
@SessionScoped
public class Person {
	private String name;

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}