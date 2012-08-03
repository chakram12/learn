package com.cg.jsf.cook;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import com.steadystate.css.parser.ParseException;


@FacesConverter(value = "customDateConverterImpl")
public class CustomDateConverterImpl implements Converter {

	public Object getAsObject(FacesContext fc, UIComponent ui, String st) {
		// TODO Auto-generated method stub
		if(fc==null) {
			throw new NullPointerException("context");
			
		}
		if(ui==null){
			throw new NullPointerException("component");
		}
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		
		try{
			Date today = df.parse(st);
			return today;
		}catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,"parser error!" , "cannot parse this date!");
			 throw new ConverterException(message);
			
		}
		
	}

	public String getAsString(FacesContext fc, UIComponent ui, Object ob) {
		// TODO Auto-generated method stub
		if(fc==null) {
			throw new NullPointerException("context");
		}
		if(ui==null){
			throw new NullPointerException("component");
		
		}
		final Date date = (Date) ob;
		String DATE_FORMAT = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		Calendar c1 = Calendar.getInstance(); // today
		c1.setTime(date);
	      return sdf.format(c1.getTime());
	}

	
}
