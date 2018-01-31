<!-- p.135 -->
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	// 쿼리 문자열을 이용하여 name과 value값을 저장 (?name=홍길동&value=30)
	String name = request.getParameter("name");
	String value = request.getParameter("value");
	
	if (name != null && value != null) {
		// application 영역 내에서 사용할 수 있는 key 와 값을 저장
		application.setAttribute(name, value);
		// session.setAttribute(name, value); //이렇게 하면 session영역에서만 동작가능
	}
%>
<!DOCTYPE html>
<html>
<head>
<title>application  속성 지정</title>
</head>
<body>
	 <% 
	 	if (name != null && value != null) {
	 %>
	 		application 기본 객체의 속성 설정:
	 		<%= name %> = <%= value %>
	 <%
	 	} else {
	 %>		
	 		application 기본 객체의 속성 설정 안함
	 <%
	 	}
	 %>		
</body>
</html>