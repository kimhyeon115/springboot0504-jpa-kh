<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴</title>
</head>
<body>
	<h2>회원 탈퇴</h2>
	<hr>
	<form action="deleteOk">
		탈퇴 학번 : <input type="text" name="hakbun">
		<input type="submit" value="탈퇴">
	</form>
	<form action="deleteOk2">
		탈퇴 이름 : <input type="text" name="name">
		<input type="submit" value="탈퇴">
	</form>
</body>
</html>