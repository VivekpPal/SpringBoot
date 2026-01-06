<%@page import="com.example.demo.entity.Login"%>
<%@ page import="java.lang.Iterable" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is success page</h1>

<%Iterable<Login> loginList=(Iterable<Login>)request.getAttribute("LoginData"); %>

<%for(Login login:loginList){ %>
<%=login.getId() %>
<%=login.getUsername() %>
<%=login.getPassword() %>
<%} %>

</body>
</html>