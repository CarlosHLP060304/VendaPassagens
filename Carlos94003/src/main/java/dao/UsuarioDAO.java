package dao;

import java.sql.Connection;

import entidades.Usuario;

public class UsuarioDAO extends ClasseDAO{
	public void cadastrar(Usuario usuario) {
		sql = "insert into java_usuario(id_usuario,email,senha,nome,tipoUsuario) values(id_usuario_sequence.nextval,?,?,?,?)";
		try(Connection conn = conexao.conectar()){
			ps = conn.prepareStatement(sql);
			ps.setString(1,usuario.getEmail());
			ps.setString(2,usuario.getSenha());
			ps.setString(3,usuario.getNome());
			ps.setString(4, usuario.getTipoUsuario());
			ps.execute();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Usuario pesquisarPorEmail(String email) {
		sql = "select * from java_usuario where email = ?";
		Usuario usuario = null;
		try(Connection conn = conexao.conectar()){
			ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				 int id = rs.getInt("id_usuario");
				 String senha = rs.getString("senha");
				 String nome = rs.getString("nome");
				 String tipoUsuario = rs.getString("tipoUsuario");
				 usuario = new Usuario(id,email,senha,nome,tipoUsuario);
			}
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuario;
	}
}
