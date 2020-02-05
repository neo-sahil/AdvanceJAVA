<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		out.print("Welcome "+request.getParameter("name"));
		String driver = application.getInitParameter("dname");
	%>
	<br/><%= "DriverName is "+driver %>
</body>
</html>