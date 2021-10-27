package T2;

import java.util.ArrayList;
import java.util.Scanner;

public class ACMERent {

	private Cadastro estoque = new Cadastro();
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void preCadastra() {
		
		Alugavel auto1 = new Automovel("Volvo",1,250,"SUV"); // POLIMORFISMO APLICADO
		Alugavel imovel1 = new Imovel("Cobertura", 2,1000, 98); // POLIMORFISMO APLICADO
		Alugavel vestuario1 = new Vestuario("Terno", 3, 150, "gala"); // POLIMORFISMO APLICADO
		Alugavel vestuario2 = new Vestuario("Terno", 4, 200, "social"); // POLIMORFISMO APLICADO 
		
		estoque.cadastra(auto1);
		estoque.cadastra(imovel1);
		estoque.cadastra(vestuario1);
		estoque.cadastra(vestuario2);

	}

	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void executa() {


		int chose2 = 0;
		 
		 while(chose2 != 5) {
			  Scanner in = new Scanner(System.in);
			  System.out.println("");
			  System.out.println("Digitar 1, cadastra item alugavel "); // funcional
			  System.out.println("Digitar 2, mostrar todas as informações do cadastro "); // funcional
			  System.out.println("Digitar 3, Pesquisar  item  por  nome "); // funcional
			  System.out.println("Digitar 4, calcular aluguel "); // funcional
			  System.out.println("Digitar 5, sair ");
			  System.out.println("");
			  int chose = in.nextInt();
			  boolean auxi = false;
			  
			  switch(chose) {
			  case 1: System.out.println("Digite 1 para automovel, 2 para imovel e 3 para vestuario:");
			          int escolha = in.nextInt();
				  	  System.out.println("Digite o nome:");
				  	  String bug = in.nextLine();
			          String nome = in.nextLine();
			          System.out.println("Digite o número identificador:");
			          int id = in.nextInt();
			          System.out.println("Digite o Aluguel Base:");
			          double aluguel = in.nextDouble();
			          
			          if(escolha == 1) {
			        	  System.out.println("Digite a categoria:");
			        	  String bug3 = in.nextLine();
			        	  String categoria = in.nextLine();
			        	  Alugavel auto = new Automovel(nome,id,aluguel,categoria);
			        	  auxi = estoque.cadastra(auto);
			        	  if(auxi == true) {System.out.println("Item cadastrado");}
			        	  else System.out.println("Item repetido");     
			          }
			          
			          else if(escolha == 2) {
			        	  System.out.println("Digite o tamanho do imovel:");
			        	  int tamanho = in.nextInt();
			        	  Alugavel imovel = new Imovel(nome,id,aluguel,tamanho);
			        	  auxi = estoque.cadastra(imovel);
			        	  if(auxi == true) {System.out.println("Item cadastrado");}
			        	  else System.out.println("Item repetido"); 
			          }
			          
			          else if(escolha == 3) {
			          System.out.println("Digite o tipo:");
			          String bug2 = in.nextLine();
			          String tipo = in.nextLine();
			          Alugavel vest = new Vestuario(nome,id,aluguel,tipo);
			          auxi = estoque.cadastra(vest);
		        	  if(auxi == true) {System.out.println("Item cadastrado");}
		        	  else System.out.println("Item repetido"); 
			         }
			  break;
			  
			  case 2: if(estoque.pesquisaTudo() == null) {
				  System.out.println("Nenhum item cadastrado");	  
			   }
			  else System.out.println(estoque.pesquisaTudo());
			  
			  break;
			  
			  case 3: System.out.println("Digite o nome:");
			          String bug3 = in.nextLine();
			          String name = in.nextLine();
			          if(estoque.pesquisa(name) == null) {
			        	  System.out.println("Nenhum item foi localizado com este nome.");
			          }
			          else {
			        	  ArrayList<Alugavel> printa = new ArrayList<>();
					      printa = estoque.pesquisa(name);
					      for(int i = 0; i < printa.size(); i++) {
					    	  System.out.println(printa.get(i).geraDescricao());
					    	  System.out.println();
					      }
			          }
			  break;
			  
			  case 4: System.out.println("Digite o identificador do item: ");
			          int idd = in.nextInt();
			          System.out.println("Digite o numero de dias que deseja alugar o item: ");
			          int dias = in.nextInt();
			          if(estoque.calculaAluguel(idd, dias) == -1.0) {
			        	  System.out.println("Nenhum item foi localizado com este identificador.");
			          }
			          else System.out.println("O preço do aluguel é: " + estoque.calculaAluguel(idd, dias));
			  break;
			  
			  case 5: System.out.println("Aplicativo finalizado !");
	          chose2 = 5;
		      break;
			  
			  }

	 }
		
	}

}
