<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>UXP-SYSTEMS ASSIGNMENT</title>
</head>
<body>
	<h1>Welcome to UXP-Systems</h1>
	<form:form method="post" modelAttribute="user"
		action="${pageContext.request.contextPath}/addUser">
		<h2>Add Customer</h2>
		<table border="1">
			<tr>
				<form:hidden path="id" />
				<td><form:label path="username">Username:</form:label></td>
				<td><form:input path="username"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="password">Password:</form:label></td>
				<td><form:input path="password"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="status">Status:</form:label></td>
				<td>
					<form:select path="status">
						<form:options items="${statusList}"/>
					</form:select>
				</td>
			</tr>
		</table>
		<br>
		<input type="submit" />
		<br>
	</form:form>
	<c:if test="${!empty listOfUsers}">
		<h2>User Information</h2>
		<table border="1">
			<tr>
				<th>Id</th>
				<th>Username</th>
				<th>Password</th>
				<th>Status</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach items="${listOfUsers}" var="user">
				<tr>
					<td>${user.id}</td>
					<td>${user.username}</td>
					<td>${user.password}</td>
					<td>${user.status}</td>
					<td><a href="<c:url value='/updateUser/${user.id}' />">Edit
							User</a></td>
					<td><a href="<c:url value='/deleteUser/${user.id}' />">Delete
							User</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>