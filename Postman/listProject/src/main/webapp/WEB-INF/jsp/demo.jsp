<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<font color="red">${err}</font>
<form method="post">
	<label for="name">First name:</label></br>
	<input type="text" id="name" name="name"><br>
	<label for="lname">Pass:</label><br>
  <input type="text" id="password" name="password"><br><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>