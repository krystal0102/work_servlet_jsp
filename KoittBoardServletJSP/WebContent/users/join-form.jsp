<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head><title>회원가입</title></head>
<body>
	<h1>회원가입 페이지</h1>
	
	<!-- HTTP Method 중 post 방식으로 BoardServlet에 정보를 전달 (쿼리문자열을 사용할 수 없음) -->
	<form action="<c:url value='/UsersServlet' />" method="post">	<!-- insert에 해당하는 HTTP Method는 post -->
		<input type="hidden" name="cmd" value="CMD_JOIN">
		<label>이 메 일 : <input type="email" name="email"></label><br>
		<label>비밀번호 : <input type="password" name="password"></label><br>
		<label>비밀번호 확인 : <input type="password" name="password-confirm"></label><br>
		<label>이    름 : <input type="text" name="name"></label><br>
		<input type="submit" value="회원가입하기">
	</form>
	
	<c:if test="${ param.error == 'password' }">
	<div style="color: #FF0000">비밀번호 입력을 다시 확인해주세요</div>
	</c:if>
	
	<c:if test="${ param.error == 'email' }">
	<div style="color: #FF0000">중복된 이메일입니다!!!!!!!!!!!!</div>
	</c:if>
</body>
</html>

