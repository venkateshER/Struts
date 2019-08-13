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
Login SuccessFull
<br>
<a href="index.jsp">signOut</a>
<h1 align="center">All Users</h1>

<table align="center">
<tr>
	<th>Id</th>
	<th>Name</th>
	<th>UpDate</th>
	<th>Delete</th>
</tr>
<s:iterator value="userList" var="user">
	<tr>
		<td><s:property value="id"/>
		<td><s:property value="name"/>
		<!-- <td><a href="update.jsp">Update</a></td> -->
		<!-- <td><a href="deleteUser.jsp">delete</a></td> -->
		<td><a href="update.jsp?id=<s:property value="id"/>">update</a></td>
		<td><a href="delete?id=<s:property value="id"/>">delete</a></td>
	</tr>	
</s:iterator>

</table>
<p align="center">
<a href="user.jsp">Add User</a>
</p>
</body>
</html>