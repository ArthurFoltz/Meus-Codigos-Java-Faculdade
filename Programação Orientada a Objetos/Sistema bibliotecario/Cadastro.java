package ex1;

public class Cadastro {
	
	private Dono[] dono = new Dono[20];
	
	private Livro[] livro = new Livro[20];
	
    private int qtdDonos = 0;
	
	private int qtdLivros = 0;
	
	
	public void cadastra(Dono dono) {

		if(qtdDonos < this.dono.length) {
			this.dono[qtdDonos] = dono;
			qtdDonos++;
		}
	}

	public void cadastra(Livro livro) {
		
		if(qtdLivros < this.livro.length) {
			this.livro[qtdLivros] = livro;
			qtdLivros++;
		}
		
	}
    
	public String pesquisaTudo() {
		
        String saida = "";

		for(int i = 0; i < qtdDonos; i++) {
			Dono p = dono[i];
			saida = saida + (i + 1) + " - " + p.toString() + "\n";
		}
		if(saida.equals("")) {
			return null;
		}
		else return saida;
	}

	public String pesquisa(int ano) {
		
		String saida = "";
		
		for(int i = 0; i < qtdDonos; i++) {
			Dono p = dono[i];
			if(p.getLivro().getAno() == ano) {
				saida = saida + (i + 1) + " - " + p.toString() + "\n";
			}
		}
		if(saida.equals("")) {
			return null;
		}
		else return saida;
	}

	public String pesquisaDono(String dono) {
		
        String saida = "";
		
		for(int i = 0; i < qtdDonos; i++) {
			Dono b = this.dono[i];
			if(b.getNome().equalsIgnoreCase(dono)) {
				saida = saida + (i + 1) + " - " + b.toString() + "\n";
			}
		}
		if(saida.equals("")) {
			return null;
		}
		else return saida;
		
	}
	
	

}
