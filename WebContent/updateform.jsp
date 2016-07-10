<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
	<c:set var="user" value="${requestScope.user }"></c:set>
	<div class="container">
		<div class="col-xs-12 col-sm-6 col-md-5">
			<form action="" class="form-group">
				<label class="form-label">Username</label><input type="text" class="form-control" name="username" value="${user.username }">
				<label class="form-label">E-mail</label><input type="text" class="form-control" name="email" value="${user.email }">
				<label class="form-label">role</label><input type="text" class="form-control" name="role" value="${user.role }">
				<label class="form-label">old password</label><input type="password" class="form-control" name="oldpassword">
				<label class="form-label">new password</label><input type="password" class="form-control" name="newpassword">
				<input type="submit" class="form-control btn-success" value="Update">
			</form>
		</div>
		
	</div>
	
</body>
</html>