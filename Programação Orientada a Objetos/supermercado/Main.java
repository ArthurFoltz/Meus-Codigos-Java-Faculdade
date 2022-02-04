package supermercado;


/*
Sistema de mini mercado com 3 produtos e alguns clientes, sendo poss�vel
selecionar clientes pelo id para adicionar compras em seus respectivos carrinhos
al�m de finalizar a compra e saber o preco final da mesma.

Autor: Arthur Mariano Foltz Barroso
*/

public class Main {

	public static void main(String[] args) throws LitragemInvalidaLeiteException, PesoInvalidoChocolateException, PesoInvalidoArrozException {
		
		Interacao inicia = new Interacao();
		inicia.cadastroEstoque();
		inicia.processar();
	}

}
