<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Users</title>  
</head>  
<style>
body{
background:#ebe4de;
}
header{
background:#3b66a9;
margin:20px;
padding:15px;
}
#user {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 90%;
  margin:40px;
  
}

#user td, #user th {
  border: 1px solid #ddd;
  padding: 8px;
}

#user tr:nth-child(even){background-color: #f2f2f2;}

#user tr:hover {background-color: #ddd;}

#user th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #506ab5;
  color: white;
}

</style>
<body>  
  
<%@page import=" dao.userDao,bean.user ,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  <header>
<center><h1 style="color:white">Users List</h1>  </center>
  </header>
<%  
List<user> list=userDao.getAllRecords();  
request.setAttribute("list",list);  
%>  
  
<table border="1" width="90%" id="user">  
<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th>  
<th>Sex</th><th>Country</th><th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${list}" var="u">  
<tr><td>${u.getId()}</td><td>${u.getName()}</td><td>${u.getPassword()}</td>  
<td>${u.getEmail()}</td><td>${u.getSex()}</td><td>${u.getCountry()}</td>  
<td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>  
<td><a href="deleteuser.jsp?id=${u.getId()}">Delete</a></td></tr>  
</c:forEach>  
</table>  
<footer>
<center><a href="index.jsp">Add New User</a>  
</center></footer>
  
</body>  
</html>  