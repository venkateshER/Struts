<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<s:form action="dashBoard" validte="true" >
	<s:textfield name="email" label="Email"/>
	<s:password name="password" label ="Password"/>
	<s:submit/>
</s:form>
<a href="forgotPassword.jsp">forgotPassword?</a>
</body>
</html>