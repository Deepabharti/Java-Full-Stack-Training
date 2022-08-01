<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
header
{
color:#4a148c;
}
table{
background:mistyrose;
padding:20px;
height:300px;
width:500px;
font-family:cursive;

}



</style>
<%@page import="dao.userDao,bean.user"%>  
  
<%  
String id=request.getParameter("id");  
 user u=userDao.getRecordById(Integer.parseInt(id));  
%>  
  <center>
<header><h1>Edit Form</h1>  </header>
<form action="edituser.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getId() %>"/>  
<table>  
<tr><td>Name:</td><td>  
<input type="text" name="name" value="<%= u.getName()%>"/></td></tr>  
<tr><td>Password:</td><td>  
<input type="password" name="password" value="<%= u.getPassword()%>"/></td></tr>  
<tr><td>Email:</td><td>  
<input type="email" name="email" value="<%= u.getEmail()%>"/></td></tr>  
<tr><td>Sex:</td><td>  
<input type="radio" name="sex" value="male"/>Male   
<input type="radio" name="sex" value="female"/>Female </td></tr> 
<tr><td>Country:</td><td>  
<select name="country">  
<option>India</option>  
<option>Pakistan</option>  
<option>Afghanistan</option>  
<option>Berma</option>  
<option>Other</option>  
</select>  
</td></tr>  
<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>  
</table>  
</form>   
</center>
</body>
</html>