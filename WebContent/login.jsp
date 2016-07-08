<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="CSS/bootstrap.min.css">
	<title>Login</title>
</head>
<body>
	<div class="row">
		<div class="col-sm-3 col-md-4">
			
		</div>
		<div class="col-xs-12 col-sm-6 col-md-4">
			<form action="actionlogin" method="post">
				<h4>Login to your account to access information</h4>
				<input type="text" name="username" class="form-group form-control" placeholder="username" required="">
				<input type="password" name="password" class="form-group form-control"  placeholder="password" required="">
				<input type="submit" value="Login" class="form-group form-control btn-success">
			</form>
			
		</div>
		<div class="col-sm-3 col-md-4">
			
		</div>
	</div>
	<script type="text/javascript" src="script/bootstrap.min.js"></script>
</body>
</html>