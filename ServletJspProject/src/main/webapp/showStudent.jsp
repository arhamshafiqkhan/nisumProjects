<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.arham.web.model.Student"%>
<%@ page import="java.util.Objects"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>

<body bgcolor="lightblue">
<h2>Student Details: </h2> <br/><br/>
	
	<%
		Student student = (Student) request.getAttribute("Student");
		if(Objects.nonNull(student.getStudentName())) {
			out.println(student.toString());
		}
		else {
			out.println("Student does not exist!");
		}
	%>

</body>

</html>