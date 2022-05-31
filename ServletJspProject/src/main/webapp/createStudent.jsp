<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.arham.web.model.Student"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Student</title>
</head>
<body bgcolor="lightblue">
<div align="center" style="height:800px; width:700px; background-color:blue; align:center; margin:50px auto 0 auto;">
	<div align="center" style="background-color:#00FFFF; height:750px; width:600px; margin-top:50px;">
	<h3>Add a new student</h3>

	<form action="createStudent" method="post">
	<table>
	<tr>
	<td>Roll Number</td>
	<td><input type="number" name="RollNo" required></td>
	</tr>

	<tr>
	<td>Student Name</td>
	<td><input type="text" name="StudentName" required></td>
	</tr>

	<tr>
	<td>Student Class</td>
	<td><input type="text" name="ClassName" required></td>
	</tr>

	<tr>
	<td></td>
	<td><input style="color:blue; " type="submit" required> </td>
	</tr>
	</table>
	</form>
	</div>
</div>
</body>
</html>