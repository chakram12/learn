package com.ku.real.spring.services;

import com.ku.learn.vo.LoginVo;
import com.ku.real.hibernate.daoi.LoginDaoI;
import com.ku.real.spring.service.daoi.Loginservice;

public class LoginServicebean  implements Loginservice{

	private LoginDaoI ldi;
	
	public LoginServicebean(LoginDaoI ldi){
		this.ldi=ldi;
	}
	
	
	// LoginDaoI ldi = new LoginDao();
//	@Override
//	public boolean login(LoginVo lv) {
//		// TODO Auto-generated method stub
//		
//		 boolean flag =ldi.validateUser(lv);
//		
//		return flag;
			
			
	
	//}


	public boolean login(LoginVo lv) {
		boolean flag =ldi.validateUser(lv);
//		
//		return flag;
		return flag;
	}

}
