package ex1;


public class Dono {

	private String nome;

	private String email;
	
	private Livro livro;

	//////////////////////////////////////////////////////////////////////////////
	
	//gets e sets
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	///////////////////////////////////////////////////////////////////////////////
	
	//construtor
	public Dono(String nome, String email, Livro livro){
		  this.nome = nome;
		  this.email = email; 
		  this.livro = livro;
	  }
	
	////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + ", Email: " + this.email + ", Livro: " + this.livro;
	}
	
	
}
