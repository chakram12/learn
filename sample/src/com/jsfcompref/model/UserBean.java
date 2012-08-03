package com.jsfcompref.model;

import java.util.Date;

import javax.annotation.PostConstruct;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import javax.faces.validator.ValidatorException;



import org.apache.log4j.Logger;


@ManagedBean
@RequestScoped
public class UserBean {
	
	

	private static final Logger loginUserLogger = Logger.getLogger(UserBean.class);
	
	
	@PostConstruct
     public void postConstruct(){
		
		loginUserLogger.info("In Post");
     }
	
    
    protected String firstName;
    protected String lastName;
    protected Date dob;
    protected String sex;
    protected String email;
    protected String serviceLevel = "medium";
 
     private String recordStatus;
     
     private String age;
     public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}


	private String name;
     private String job;
     private String zip;
     protected String address;
    
     
   
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getAddress() {
		return address;
	}

	public String getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }
    
    public void validateEmail(FacesContext context, UIComponent toValidate,
            Object value) throws ValidatorException {
    	loginUserLogger.info("In Email Validate");
        String emailStr = (String) value;
        if (-1 == emailStr.indexOf("@")) {
            FacesMessage message = new FacesMessage("Invalid email address");
            throw new ValidatorException(message);
        }
    }

    public String addConfirmedUser() {
	boolean added = true; // actual application may fail to add user
	FacesMessage doneMessage = null;
	String outcome = null;
	if (added) {
	    doneMessage = new FacesMessage("Successfully added new user");
	    outcome = "done";
	} else {
	    doneMessage = new FacesMessage("Failed to add new user");
	    outcome = "register";
	}
        FacesContext.getCurrentInstance().addMessage(null, doneMessage);
        return outcome;
    }
    
    public String store(){
    	
    	if(firstName.equalsIgnoreCase("kumar")||address.equalsIgnoreCase("hyd")){
    		return recordStatus = "sucess";
    	}else{
    		return null;
    	}
		
    	
    }

	
    
}

