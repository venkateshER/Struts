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
<s:form action="update" validate="true" >
<%-- <% 
String ss =request.getParameter("id");
System.out.println("my value" + ss);
%> --%>
	
	
	<%-- <s:property value="%{#parameters.id}" /> --%>
	<%-- <s:textfield name="id"  label="Id"/> --%>
	<%-- <s:property value="id"/> --%>
	<%-- <s:set name = "id" value = "7"/> --%>
	<%-- <s:select label = "Id" name = "id"
            value = "%{#parameters.id}" list="%{#parameters.id}"/> --%>
            <s:textfield label = "Id" name = "id"
            value = "%{#parameters.id}"/>
	<s:textfield name="name" label="Name"/>
	<s:submit/>
</s:form>
</body>
</html>