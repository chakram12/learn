package coreservlets;

import javax.faces.application.FacesMessage;
import javax.faces.bean.*;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
@RequestScoped
public class RegistrationBean {
  private String firstName,middleName, lastName,employeeId;
  private Integer buildingNumber;
  
  public String getFirstName() {
    return(firstName);
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public String getMiddleName() {
    return(middleName);
  }
  
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }
  
  public String getLastName() {
    return(lastName);
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public String getEmployeeId() {
    return(employeeId);
  }
  
  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }
  
  public Integer getBuildingNumber() {
    return(buildingNumber);
  }
  
  public void setBuildingNumber(Integer buildingNumber) {
    this.buildingNumber = buildingNumber;
  }
  
  public String doRegistration() {
    return("confirm-registration");
  }
  
  
  public void validateBuilding(FacesContext context,UIComponent componentToValidate,Object value) throws ValidatorException {
    int building = ((Integer)value).intValue();
    if ((building < 1) || (building > 50)) {
      FacesMessage message = new FacesMessage("Building number must be between 1 and 50");
      throw new ValidatorException(message);
    }
    if ((building == 3) || (building == 17) || (building == 41)) {
      FacesMessage message =
        new FacesMessage("Building " + building +" was destroyed in an earthquake");
      throw new ValidatorException(message);
    }
  }
}
