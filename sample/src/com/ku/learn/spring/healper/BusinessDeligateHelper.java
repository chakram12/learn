package com.ku.learn.spring.healper;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BusinessDeligateHelper {

	private static BeanFactory bf;
	
	public static Object getService(String servicename){
		
		if(bf==null){
			ClassPathResource res =  new ClassPathResource("spring-cfg.xml");
			bf = new XmlBeanFactory(res);
		}
		
		Object service = bf.getBean(servicename);
		
		return service;
		
		
		
	}
	
	
	
	
	
	
}//
