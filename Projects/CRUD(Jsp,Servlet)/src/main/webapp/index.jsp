<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP CRUD</title>
</head>
<style>
body{
background: #f6f8e6;
}
h1{
text-align:center;
}
ul {
  list-style-type: none;
  margin: 10px;
  padding: 20px;
  overflow: hidden;
  background-color: #4a148c;
}

li {
  float: right;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-style:italic;
}

li a:hover {
  background-color: black;
}
table{
background:#e4cbe5;
padding:20px;
height:300px;
width:500px;
font-family:cursive;

}
div{
height:300px;
width:200px;
padding:20px;
margin-right:250px;
}


</style>
</head>
<body>
<ul>
<li> <a href="viewusers.jsp">Edit User</a>  </li>
<li><a href="viewusers.jsp">View Users</a>  </li>
  <li><a href="deleteuser.jsp">Delete user</a></li>
 
</ul>


 <center>
 <h1 style="color:slateblue;" >Add New User</h1>  
  <div>
<form action="adduser.jsp" method="post" id="form1">  
<table>  
<tr><td>Name:</td><td>
<input type="text" name="name" id="name" placeholder="enter your name" required /></td></tr>  
<tr><td>Password:</td><td>  
<input type="password" name="password" id="pass" placeholder="enter your password "  required/></td></tr>  
<tr><td>Email:</td><td>
<input type="email" name="email" id="email" placeholder="enter your email" required /></td></tr>  
<tr><td>Sex:</td><td>  
<input type="radio" name="sex" value="male"/  required>Male   
<input type="radio" name="sex" value="female"/>Female </td></tr>  
<tr><td>Country:</td><td>  
<select name="country" style="width:155px" required>  
<option>India</option>  
<option>Pakistan</option>  
<option>Afghanistan</option>  
<option>Berma</option>  
<option>Other</option>  
</select>  
</td></tr>  
<tr><td colspan="2"><input  type="submit" value="Add User"  /></td></tr> 
 
</table>  

</div>
</center>

</form> 

</body>
</html>
