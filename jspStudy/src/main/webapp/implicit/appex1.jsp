<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration"%>
<html>
<head>
<title>초기화 파라미터 읽어오기</title>
</head>
<body>
	초기화파라미터 목록:
	<ul>
		<%
		Enumeration enumData = application.getInitParameterNames();
		while (enumData.hasMoreElements()) {
			String initParamName = (String) enumData.nextElement();
		%>
		<li><%=initParamName%> = <%= application.getInitParameter(initParamName)%>
			<%
			}
			%>
	</ul>
</body>
</html>