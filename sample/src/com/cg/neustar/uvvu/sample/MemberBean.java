package com.cg.neustar.uvvu.sample;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
@ManagedBean
@RequestScoped
public class MemberBean {
	
	public MemberBean(){
		HttpSession session=(HttpSession)FacesContext.getCurrentInstance(). getExternalContext().getSession(true);
		Object profiles = session.getAttribute("memberprofiles");
		
		this.lmv = (List<MemberVO>)profiles;
		
	}
	
	
	private String displayName;
	private MemberVO profileDetails;
	
	private List<MemberVO> lmv ;

	private  MemberVO mv = new MemberVO();
		
	
	public String getDisplayName() {
		return displayName;
	}


	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	public MemberVO getProfileDetails() {
		return profileDetails;
	}


	public void setProfileDetails(MemberVO profileDetails) {
		this.profileDetails = profileDetails;
	}

	
	 
	public MemberVO getMv() {
		return mv;
	}

	public void setMv(MemberVO mv) {
		this.mv = mv;
	}
	
	 public List<MemberVO> getLmv() {
			return lmv;
		}

	public void setLmv(List<MemberVO> lmv) {
			this.lmv = lmv;
		}

	public String addProfile(){
		
		
		HttpSession session=(HttpSession)FacesContext.getCurrentInstance(). getExternalContext().getSession(true);
		Object profiles = session.getAttribute("memberprofiles");
		if(profiles==null){
			lmv = new ArrayList<MemberVO>();
			lmv.add(mv);
		}else{
			lmv = (List<MemberVO>)profiles;
			lmv.add(mv);
		}
		//lmv =null;
		session.setAttribute("memberprofiles", lmv);
	   	
		
		return "valid";

		
		
	}
	public String showProfile(){
		System.out.println("************from show profile");
		HttpSession session=(HttpSession)FacesContext.getCurrentInstance(). getExternalContext().getSession(true);
		Object userProfile =session.getAttribute("memberprofiles");
		//userProfile = null;
		List<MemberVO> ulmv;
		ulmv = (List<MemberVO>)userProfile;
		for( MemberVO up:ulmv){
			if(up.getDisplayName().equals(displayName)){
				profileDetails = up;
				break;
			}
			System.out.println("from show profile");
			}
		return "userProfilePage";
	}

}
