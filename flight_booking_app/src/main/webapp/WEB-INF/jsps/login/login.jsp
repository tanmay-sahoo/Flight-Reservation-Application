<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h2>Login Here</h2>
	<form action="verifyLogin" method="post">
	<pre>
		Email Id: <input type="text" name="email" />
		
		Password: <Input type="password" name="password" />
		
		${error}
				  
				  <input type="submit" value="login" />
	</pre>
	</form>
</body>
</html>