package T2;

public class Imovel extends Alugavel{

	private int tamanho;

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public double calculaAluguelDiario() {
		
		double aux = this.valorAluguelBase * 0.001;
		double aux2 = aux * tamanho;
		double aluguel = this.valorAluguelBase + aux2;
		return aluguel;
	}

	@Override
	public String geraDescricao() {
		String descr = "Nome:" + this.nome + " ; " + "Identificador:" + this.identificador + " ; " + "valorAluguelBase:" + this.valorAluguelBase + " ; " + "Tamanho m2:" + this.tamanho;
		return descr;
	}

	public Imovel(String nome, int identificador, double valorAluguelBase, int tamanho) {
		super(nome, identificador, valorAluguelBase);
		this.setTamanho(tamanho);
	}
	
}
