package supermercado;

import java.util.ArrayList;
import java.util.Scanner;

public class Interacao {

	private Controller app = new Controller();
	
	Cliente cliente = null;

	public void cadastroEstoque()
			throws LitragemInvalidaLeiteException, PesoInvalidoChocolateException, PesoInvalidoArrozException {

		Produto leite1 = new Leite("Ninho", 1, 1); // POLIMORFISMO APLICADO
		Produto leite2 = new Leite("Italac", 2, 4); // POLIMORFISMO APLICADO
		Produto chocolate1 = new Chocolate("Nestle", 3, 150); // POLIMORFISMO APLICADO
		Produto chocolate2 = new Chocolate("Lacta", 4, 500); // POLIMORFISMO APLICADO
		Produto arroz1 = new Arroz("Sazon", 5, 2); // POLIMORFISMO APLICADO
		Produto arroz2 = new Arroz("Tio joao", 6, 10); // POLIMORFISMO APLICADO

		app.cadastraProduto(leite1);
		app.cadastraProduto(leite2);
		app.cadastraProduto(chocolate1);
		app.cadastraProduto(chocolate2);
		app.cadastraProduto(arroz1);
		app.cadastraProduto(arroz2);

		Cliente teste1 = new Cliente("Arthur", 0);
		Cliente teste2 = new Cliente("Pedro", 1);
		Cliente teste3 = new Cliente("Nubya", 2);
		Cliente teste4 = new Cliente("Homer", 3);

		app.cadastraCliente(teste1);
		app.cadastraCliente(teste2);
		app.cadastraCliente(teste3);
		app.cadastraCliente(teste4);
	}

	public void processar() {

		int chose2 = 0;

		while (chose2 != 4) {
			Scanner in = new Scanner(System.in);
			System.out.println("");
			System.out.println("Digitar 1, mostrar produtos disponiveis "); 
			System.out.println("Digitar 2, pesquisar cliente por nome"); 
			System.out.println("Digitar 3, pesquisar cliente por id"); 
			System.out.println("Digitar 4, adicionar itens no carrinho "); 
			System.out.println("Digitar 5, finaliza pedido ");
			System.out.println("Digitar 6, sair ");
			System.out.println("");
			int chose = in.nextInt();
			boolean auxi = false;
			

			switch (chose) {

			case 1:
				if (app.mostraTudo() == null) {
					System.out.println("Nenhum item cadastrado");
				} else
					System.out.println(app.mostraTudo());
				break;

			case 2:
				System.out.println("Por favor, digite seu nome: ");
				String nome = in.nextLine(); // bug java pular string
				String nome2 = in.nextLine();
				if (app.procuraCliente(nome2) == null) {
					System.out.println("Erro, cliente nao encontrado ");
				} else
					System.out.println(app.procuraCliente(nome2));
				break;

			case 3:
				System.out.println("Por favor, digite seu id: ");
				int id = in.nextInt();
				if (app.procuraCliente(id) == null) {
					System.out.println("Erro, cliente nao encontrado ");
				} else
					System.out.println(app.procuraCliente(id));
				break;

			case 4:
				int stop = 0;
				System.out.println("Por favor, digite seu id: ");
				int identi = in.nextInt();
				if (app.procuraCliente(identi) == null) {
					System.out.println("Erro, cliente nao encontrado ");
				} else {
					while (stop != -1) {
						cliente = app.procuraCliente(identi);
						System.out.println("Ola " + cliente.getNome() + " o que deseja comprar hoje? ");
						System.out.println("Basta digitar o id do produto: ");
						System.out.println(app.mostraTudo());
						int ide = in.nextInt();
						auxi = app.addCarrinho(cliente, ide);
						if (auxi == false) {
							System.out.println("Erro, digite um id correto de um produto da lista ");
						} else {
							System.out.println("Item adicionado ao seu carrinho com sucesso! ");
						}
						System.out.println("Para finalizar as compras, digite -1, caso contrario, digite 1 ");
						stop = in.nextInt();

					}
				}
				break;
				
				
			case 5:
				if(cliente == null) {
					System.out.println("Erro, nenhum cliente selecionado"); 
				}
				else {
					System.out.println("O seu pedido custou:");
					System.out.println(app.finalizaPedido(cliente) + " Reais");
				}
				break;
				
			case 6:
				System.out.println("Aplicativo finalizado !");
				chose2 = 4;
				break;
			
			}

			
		}

	}
}
