<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file ="menu.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Registration | Update</h2>
	<form action="update" method="post">
		email<input type="text" name = "email"  value="<%=request.getAttribute("email") %>"/>
		mobile<input type="text" name = "mobile" value="<%=request.getAttribute("mobile") %>"/>
		<input type="submit" value="update"/>
	</form>

</body>
</html>