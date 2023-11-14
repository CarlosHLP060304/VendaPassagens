package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conexao.Conexao;

public abstract class ClasseDAO {
	Conexao conexao;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	
	public ClasseDAO() {
		conexao = new Conexao();
	}
}
