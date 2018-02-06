<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>도서 정보 수정 페이지</title>
</head>
<body>
	<h1>도서 정보 수정 페이지</h1>
	<a href="<c:url value='/BookServlet?cmd=CMD_LIST' />">도서목록으로 이동</a>
	
	<form action="<c:url value='/BookServlet' />" method="post">
	
		<input type="hidden" name="cmd" value="CMD_UPDATE">
		
		<input type="hidden" name="isbn" value="${ requestScope.book.isbn }">
		
		<div>번    호 : ${ requestScope.book.isbn }</div>
		
		<label>제    목 : <input type="text" name="title" value="${ requestScope.book.title }"></label><br>
		
		<label>저    자 : <input type="text" name="author" value="${ requestScope.book.author }"></label><br>
		
		<label>출 판 사 : <input type="text" name="publisher" value="${ requestScope.book.publisher }"></label><br>
		
		<label>가    격 : <input type="number" name="price" value="${ requestScope.book.price }"></label><br>
		
		<label>설    명 : </label>
		<textarea rows="3" cols="50" name="description">${ requestScope.book.description }</textarea>
		<br>
		
		<input type="submit" value="도서 정보 수정">
	</form>
</body>
</html>