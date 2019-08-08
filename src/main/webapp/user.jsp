<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User details</title>
</head>
<body>
<s:form action="result" validate="true" >
	<s:textfield name="name" label="Name"/>
	<s:textfield name="email" label="Email"/>
	<s:textfield name="age" label ="Age"/>
	<s:password name="password" label ="Password"/>
	<s:submit/>
</s:form>
</body>
</html>