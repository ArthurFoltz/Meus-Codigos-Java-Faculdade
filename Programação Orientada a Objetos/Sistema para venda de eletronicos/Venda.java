package trabalho1melhor;

public class Venda {


	private int codigo;

	private String comprador;

	private Computador computador;
	
	/////////////////////////////////////////////////////////

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getComprador() {
		return comprador;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}

	public Computador getComputador() {
		return computador;
	}

	public void setComputador(Computador computador) {
		this.computador = computador;
	}
	
	/////////////////////////////////////////////////////////////
	
	public Venda(int codigo, String comprador, Computador computador) {
		this.codigo = codigo;
		this.comprador = comprador;
		this.computador = computador;
	}
	
	@Override
	public String toString() {
		return "Codigo: " + this.codigo + ", Comprador: " + this.comprador +
			   ", Computador: " + this.computador;
	}

}
