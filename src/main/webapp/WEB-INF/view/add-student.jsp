<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/schoolmanagementapp/URLToReachResourceFolder/css/SaveStudent.css">
    <title>Add Student</title>
</head>
<body>
    <div class="registration-form">
        <h1>Admission Form</h1>
        <form:form action="save-student" modelAttribute="student" method="post">
        	<form:hidden path="id" />
            <p>Student Name</p>
            <form:input path="name" />
            <p>Student Mobile</p>
            <form:input path="mobile" />	
            <p>County</p>
            <form:input path="country" />
            <button type="submit">Admit</button>
        </form:form>
    </div>
</body>
</html>
