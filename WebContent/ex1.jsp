<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>JSP 자기소개</title>
</head>
<body>
<%-- JSP 주석문입니다  이코드는 서블릿으로 변환할 때 자바 코드로 변하지 않아요. --%>

<%-- 문제 1. 변수 선언하고 출력하기 --%>
<% //int age = 500;
//String name = "홍길동";
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
%>
<h1>자기소개</h1>
<div>안녕하세요 저는 <%= age %>살 <%= name %>입니다.</div>
</body>
</html>