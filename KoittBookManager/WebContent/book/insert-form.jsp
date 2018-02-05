<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>도서 정보 등록</title>
</head>
<body>
	<h1>도서 정보를 입력해주세요</h1>
	<a href="<c:url value='/BookServlet?cmd=CMD_LIST' />">도서 목록으로 이동</a>
	
	<form action="<c:url value="/BookServlet" />" method="post">
		<input type="hidden" name="cmd" value="CMD_INSERT">
		<label>제    목 : <input type="text" name="title"></label><br>
		<label>저    자 : <input type="text" name="author"></label><br>
		<label>가    격 : <input type="int" name="price"></label><br>
		<label>출 판 사 : <input type="text" name="publisher"></label><br>
		<label>설    명 : </label><textarea rows="3" cols="50" name="description"></textarea>
		<input type="submit" value="글 등록">
	</form>

</body>
</html>