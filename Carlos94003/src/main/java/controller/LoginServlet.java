package controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UsuarioDAO;
import entidades.Usuario;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		Usuario usuario = new UsuarioDAO().pesquisarPorEmail(email);
		if(usuario != null) {
			if(senha.equals(usuario.getSenha())) {
				if(usuario.getTipoUsuario().equals("administrativo")) {
					response.sendRedirect("funcionario.jsp");
				}else {
					HttpSession session = request.getSession();
					session.setAttribute("usuario", usuario);
					request.getRequestDispatcher("venda_passagens.jsp").forward(request, response);
				}				
			}else {
				response.sendRedirect("login.jsp");
				System.out.println("Senha incorreta!!!");
			}
		}
	}

}
