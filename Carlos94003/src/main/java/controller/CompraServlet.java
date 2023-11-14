package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entidades.*;
import dao.UsuarioDAO;
import dao.VendaDAO;
import entidades.Usuario;

/**
 * Servlet implementation class CompraServlet
 */
@WebServlet("/compra")
public class CompraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 Usuario usuario =(Usuario)request.getAttribute("usuario");
		 System.out.println(usuario);
		 String destino = request.getParameter("destino");
		 String tipo = request.getParameter("tipo");
		 String seguro = request.getParameter("seguro");
		 Venda venda = new Venda();
		 venda.setDestino(destino);
		 venda.setUsuario(usuario);
		 venda.setTipoDeViagem(tipo);
		 venda.setSeguro(seguro);
		 double preco = 0;
		 switch(destino) {
		 	case "Norte":
		 		preco = 500;
		 		if(tipo.equals("Ida e volta")) {
		 			preco = 900;
		 		}
		 	case "Sul":
		 		preco = 300;
		 		if(tipo.equals("Ida e volta")) {
		 			preco = 550;
		 		}
		 	case "Nordeste":
		 		preco = 350;
		 		if(tipo.equals("Ida e volta")) {
		 			preco = 650;
		 		}
		 	case "Centro-Oeste":
		 		preco = 300;
		 		if(tipo.equals("Ida e volta")) {
		 			preco = 600;
		 		}
		 }
		 if(seguro.equals("sim")) {
			preco*=1.15; 
		 }
		 venda.setValor(preco);
		 
		 new VendaDAO().cadastrar(venda);
		 
		 response.sendRedirect("login.jsp");
		 
	} 
}
