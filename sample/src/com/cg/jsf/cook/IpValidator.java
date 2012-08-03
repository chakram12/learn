package com.cg.jsf.cook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator(value ="ipValidator")
public class IpValidator implements Validator{
	
	private static 	final String IP_REGEX = "^([1-9][1-9][0-9] | 1[0-9] []0-9]2[]0-4 [0-9] 25[0-5])(\\.([1-9][0-9] 1[0-9][0-9]2[0-4] [0-9] 25[0-5])) {3}$";
	private static final String value = null; 
	

	public void validate(FacesContext fc, UIComponent ui, Object ob)
			throws ValidatorException {
		// TODO Auto-generated method stub
		
		String ipAddress = (String) value;
	     Pattern mask = null;
	     
	     mask = Pattern.compile(IP_REGEX);
	     Matcher matcher = mask.matcher(ipAddress);
	     
	     if(!matcher.matches()){
	    	 
	    	 FacesMessage message = new FacesMessage();
	    	 
	    	 message.setDetail("ip not valid");
	    	 message.setSummary("ip not valid");
	    	 message.setSeverity(FacesMessage.SEVERITY_ERROR);
	    	 throw new ValidatorException(message);
	     }
	}

}
