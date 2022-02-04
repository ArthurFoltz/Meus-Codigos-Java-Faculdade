package supermercado;

public class Leite extends Produto {

	// atributos
	private int litros;

	// get set
	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) throws LitragemInvalidaLeiteException {
		// o supermercado contem apenas esses leites em estoque
		if (litros == 1.50 || litros == 2.50 || litros == 5) {
			this.litros = litros;
		} else
			throw new LitragemInvalidaLeiteException();
	}

	// metodos
	@Override
	public double calculaPreco() {
		if (this.litros == 1) {
			return 1.50;
		} else if (this.litros == 2) {
			return 2.50;
		} else if (this.litros == 4) {
			return 5;
		}
		return -1;
	}

	// construtor
	public Leite(String marca, int identificador, int litros) throws LitragemInvalidaLeiteException{
		super(marca, identificador);
		this.litros = litros;
	}

	@Override
	public String geraDescricao() {
		String descr = "Nome:" + this.marca + " ; " + "Litros:" + this.litros + " ; " + "ID:" + this.identificador;
		return descr;
	}


}
