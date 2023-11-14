package entidades;

public class Usuario {
	 	private int id_usuario;
	    private String email;
	    private String senha;
	    private String nome;
	    private String tipoUsuario;
	    
		public Usuario(String email, String senha, String nome, String tipoUsuario) {
			this.email = email;
			this.senha = senha;
			this.nome = nome;
			this.tipoUsuario = tipoUsuario;
		}
		
		public Usuario(int id,String email, String senha, String nome, String tipoUsuario) {
			this.id_usuario = id;
			this.email = email;
			this.senha = senha;
			this.nome = nome;
			this.tipoUsuario = tipoUsuario;
		}


		public int getId_usuario() {
			return id_usuario;
		}

		public void setId_usuario(int id_usuario) {
			this.id_usuario = id_usuario;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTipoUsuario() {
			return tipoUsuario;
		}

		public void setTipoUsuario(String tipoUsuario) {
			this.tipoUsuario = tipoUsuario;
		}
}
