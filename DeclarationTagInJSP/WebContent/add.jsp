<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		int x=5;
	%>
	<%
		int a = Integer.parseInt(request.getParameter("a"));
	 	int b = Integer.parseInt(request.getParameter("b"));
	 	
	 	int k = (a+b)*x;
	 	
	 	out.print("Answere is "+k);
	%>
</body>
</html>