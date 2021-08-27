package ex1;


public class Livro{

	private String nome;

	private int ano;

	private String editora;

	private String autor;
	
	private Dono[] donos = new Dono[20];
	
	private int qtdDono = 0;
	
	////////////////////////////////////////////////////////////////////
	
	//sets e gets
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Dono[] getDono() {
		return donos;
	}

	public void setDono(Dono[] dono) {
		this.donos = dono;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	//construtor 1
	public Livro(String nome, int ano, String editora, String autor) {
	 this.nome = nome;
	 this.ano = ano;
	 this.editora = editora;
	 this.autor = autor;
   }
	
	 //construtor 2
	 public Livro(String nome, int ano){
	  this.nome = nome;
	  this.ano = ano;
		 
   }
	 
	 /////////////////////////////////////////////////////////////////////////////
	 
	 public boolean addDono(Dono dono) {
		 
		 if(qtdDono < donos.length) {
				donos[qtdDono] = dono;
				qtdDono++;
				return true;
			}
			
			return false;
		}
	 
	 @Override
		public String toString() {
			return "Nome: " + this.nome + ", Ano: " + this.ano +
				   ", Editora: " + this.editora + ", Autor: " + this.autor;
		}
}