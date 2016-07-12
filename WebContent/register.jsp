<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Register</title>
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
	<div class="row">
		<div class="col-sm-3 col-md-4">
			
		</div>
		<div class="col-xs-12 col-sm-6 col-md-4">
			<form action="actionregister" method="post">
				<h4>Register to join us.</h4>
				<input type="text" name="username" class="form-group form-control" placeholder="username" required="">
				<input type="text" name="email" class="form-group form-control" placeholder="email" required="">
				<input type="text" name="role" class="form-group form-control" placeholder="role" required="">
				<input type="password" name="password" class="form-group form-control"  placeholder="password" required="">
				<input type="password" class="form-group form-control"  placeholder="confirm password" required="">
				<input type="submit" value="Register" class="form-group form-control btn-success">
			</form>
			
		</div>
		<div class="col-sm-3 col-md-4">
			
		</div>
	</div>
	<script type="text/javascript" src="script/bootstrap.min.js"></script>
</body>
</html>