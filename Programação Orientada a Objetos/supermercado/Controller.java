package supermercado;

import java.util.ArrayList;


public class Controller {
	
	private ArrayList<Produto> itens = new ArrayList<>(); 
	
	private ArrayList<Cliente> clientes = new ArrayList<>(); 
	
	//cadastra produtos no estoque
	public boolean cadastraProduto(Produto produto) {
		for(int i = 0; i < itens.size(); i++ ) {
			if(produto.getIdentificador() == itens.get(i).getIdentificador()) {
				  return false;
		   }
		}
		itens.add(produto);
		return true;
	}
	
	//cadastra clientes
		public boolean cadastraCliente(Cliente cliente) {
			for(int i = 0; i < clientes.size(); i++ ) {
				if(cliente.getId() == clientes.get(i).getId()) {
					  return false;
			   }
			}
			clientes.add(cliente);
			return true;
		}
	
	//mostra todos os produtos do mercado
	public String mostraTudo() {
		
		String saida = "";
		
		  for(int i = 0; i < itens.size(); i++) {
			 saida = saida + (i + 1) + " - " + itens.get(i).geraDescricao() + "\n";
				
			}
			if(saida.equals("")) {
				return null;
			}
			
			else return saida;
	}
	
	//adiciona no carrinho do cliente
	public boolean addCarrinho(Cliente cliente, int id) {
		
		for(int i = 0; i < itens.size(); i++) {
			if(itens.get(i).getIdentificador() == id){
				Produto produto = itens.get(i);
				cliente.addProduto(produto);
				return true;
			}
		}
		  return false;
	}
	
	//procura se um ou mais clientes existem pelo nome
	public ArrayList<Cliente> procuraCliente(String nome) {
		
		ArrayList<Cliente> retorno = new ArrayList();
		int contador = 0;
		
		for(int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getNome().equalsIgnoreCase(nome)){
				retorno.add(clientes.get(i));
				contador++;
			}
		}
		if(retorno.isEmpty()) {
			return null;
		}
		return retorno;
	}
	
	//procura se o cliente existe pelo id
		public Cliente procuraCliente(int id) {
			
			for(int i = 0; i < clientes.size(); i++) {
				if(clientes.get(i).getId() == id){
					return clientes.get(i);
				}
			}
			return null;
		}
	
	//finaliza o pedido e mostra o valor do mesmo
	public double finalizaPedido(Cliente cliente) {
		
		double valorPedido = 0;
		int cont = 0;
		
		for(int i = 0; i < cliente.getCarrinho().size(); i++) {
				valorPedido = cliente.getCarrinho().get(i).calculaPreco() + valorPedido;
				cont++;
			}
			
			cliente.setCarrinho(null);
			return valorPedido;
		}
	
	
	
	}

