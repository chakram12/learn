package coreservlets;

import javax.faces.bean.*;

/** From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF 1.x, JSF 2.0, Ajax, 
 *  GWT, Spring, Hibernate/JPA, and Java programming</a>.
 */

@ManagedBean 
public class NumGenerator {
  public double getRandomNum() {
    return(Math.random());
  }
}
