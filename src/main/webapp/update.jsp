<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update UserName</title>
</head>
<body>
<s:form action="username" validate="true" >
	<s:textfield name="id" label="Id"/>
	<s:textfield name="name" label="Name"/>
	<s:submit/>
</s:form>
</body>
</html>