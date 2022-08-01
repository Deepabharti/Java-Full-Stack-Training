<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html lang="en">  
  <head>  
     <title>view page</title>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>  
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  </head>  
  <body>  
  
<div class="container">  

	<center><h1>Employees List</h1></center><br>
	<table border="2" width="70%" cellpadding="2" class="table table-hover">
	<thead class="thead-dark">
	<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th><th>Edit</th><th>Delete</th></tr>
   </thead>
    <c:forEach var="emp" items="${list}"> 
    <tr>
    <td>${emp.id}</td>
    <td>${emp.name}</td>
    <td>${emp.salary}</td>
    <td>${emp.designation}</td>
    <td><a href="editemp/${emp.id}">Edit</a></td>
    <td><a href="deleteemp/${emp.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
   <center> <a href="empform" class="btn btn-info btn-primary btn-lg" role="button">Add New Employee</a>
   </center> </div>  
  
    </body>  
</html>  