package dao;

import java.sql.Connection;

import entidades.Venda;

public class VendaDAO extends ClasseDAO{

	public void cadastrar(Venda venda) {
		sql = "insert into java_reserva values(id_reserva_sequence.nextval,?,?,?,?)";
		try(Connection conn = conexao.conectar()){
			ps = conn.prepareStatement(sql);
			ps.setInt(1,venda.getUsuario().getId_usuario());
			ps.setString(2,venda.getDestino());
			ps.setString(3,venda.getTipoDeViagem());
			ps.setString(4,venda.getSeguro());
			ps.setDouble(5,venda.getValor());
			ps.execute();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
