<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
	xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<head>
<title>Greetings!</title>
</head>
<body style="background-color: #c1c1c1;">
	<center>
		<h1>Welcome!</h1>

		<a href="@{/welcome}"><button>Login</button></a>

	</center>
</body>
</html>