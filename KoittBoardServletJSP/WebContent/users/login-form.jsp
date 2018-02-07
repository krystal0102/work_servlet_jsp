<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head><title>로그인</title></head>
<body>
	<h1>로그인 페이지</h1>

	<form action="<c:url value='/UsersServlet' />" method="post">	
		<input type="hidden" name="cmd" value="CMD_LOGIN">
		<label>이 메 일 : <input type="email" name="email"></label><br>
		<label>비밀번호 : <input type="password" name="password"></label><br>
		<input type="submit" value="로그인">
	</form>
	
	<c:if test="${ param.error == 'matches' }">
	<div style="color: #FF0000">존재..하지...않는 사용자이거나 비밀번호가 잘못되었읍니다..ㅠ</div>
	</c:if>
	
</body>
</html>

