<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<title></title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<center>

		<h1>Edit Employee</h1>
		<form:form method="POST" action="/SpringMVCCRUD/editsave">
			<table>
				<tr>
					<td></td>
					<td><form:hidden path="id" /></td>
				</tr>
				<tr>
					<td>Name :</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Salary :</td>
					<td><form:input path="salary" /></td>
				</tr>
				<tr>
					<td>Designation :</td>
					<td><form:input path="designation" /></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Edit Save" /></td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>
