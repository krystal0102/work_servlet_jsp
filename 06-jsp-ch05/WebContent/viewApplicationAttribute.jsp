<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import= "java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<title>application 기본 객체 속성 보기</title>
</head>
<body>
<%
	Enumeration<String> attrEnum = session.getAttributeNames();
	while (attrEnum.hasMoreElements()) {
		String name = attrEnum.nextElement();
		Object value = session.getAttribute(name);
	
%>
	application 속성 : <b><%= name %></b> = <%= value %> <br> <!-- value는 object니까 출력할때 toString()이 출력됨 -->

<%
	}
%>	
</body>
</html>