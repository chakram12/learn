package com.cg.neustar.uvvu.sample;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.ku.learn.spring.healper.BusinessDeligateHelper;
import com.ku.learn.vo.LoginVo;
import com.ku.real.spring.service.daoi.Loginservice;
@ManagedBean
@RequestScoped
public class UserLoginBean {

	// public LoginUserBean(){
	//		
	// LoginVo lv = new LoginVo();
	// lv.setUserName(user);
	// lv.setPassword(pass);
	// }

	private String user;
	private String pass;
	private String errorMsg;

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	

	
	HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
	
	
	public String doLogin() {

		if (validate()) {

//			 if(user != null && user.equalsIgnoreCase("kumar") && pass != null && pass.equalsIgnoreCase("vayyala")){
//				 
//				 return "success";

			Loginservice ls = (Loginservice) BusinessDeligateHelper.getService("lservice");

			LoginVo lv = new LoginVo();
			lv.setUserName(user);
			lv.setPassword(pass);

			if (ls.login(lv)) {
				
				//String mysession = session.getId();
				//System.out.println(mysession);
				//session.getCreationTime();
				//session.getMaxInactiveInterval();
				
				
				 return "addMember";

			} else {
				setErrorMsg("Invalid UserName/Password");

			}

		}
		return "login";

	}

	private boolean validate() {

		if (user == null || user.equals("")) {
			this.errorMsg = "Please Enter Password";
			return false;
		} else if (pass == null || pass.equals("")) {
			this.errorMsg = "Please Enter Password";
			return false;
		
			
//		} else if (user.length() < 5) {
//			this.errorMsg = " User Name sholuld be 5 charcters";
//			return false;
//
//		} else if (pass.length() < 5) {
//			this.errorMsg = " Password sholuld be 6 charcters";
//			return false;

		} 
//			else if (user.equals(pass)) {
//			this.errorMsg = " User Name and  Password sholuld not be the same ";
//			return false;
//
//		}
		return true;
	}

}//

