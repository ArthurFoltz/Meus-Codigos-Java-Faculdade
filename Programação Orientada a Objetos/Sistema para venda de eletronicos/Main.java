package trabalho1melhor;

import java.util.Scanner;
//Arthur Mariano Foltz Barroso

public class Main {
	
	private CadastroGeral cad1 = new CadastroGeral();

	public static void main(String[] args) {
		
		Main n = new Main();
		n.inicializar();
		n.processar();

	}

	public void inicializar() {
		
		Computador pc1 = new Computador("gigabyte", 5779.2, "S", "NVIDIA");
		Computador pc2 = new Computador("lenovo", 4899.9, "N", "AMD");
		Computador pc3 = new Computador("hp", 6299.78, "S", "Intel");
		Computador pc4 = new Computador("samsung", 8555.4, "S", "NVIDIA");
		Computador pc5 = new Computador("asus", 9999.99, "S", "AMD");
		
		Venda venda1 = new Venda(2, "Joao", pc1);
		Venda venda2 = new Venda(3, "Roberto", pc2);
		Venda venda3 = new Venda(4, "Arthur", pc3);
		Venda venda4 = new Venda(5, "Pedro", pc1);
		
		pc1.addVenda(venda1);
		pc1.addVenda(venda4);
		pc2.addVenda(venda2);
		pc3.addVenda(venda3);
		
		cad1.cadastra(pc1);
		cad1.cadastra(pc2);
		cad1.cadastra(pc3);
		cad1.cadastra(pc4);
		cad1.cadastra(pc5);
		
		cad1.cadastra(venda1);
		cad1.cadastra(venda2);
		cad1.cadastra(venda3);
		cad1.cadastra(venda4);

	}

	public void processar() {

		int chose2 = 0;
		 
		 while(chose2 != 4) {
			  Scanner in = new Scanner(System.in);
			  System.out.println("");
			  System.out.println("Digitar 1, mostra todas as informações das vendas cadastradas "); // funcional
			  System.out.println("Digitar 2, pesquisar venda pelo código "); // funcional
			  System.out.println("Digitar 3, pesquisar vendas pela marca "); // funcional
			  System.out.println("Digitar 4, sair ");
			  System.out.println("");
			  int chose = in.nextInt();
			  
			  switch(chose) {
			  case 1: if(cad1.pesquisaTudo() == null) {
				         System.out.println("Nenhuma venda cadastrada no sistema.");
			           }
			         else System.out.println(cad1.pesquisaTudo());
				      
			  break;
			  case 2: System.out.println("Digite o codigo: ");
			          int cod = in.nextInt();
			          if(cad1.pesquisa(cod) == null) {
			        	  System.out.println("Nenhuma venda encontrada com este codigo.");
			          }
			          else System.out.println(cad1.pesquisa(cod));
			  break;
			  case 3: System.out.println("Digite a marca:");
			          String marc = in.nextLine();
			          String marc2 = in.nextLine();
			          if(cad1.pesquisa(marc2) == null) {
			        	  System.out.println("Nenhuma venda realizada com esta marca de produto.");
			          }
			          else System.out.println(cad1.pesquisa(marc2));
			  break;        
			  case 4: System.out.println("Aplicativo finalizado !");
	          chose2 = 4;
		      break;
			  
			  }

	 }
	}

}
