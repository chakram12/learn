package com.ku.real.hibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetConnection {
	
	
//private static org.hibernate.SessionFactory SessionFactory;
//	private static org.hibernate.cfg.Configuration configuration; 
//	private static org.hibernate.Session se = null;
	

	public static  Session getSessionFactory(){
	
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session se = sf.openSession();
		
		return se;
		
		
//		try{
//		 configuration =  new Configuration();
//			configuration.configure();
//			
//			SessionFactory  = configuration.buildSessionFactory();
//		se=	SessionFactory.openSession();
//		
//		}catch(Throwable e){
//			throw new ExceptionInInitializerError(e);
//		}
//		
//		return se;
//		
	}
	
}
