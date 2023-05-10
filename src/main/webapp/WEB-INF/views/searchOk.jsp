<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 검색 결과</title>
</head>
<body>
	<h2>회원 이름검색 결과</h2>
	<hr>
	<c:forEach items="${memberDtos}" var="memberDto"><!-- items에 model에서 리스트 타입으로 넘오고 var에서 한개 타입(memberDto)으로 읽는다-->
		학 번 : ${memberDto.hakbun}<br>
		이 름 : ${memberDto.name}<br>
		나 이 : ${memberDto.age}<br>
		학 년 : ${memberDto.grade}<br>
		기 타 : ${memberDto.etc}<br>
		<hr>
	</c:forEach>
</body>
</html>