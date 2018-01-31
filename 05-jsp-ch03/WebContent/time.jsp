<!-- p.62 -->

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces= "true" %> <!-- 불필요한 공백을 지워줌 -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>현재 시간</title>
</head>
<body>
현재 시각: <%= new java.util.Date() %>
</body>
</html>