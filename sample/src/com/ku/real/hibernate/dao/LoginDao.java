package com.ku.real.hibernate.dao;

//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;


import org.hibernate.Query;
import org.hibernate.Session;

import com.ku.learn.hibernate.persistence.AccountUser;
import com.ku.learn.vo.LoginVo;
import com.ku.real.hibernate.daoi.LoginDaoI;
import com.ku.real.hibernate.utils.GetConnection;


public class LoginDao implements LoginDaoI {


	
	public boolean validateUser(LoginVo lv) {
		
		//String uname=lv.getUserName();
		//String pass=lv.getPassword();
		
		AccountUser au = new AccountUser();
		au.setUserName(lv.getUserName());
		au.setGivenname(lv.getPassword());
		
//		if(uname.equals("kumar")&&pass.equals("vayyala")){
//			return true;
//		}else{
//			return false;
//		}
		
		// if u don't have hibernate connection use this code other wise use above hibernate cpode 
		
		 //to get the hibernate session 
		Session se = GetConnection.getSessionFactory();
		String hql = "FROM AccountUser u WHERE u.userName='" + au.getUserName() + "'and u.givenname='"+au.getGivenname()+"'";
		//String hql = "FROM User u WHERE u.uname='" +uname+ "'and u.pass='"+pass+"'";
		System.out.println(hql);
		Query q = se.createQuery(hql);
        Object o = q.uniqueResult();	
        System.out.println(o);
		if(o!=null){
        	return true;
        }
		return false;
        	
        }
	
		
		
	}


