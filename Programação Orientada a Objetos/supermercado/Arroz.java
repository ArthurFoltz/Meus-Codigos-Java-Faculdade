package supermercado;

public class Arroz extends Produto {

	// atributos
	private int kilos;

	// set get
	public int getKilos() {
		return kilos;
	}

	public void setKilos(int kilos) throws PesoInvalidoArrozException{
		// o supermercado contem apenas estes pesos de arroz em estoque
		if(kilos == 1 || kilos == 2 || kilos == 5 || kilos== 10) {
			this.kilos = kilos;
		}
		else throw new PesoInvalidoArrozException();
	}

	// metodos
	@Override
	public double calculaPreco() {
		if (this.kilos == 1) {
			return 5;
		} else if (this.kilos == 2) {
			return 7.50;
		} else if (this.kilos == 5) {
			return 10;
		} else if (this.kilos == 10) {
			return 18;
		}
		return -1;
	}

	//construtor
	public Arroz(String marca, int identificador, int kilos) throws PesoInvalidoArrozException{
		super(marca, identificador);
		this.kilos = kilos;
	}

	@Override
	public String geraDescricao() {
		String descr = "Nome:" + this.marca + " ; " + "Kilos:" + this.kilos + " ; " + "ID:" + this.identificador;
		return descr;
	}


}
