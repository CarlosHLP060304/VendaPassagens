<%@page import="entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Venda de Passagens</h1>
	<form action="./compra" method="post">
		<%Usuario usuario = (Usuario)request.getAttribute("usuario");%>
		<p>Seja bem-vindo(a) <%=usuario.getNome()%></p>
		<label>Região de Destino</label>
		<select name = "destino">
			<option>Sul</option>
			<option>Sudeste</option>
			<option>Centro-Oeste</option>
			<option>Norte</option>
			<option>Nordeste</option>
		</select>
		<fieldset>
			<legend>Tipo de viagem</legend>
			<label>Ida e volta</label>
			<input type="radio" name="tipo" value= "Ida e volta">
			<label>Ida</label>
			<input type="radio" name="tipo" value = "Ida">		
		</fieldset>
		<fieldset>
			<legend>Incluir seguro?</legend>
			<label>Sim</label>
			<input type="radio" name = "seguro" value= "sim">
			<label>Não</label>
			<input type="radio" name= "seguro" value="nao">		
		</fieldset>
		<button>Comprar</button>
	</form>
	
</body>
</html>