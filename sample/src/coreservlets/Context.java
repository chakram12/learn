package coreservlets;

import javax.faces.bean.*;
import javax.faces.context.*;

/** From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF 1.x, JSF 2.0, Ajax, 
 *  GWT, Spring, Hibernate/JPA, and Java programming</a>.
 */

@ManagedBean
@ApplicationScoped
public class Context {
  public String getPath() {
    ExternalContext context =
      FacesContext.getCurrentInstance().getExternalContext();
    return(context.getRequestContextPath());
  }

}