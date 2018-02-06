<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>도서 상세 정보</title>
</head>
<body>
	<table>
		<tr>
			<th>번    호</th>
			<td>${ requestScope.book.isbn }</td>
		</tr>
		<tr>
			<th>제    목</th>
			<td>${ requestScope.book.title }</td>
		</tr>
		<tr>
			<th>저    자</th>
			<td>${ requestScope.book.author }</td>
		</tr>
		<tr>
			<th>출 판 사</th>
			<td>${ requestScope.book.publisher }</td>
		</tr>
		<tr>
			<th>가    격</th>
			<td>${ requestScope.book.price }</td>
		</tr>
		<tr>
			<th>설    명</th>
			<td>${ requestScope.book.description }</td>
		</tr>
		
	</table>
	
	<a href="<c:url value='/book/delete-confirm.jsp?isbn=${ requestScope.book.isbn }' />">
		삭제하기
	</a>
	
	&nbsp;
	
	<a href="<c:url value='/BookServlet?cmd=CMD_UPDATE_FORM&isbn=${ requestScope.book.isbn }'/>">
		수정하기
	</a>
	
	&nbsp;
	
	<a href="BookServlet?cmd=CMD_LIST">도서 목록으로 이동</a>
</body>
</html>