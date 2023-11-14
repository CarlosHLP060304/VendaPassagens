package entidades;

public class Venda {
	  	private int id_reserva;
	    private Usuario usuario;
	    private String destino;
	    private String tipoDeViagem;
	    private String seguro;
	    private Double valor;
	    
	    
		public int getId_reserva() {
			return id_reserva;
		}
		public void setId_reserva(int id_reserva) {
			this.id_reserva = id_reserva;
		}
		public Usuario getUsuario() {
			return usuario;
		}
		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		public String getDestino() {
			return destino;
		}
		public void setDestino(String destino) {
			this.destino = destino;
		}
		public String getTipoDeViagem() {
			return tipoDeViagem;
		}
		public void setTipoDeViagem(String tipoDeViagem) {
			this.tipoDeViagem = tipoDeViagem;
		}
		public String getSeguro() {
			return seguro;
		}
		public void setSeguro(String seguro) {
			this.seguro = seguro;
		}
		public Double getValor() {
			return valor;
		}
		public void setValor(Double valor) {
			this.valor = valor;
		}
	    
}
