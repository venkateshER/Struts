<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Enter the User-Id to Delete 
<s:form action="delete" validate="true" >
	<s:textfield name="id" label="UserId"/>
	<s:submit/>
</s:form>
</body>
</html>