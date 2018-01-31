<!-- p.77 -->

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Enumeration"%>		<!-- 자료구조의 일종 -->
<%@ page import="java.util.Map" %>

<%
	// 클라이언트 요청을 utf-8 인코딩 방식으로 읽는다
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<title>요청 파라미터 출력</title>
</head>
<body>
	<b>request.getParameter() 메서드 사용</b><br>
	name 파라미터 = <%= request.getParameter("name") %> <br>
	address 파라미터 = <%= request.getParameter("address") %> <br>
	<p />
	<b>request.getParameterValues() 메서드 사용</b><br>
	<%
		String[] values = request.getParameterValues("pet"); 
		if (values != null) {
				for (int i = 0; i < values.length; i++) {
	%>				
				<%= values[i] %>
	<% 			
				}
		}
	%>
	<p>
	<b>request.getParameterNames() 메서드 사용</b><br>
	<% 
		Enumeration paramEnum = request.getParameterNames();
		// hasMoreElements() 다음 꺼낼 것이 있는지 물어본다
		while(paramEnum.hasMoreElements()) {
			// nextElement() 다음 것을 끄집어 낸다
			String name = (String) paramEnum.nextElement();
	%>	
			<!-- 표현식을 이용해 출력 -->
			<%= name %>		
	<%		
		}	// while문 닫는 중괄호
	%>
	<p>
	<b>request.getParameterMap() 메서드 사용</b><br>
	<%
		// getParameterMap() 전달받은 파라메터들을 Map형태로 제공
		Map<String, String[]> parameterMap = request.getParameterMap();
		
		// name을 key로 가지는 값의 배열을 리턴 받음
		String[] nameParam = (String[]) parameterMap.get("name");
		if (nameParam != null) {
	%>
			<!-- 배열의 0번째 값을 출력 -->
			name =<%= nameParam[0] %>
	<%				
		}
	%>
</body>
</html>