<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student List</title>
<link rel="stylesheet"
	href="/schoolmanagementapp/URLToReachResourceFolder/css/student-lise-css.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Quicksand:wght@700&display=swap">
</head>
<body>
	<header>
		<h1 align="center">List of the Students....</h1>
	</header>
	<div align="center">
		<table border="1">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Mobile No</th>
					<th>Country</th>
					<th>Update</th>
					<th>Delete</th>
				</tr>
			</thead>
			<a:forEach var="student" items="${students}">
				<tbody>
					<tr>
						<td>${student.id}</td>
						<td>${student.name}</td>
						<td>${student.mobile}</td>
						<td>${student.country}</td>
						<td>
							<button class="update-button"
								onclick="updateStudent(${student.id})">Update</button>
						</td>
						<script>
    						function updateStudent(userId) {
       								var url = '/schoolmanagementapp/updatestudent?userId=' + userId;
									window.location.href = url;
								}
						</script>

						<td>
							<button class="delete-button"
								onclick="deleteStudent(${student.id})">Delete</button>
						</td>
						<script>
    						function deleteStudent(userId) {
        						if (confirm('Are you sure you want to delete this student?')) {
            						var url = '/schoolmanagementapp/deletestudent?userId=' + userId;
            						window.location.href = url;
            					}
        					}
						</script>
					</tr>
				</tbody>
			</a:forEach>
		</table>
	</div>
</body>
</html>
