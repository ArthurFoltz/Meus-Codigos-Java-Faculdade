package T2;

public abstract class Alugavel {

	protected String nome;

	protected int identificador;

	protected double valorAluguelBase;

	public Alugavel(String nome, int identificador, double valorAluguelBase) {
         this.setNome(nome);
         this.setIdentificador(identificador);
         this.setValorAluguelBase(valorAluguelBase);
	}

	public abstract double calculaAluguelDiario();

	public abstract String geraDescricao();
	
	public int getIdentificador() {
		return identificador;
	}

	public String getNome() {
		return nome;
	}

	public double getValorAluguelBase() {
		return valorAluguelBase;
	}

	public void setValorAluguelBase(double valorAluguelBase) {
		this.valorAluguelBase = valorAluguelBase;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
   
	
}
