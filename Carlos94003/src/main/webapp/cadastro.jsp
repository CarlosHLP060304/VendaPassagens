<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Cadastro de Passageiros</h1>
	<form action="./cadastro" method="post">
		<label>Nome</label>
		<input name = "nome">
		<label>Email</label>
		<input name = "email">
		<label>Senha</label>
		<input name = "senha">
		<button>Cadastrar</button>
	</form>
</body>
</html>