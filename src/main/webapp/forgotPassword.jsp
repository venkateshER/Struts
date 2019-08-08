<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ForgotPassword</title>
</head>
<body>
<s:form action="forgot" validate="true" >
	<s:textfield name="email" label="Email"/>
	<s:password name="password" label="Password"/>
	<s:password name="confirmPassword" label="ConfirmPassword"/>
	<s:submit/>
</s:form>
</body>
</html>