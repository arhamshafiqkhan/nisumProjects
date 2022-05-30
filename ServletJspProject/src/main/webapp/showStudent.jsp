<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.arham.web.model.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>

<body bgcolor="lightgreen">
	
	<%
		Student student = (Student) request.getAttribute("Student");
		out.println(student.toString());
	%>

</body>

</html>