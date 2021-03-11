
<%@page import="com.jbk.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.ArrayList" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% ArrayList<Employee> userlist=(ArrayList<Employee>)request.getAttribute("list"); %>

<%

String msg=(String)request.getAttribute("msg");
if(msg!=null){
out.println(msg);
}
%>
	
	<center>
	<h2>User List</h2>
	
	<table border="1">
	
	
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Salary</th>
		<th>Experience</th>
		<th>Action</th>
	</tr>
	<%
	
	for(Employee user:userlist)
	{
		
	
	
	%>
	<tr>
		<td><%out.println(user.getEid()); %></td>
		<td><%out.println(user.getUsername()); %></td>
		<td><%out.println(user.getSalary()); %></td>
		<td><%out.println(user.getExperience()); %></td>
		<td>
		
		<a href="updateuser?id=<%=user.getEid() %>">Update</a>
		<a href="deleteuser?id=<%=user.getEid() %>">Delete</a></td>
	</tr>
	<%
	}
	%>
	</table>
	<a href="adduser">Add User</a>
	</center>
	
</body>
</html>