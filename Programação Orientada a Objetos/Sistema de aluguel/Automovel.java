package T2;

public class Automovel extends Alugavel{

	private String categoria;

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

	@Override
	public double calculaAluguelDiario() {
		
	   if(this.categoria.equalsIgnoreCase("SEDAN")) {
		double aux = this.valorAluguelBase * 0.05;
		double aluguel = this.valorAluguelBase + aux; 
		return aluguel;
	 }
	   else if(this.categoria.equalsIgnoreCase("SUV")) {
		  double aux = this.valorAluguelBase * 0.15;
		  double aluguel = this.valorAluguelBase + aux;
		  return aluguel;
	   }
	   else return valorAluguelBase;
	}

	@Override
	public String geraDescricao() {
	  String descr = "Nome:" + this.nome + " ; " + "Identificador:" + this.identificador + " ; " + "valorAluguelBase:" + this.valorAluguelBase + " ; " + "Categoria:" + this.categoria;
		return descr;
	}
	
	public Automovel(String nome, int identificador, double valorAluguelBase, String categoria) {
		super(nome, identificador, valorAluguelBase);
		this.setCategoria(categoria);
	}
	
	

}
