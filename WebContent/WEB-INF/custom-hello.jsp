<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color: blue">
		<%
			String message = (String) request.getAttribute("messageUser");
			out.println(message);
		%>
		</h1>
		<h2>
		<%
			String name = (String) request.getAttribute("nameUser");
			out.println(name);
		%>
		
		<%
			String strAge = (String) request.getAttribute("ageUser");
			out.println(strAge);
		%>
		</h2>
		
		<h3>
		Votre mail :
		<%
			String email = (String) request.getAttribute("mailUser");
			out.println(email);
		%>
		<br>il est : 
		<%
			String time = (String) request.getAttribute("timeUser");
			out.println(time);
		%>
		</h3>
</body>
</html>