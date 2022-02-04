package supermercado;

public abstract class Produto {
	
	//atributos
	protected String marca;
	
	protected int identificador;
	
	
	//metodos
	public abstract double calculaPreco();
	
	public abstract String geraDescricao();
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	
	//construtor
	public Produto(String marca, int identificador) {
		super();
		this.marca = marca;
		this.identificador = identificador;
	}

	@Override
	public String toString() {
		return "Produto [marca=" + marca + ", identificador=" + identificador + "]";
	}

	

	
	

}
