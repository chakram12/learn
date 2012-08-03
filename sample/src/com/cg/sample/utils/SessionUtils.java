package com.cg.sample.utils;


	import java.util.Locale;


	import javax.faces.context.FacesContext;
	import javax.servlet.http.HttpSession;

	

	public class SessionUtils {	
		private HttpSession session = null;	
//		private ResourceBundle labelsBundle ;
//		private ResourceBundle errorsBundle;	
//		private ResourceBundle labelsTxtsBundle;
//		private ResourceBundle errorTxtsBundle;
		
//		public SessionUtils(){
//			FacesContext appContext=FacesContext.getCurrentInstance();
//			if(null!=appContext){
//				labelsTxtsBundle=ResourceBundle.getBundle("biz.neustar.dece.decessp.i18n.labelTxts",appContext.getViewRoot().getLocale());
//				errorTxtsBundle= ResourceBundle.getBundle("biz.neustar.dece.decessp.i18n.errorTxts",appContext.getViewRoot().getLocale());		
//			}
//			
//		  }	
//		public ResourceBundle getLabelsTxtsBundle() {
//			return labelsTxtsBundle;
//		}
//		public void setLabelsTxtsBundle(ResourceBundle labelsTxtsBundle) {
//			this.labelsTxtsBundle = labelsTxtsBundle;
//		}
//		public ResourceBundle getErrorTxtsBundle() {
//			return errorTxtsBundle;
//		}
//		public void setErrorTxtsBundle(ResourceBundle errorTxtsBundle) {
//			this.errorTxtsBundle = errorTxtsBundle;
//		}
//		public ResourceBundle getLabelsBundle() {
//			return labelsBundle;
//		}
//		public void setLabelsBundle(ResourceBundle labelsBundle) {
//			this.labelsBundle = labelsBundle;
//		}
//		public ResourceBundle getErrorsBundle() {
//			return errorsBundle;
//		}
//		public void setErrorsBundle(ResourceBundle errorsBundle) {
//			this.errorsBundle = errorsBundle;
//		}	
//		public HttpSession getSession() {
//			if (session == null) session = (HttpSession)FacesContext.getCurrentInstance(). getExternalContext().getSession(false);
//			return session;
//		}
//		public String getUserId() {
//			return  (((UserAuthDVO) getSession().getAttribute("Auth"))==null?null:((UserAuthDVO) getSession().getAttribute("Auth")).getNodeUserId());
//		}
//		public String getAccountId() {
//			return  (((UserAuthDVO) getSession().getAttribute("Auth"))==null?null:((UserAuthDVO) getSession().getAttribute("Auth")).getNodeAccountId());
//		}
//		
//		public UserPrivilege getUserPrivilege() {
//			return(UserPrivilege) (((UserSignInDVO) getSession().getAttribute("Signin"))==null?null:((UserSignInDVO) getSession().getAttribute("Signin")).getPrivilege());
//		}
//		public UserAuthDVO getUserAuth() {
//			return ((UserAuthDVO) getSession().getAttribute("Auth"));
//		}
//		public void setUserAuth(UserAuthDVO uAuth) {
//			getSession().setAttribute("Auth", uAuth);
//		}	
//		public Locale getLocale(){
//			Locale locale = new Locale("en_US", "US");
//			if(getSession().getAttribute("userLocale") != null)
//				locale = (Locale)getSession().getAttribute("userLocale");
//			return locale;
//		}

		/**
		 * Commented lines in the method as the locale.getLanguage() returns value like en-us instead en-US expected by API.
		 * Method used for getting loggedIn user locale language Code.
		 * return type used to pass to Service API 
		 * @return languageCode
		 */
		public String getLanguageCode(){
			String languageCode = "en-US";
//			Locale locale = new Locale("en-US", "US");
//			if(getSession().getAttribute("userLocale") != null){
//				locale = (Locale)getSession().getAttribute("userLocale");
//				languageCode = locale.getLanguage();
//			}
			return languageCode;
		}
		public HttpSession getSession() {
			return session;
		}
		public void setSession(HttpSession session) {
			this.session = session;
		}
		/**
		 * Method used for getting loggedIn user locale country code.
		 * return type used to pass to Service API 
		 * @return countryCode
		 */
		public String getCountryCode(){
			String countryCode = "US";
			Locale locale = new Locale("en-US", "US");
			if(getSession().getAttribute("userLocale") != null){
				locale = (Locale)getSession().getAttribute("userLocale");
				countryCode = locale.getCountry();
			}
			return countryCode;
		}	
		public void localeSet(String selectedLocale){		
			Locale locale = null;
			if("en-us".equalsIgnoreCase(selectedLocale))
				locale = new Locale("en", "US");
			else if("fr-fr".equalsIgnoreCase(selectedLocale))
				locale = new Locale("fr", "FR");
			else if("en-uk".equalsIgnoreCase(selectedLocale))
				locale = new Locale("en", "GB");
			else if("english".equalsIgnoreCase(selectedLocale))
				locale = new Locale("en", "US");
			else if("french".equalsIgnoreCase(selectedLocale))
				locale = new Locale("fr", "FR");
			else if("japanese".equalsIgnoreCase(selectedLocale))
				locale = new Locale("ja", "JP");
			else if("revisedLbls".equalsIgnoreCase(selectedLocale))
				locale = new Locale("en", "GB");
			else 
				locale = new Locale("en", "US");
			getSession().setAttribute("userLocale", locale);
			//System.out.println("Locale value: "+locale.getDisplayName().toString());
			FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
		}
	}



