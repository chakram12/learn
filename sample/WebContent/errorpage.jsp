<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

   <%@taglib uri ="http://java.sun.com/jsf/html" prefix="h"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">




<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h:panelGrid>
    <h:outputText value="The follow error occured:" />
    <h:inputTextarea style="width: 100%;" rows="20" readonly="true" value="#{error.stackTrace}" />
</h:panelGrid>
</body>
</html>