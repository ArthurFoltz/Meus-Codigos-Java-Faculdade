package T2;

public class Vestuario extends Alugavel{

	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public double calculaAluguelDiario() {
		
		if(this.tipo.equalsIgnoreCase("social")) {
			double aux = this.valorAluguelBase * 0.1;
			double aluguel = this.valorAluguelBase + aux;
			return aluguel;
		 }
		   else if(this.tipo.equalsIgnoreCase("gala")) {
			  double aux = this.valorAluguelBase * 0.2;
			  double aluguel = this.valorAluguelBase + aux;
			  return aluguel;
		   }
		   else return valorAluguelBase;
	}
	

	@Override
	public String geraDescricao() {
		String descr = "Nome:" + this.nome + " ; " + "Identificador:" + this.identificador + " ; " + "valorAluguelBase:" + this.valorAluguelBase + " ; " + "Categoria:" + this.tipo;
		return descr;
	}

	public Vestuario(String nome, int identificador, double valorAluguelBase, String tipo) {
		super(nome, identificador, valorAluguelBase);
		this.setTipo(tipo);
	}

}
