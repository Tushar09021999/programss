<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<div>
		<h2> Login here...</h2>
		<form action = "verifyLogin"  method = "post">
			email<input type="text" name = "email" />
			password<input type="password" name = "password" />
   			<input type="submit" name = "login" />
   		</form>
	</div>
	
	<div>
		<%
		if(request.getAttribute("errorMsg")!=null)
		{
			out.println(request.getAttribute("errorMsg"));
			
		}
		
		%>
	
	</div>
	
	


</body>
</html>