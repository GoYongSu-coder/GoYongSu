<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>구구단 출력</title>
</head>
<body>
<%-- JSP 주석문입니다  이코드는 서블릿으로 변환할 때 자바 코드로 변하지 않아요. --%>

<%-- 문제 2. 구구단 출력하기 --%>
<h1>구구단</h1>
<div>여기에 구구단이 나오면 됩니다. 줄바꿈을 적용시켜주세요.<br>
<%! int i,j; %>
<% for(i=2; i<10; i++) { 
 	for(j=1; j<10; j++) { %>	
 		<%=i %> * <%= j %> = <%= i*j %> <br> 	
  <%} 
	} %>
</div>
</body>
</html>