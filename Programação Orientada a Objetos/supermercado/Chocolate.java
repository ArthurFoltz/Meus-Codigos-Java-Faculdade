package supermercado;

public class Chocolate extends Produto {

	// atributos
	private int peso;

	// get set
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) throws PesoInvalidoChocolateException {
		// o supermercado contem apenas estes pesos de chocolate em estoque
		if (peso == 150 || peso == 300 || peso == 500) {
			this.peso = peso;
		} else
			throw new PesoInvalidoChocolateException();
	}

	// metodos
	@Override
	public double calculaPreco() {
		if (this.peso == 150) {
			return 2.50;
		} else if (this.peso == 300) {
			return 4.50;
		} else if (this.peso == 500) {
			return 6.50;
		}
		return -1;

	}

	// construtor
	public Chocolate(String marca, int identificador, int peso) throws PesoInvalidoChocolateException{
		super(marca, identificador);
		this.peso = peso;
	}

	@Override
	public String geraDescricao() {
		String descr = "Nome:" + this.marca + " ; " + "Peso:" + this.peso + " ; " + "ID:" + this.identificador;
		return descr;
	}


}
