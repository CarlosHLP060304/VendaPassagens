<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login</h1>
	<form action="./login" method="post">
		<label>Email</label>
		<input name="email">
		<label>Senha</label>
		<input name="senha">
		<button>Logar</button>
		<a href="./cadastro.jsp"><button type="button">Ainda não sou cadastrado</button></a>
	</form>
</body>
</html>