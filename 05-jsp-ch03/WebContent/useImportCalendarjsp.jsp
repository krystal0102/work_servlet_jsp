<!-- p.60 -->

<!--  %를 사용한 부분이 JSP를 사용한것 -->
<!-- Directive 디렉티브: JSP페이지에 대한 설정 정보를 지정할 때 사용 -->
<%@ page contentType="text/html; charset=UTF-8"%>	<!-- page directive / contentType은 Attribute(속성)임 -->
<%@ page import="java.util.Calendar"%>				<!-- page directive -->
<!DOCTYPE html>
<html>
<head>
<title>Calendar 클래스 사용</title>
</head>
<body>
<!-- 스크립트릿(scriptlet): 자바코드를 작성하는 부분-->
<%
	Calendar cal = Calendar.getInstance();
%>
	오늘은
	<!-- 표현식(expression): <% out.println(); %> 대신에 <%= %> 로 간단하게 쓸 수 있다 -->
	<%= cal.get(Calendar.YEAR) %>년				<!-- <% out.println(cal.get(Calendar.YEAR)); %>와 같음  -->
	<%= cal.get(Calendar.MONTH) +1 %>월
	<%= cal.get(Calendar.DATE) %>일 입니다.

</body>
</html>