<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>
로그인 데이터 확인</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String em1 = request.getParameter("user1");
	String em2 = request.getParameter("user2");
	String em3 = request.getParameter("user3");
//request.setCharacterEncoding("utf-8"); ex2에 form에서 get를 사용하면 언어패킷 상관 없다.
%>
<%=em1 %>@<%=em2 %><br>
<%= em3 %>
</body>
</html>