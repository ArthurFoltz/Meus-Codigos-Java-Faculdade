package supermercado;

import java.util.ArrayList;
import java.util.Arrays;

public class Cliente {
	
	private String nome;
	
	private int id;
	
	private ArrayList<Produto> carrinho = new ArrayList<>();;
	

	// set get
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Produto> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(ArrayList<Produto> carrinho) {
		this.carrinho = carrinho;
	}

	//construtor
	public Cliente(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}

	
	public boolean addProduto(Produto produto) {
		carrinho.add(produto);
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", id=" + id + ", carrinho=" + carrinho + "]";
	}


}
