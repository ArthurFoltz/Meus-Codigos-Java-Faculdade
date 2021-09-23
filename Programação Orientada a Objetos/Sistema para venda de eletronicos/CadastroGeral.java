package trabalho1melhor;

public class CadastroGeral {

	private Venda[] venda = new Venda[20];

	private Computador[] computador = new Computador[20];
	
	private int qtdVendas = 0;
	
	private int qtdPC = 0;

	public void cadastra(Computador computador) {

		if(qtdPC < this.computador.length) {
			this.computador[qtdPC] = computador;
			qtdPC++;
		}
	}

	public void cadastra(Venda venda) {
		
		if(qtdVendas < this.venda.length) {
			this.venda[qtdVendas] = venda;
			qtdVendas++;
		}
		
	}

	public String pesquisaTudo() {
		
		String saida = "";
		
		for(int i = 0; i < qtdVendas; i++) {
			Venda p = venda[i];
			saida = saida + (i + 1) + " - " + p.toString() + "\n";
			
		}
		if(saida.equals("")) {
			return null;
		}
		else return saida;
	}

	public Venda pesquisa(int codigo) {
		
		for(int i = 0; i < qtdVendas; i++) {
			Venda p = venda[i];
			if(p.getCodigo() == codigo) {
				return  p;
			}
		}
		return null;
	}

	public String pesquisa(String marca) {
		
		String saida = "";
		
		for(int i = 0; i < qtdVendas; i++) {
			Venda b = venda[i];
			if(b.getComputador().getMarca().equalsIgnoreCase(marca)) {
				saida = saida + (i + 1) + " - " + b.toString() + "\n";
			}
		}
		if(saida.equals("")) {
			return null;
		}
		else return saida;
	}

}
