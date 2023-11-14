<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Sistema de Controle</h1>
	<form action="./login">
		<label>Email do passageiro</label>
		<input name = "email">
		<label>Região de Destino</label>
		<select name = "regiao">
			<option>Sul</option>
			<option>Sudeste</option>
			<option>Centro-Oeste</option>
			<option>Norte</option>
			<option>Nordeste</option>
		</select>
		<button>Pesquisar Passageiro</button>
		<button type="button">Pesquisar Venda</button>
		<button type="button">Listar</button>
	</form>
</body>
</html>