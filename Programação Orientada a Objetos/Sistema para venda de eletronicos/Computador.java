package trabalho1melhor;

public class Computador {


	private String marca;

	private double preco;
	
	private String gamer;
	
	private String gpu;

	private Venda[] vendas = new Venda[20];
	
	private int qtdVenda = 0;
	
	
	///////////////////////////////////////////

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Venda[] getVenda() {
		return vendas;
	}

	public void setVenda(Venda[] venda) {
		this.vendas = venda;
	}

	public String getGamer() {
		return gamer;
	}

	public void setGamer(String gamer) {
		this.gamer = gamer;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	
	//////////////////////////////////////////////////////
	
	public Computador(String marca, double preco, String gamer, String gpu) {
		this.marca = marca;
		this.preco = preco;
		this.gpu = gpu;
		this.gamer = gamer;
	}
	
	public Computador(String marca, double preco, String gpu) {
		this.marca = marca;
		this.preco = preco;
		this.gpu = gpu;
	}
	
	////////////////////////////////////////////////////////
	
	public boolean addVenda(Venda venda) {
		
		if(qtdVenda < vendas.length) {
			vendas[qtdVenda] = venda;
			qtdVenda++;
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "Marca: " + this.marca + ", Preço: " + this.preco +
			   ", Gamer?: " + this.gamer + ", GPU: " + this.gpu;
	}

}
