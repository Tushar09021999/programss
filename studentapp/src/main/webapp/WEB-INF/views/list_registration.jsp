<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import = "java.sql.ResultSet" %>   
 <%@ include file ="menu.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h2>Registration | All Details</h2>
	<table>
	<tr>
		<th>Name</th>
		<th>City</th>
		<th>Email</th>
		<th>Mobile</th>
		<th>Delete</th>
		<th>Update</th>
								
	</tr>
	
	<%
		ResultSet res =(ResultSet)request.getAttribute("res");
		while(res.next())
		{
	%>
	
	<tr>
		<td><%= res.getString(1)%></td>
		<td><%= res.getString(2)%></td>
		<td><%= res.getString(3)%></td>
		<td><%= res.getString(4)%></td>
		<td><a href="delete?email=<%= res.getString(3)%>" onclick="return checkDelete()">delete</a></td>
		<td><a href="update?email=<%= res.getString(3)%>&mobile=<%= res.getString(4)%>" >update</a></td>
	</tr>
	
	
	<%
		}
	%>
		
	</table>
	
<script language="JavaScript" type="text/javascript">
		function checkDelete(){
		    return confirm('Are you sure?');
}
</script>
	
	
	
	

</body>
</html>