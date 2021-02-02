<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.error {
	color: "red"
}
</style>
<title>Insert title here</title>
</head>
<body>
	<h2>Create Account</h2>
	<form:form action="createAccount" modelAttribute="createAccountObj">
UserName : <form:input path="uname" type="text" name="uname"
			value="Name" />
		<form:errors path="uname" cssClass="error"></form:errors>
		<br />  
		
Email Id :<form:input path="email" type="text" name="email"
			value="Email" />
		<form:errors path="email" cssClass="error"></form:errors>
		<br />  
Password : <form:input path="pass" type="password" name="pass"
			value="Password" />
		<form:errors path="pass" cssClass="error"></form:errors>
		<br />
		<input type="submit" value="createAccount" />
	</form:form>
</body>
</html>