<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student</title>
</head>
<body>
<h3>Update existing Student</h3>
<form action="updateStudent" method="post">
	<input type="text" name="RollNo" required> <br/><br/>
	<input type="text" name="StudentName" required> <br/><br/>
	<input type="text" name="ClassName" required> <br/><br/>
	<input type="submit">
</form>
</body>
</html>