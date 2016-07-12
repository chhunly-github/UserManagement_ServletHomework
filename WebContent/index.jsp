<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Home</title>
	<%session.setAttribute("sender", "");
		System.out.println(session.getAttribute("sender"));
	%>
</head>
<body>
	<h1>Main Page</h1>
	<%-- <jsp:include page="Data/usertable.jsp"> --%>
	<form action="actionupdate" method="post">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>USERNAME</th>
					<th>EMAIL</th>
					<th>ROLE</th>
					<th>ACTION</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach var="user" items="${requestScope.users }">
					<tr>
						<td>${user.id }</td>
						<td>${user.username}</td>
						<td>${user.email }</td>
						<td>${user.role }</td>
						<td><a href="update?id=${user.id }">update</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>