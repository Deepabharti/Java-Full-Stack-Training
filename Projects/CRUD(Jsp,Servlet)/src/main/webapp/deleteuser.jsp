<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="dao.userDao"%>  
<jsp:useBean id="u" class="bean.user"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
userDao.delete(u);  
response.sendRedirect("deleteuserform.jsp");  
%>
</body>
</html>