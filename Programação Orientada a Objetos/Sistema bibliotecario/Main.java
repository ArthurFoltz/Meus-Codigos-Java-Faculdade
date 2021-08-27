/* 
 * Arthur Mariano Foltz Barroso

 * 
 * Sistema para biblioteca que mostra as informações do livro e seu dono
 * caso o livro não tenha um dono cadastrado junto a ele, mostra que nenhum item foi encontrado
 * ou seja, só mostra o livro e suas informações se um dono estiver atrelado ao mesmo
 * 
*/


package ex1;
import java.util.Scanner;

public class Main {
	
	private Cadastro cad1 = new Cadastro();

	public static void main(String[] args) {
		
		Main n = new Main();
		n.inicializar();
		n.processar();
      
	}
	
	public void processar() {
		
		int chose2 = 0;
		 
		 while(chose2 != 4) {
			  Scanner in = new Scanner(System.in);
			  System.out.println("");
			  System.out.println("Digitar 1, mostra todas as informações dos itens cadastrados ");
			  System.out.println("Digitar 2, pesquisar itens pelo ano: ");
			  System.out.println("Digitar 3, pesquisar itens pelo nome do dono: ");
			  System.out.println("Digitar 4, sair ");
			  System.out.println("");
			  int chose = in.nextInt();
			  
			  switch(chose) {
			  case 1: if(cad1.pesquisaTudo() == null) {
				         System.out.println("Nenhum item cadastrado no sistema.");
			           }
			         else System.out.println(cad1.pesquisaTudo());
				      
			  break;
			  case 2: System.out.println("Digite o ano: ");
			          int ano = in.nextInt();
			          if(cad1.pesquisa(ano) == null) {
			        	  System.out.println("Nenhum item encontrado com este ano.");
			          }
			          else System.out.println(cad1.pesquisa(ano));
			  break;
			  case 3: System.out.println("Digite o nome do dono:");
			          String nom = in.nextLine();
			          String nome = in.nextLine();
			          if(cad1.pesquisaDono(nome) == null) {
			        	  System.out.println("Nenhum dono com este nome.");
			          }
			          else System.out.println(cad1.pesquisaDono(nome));
			  break;        
			  case 4: System.out.println("Aplicativo finalizado !");
	          chose2 = 4;
		      break;
			  
			  }
			  
		}
		
	}
	
	public void inicializar(){
		   
		Livro l1 = new Livro("A revolta de Atlas", 1957, "Arqueiro", "Ayn Rand");
		Livro l2 = new Livro("The Man in the High Castle", 1962, "Mariner Books", "Philip K. Dick"); 
	    Livro l3 = new Livro("As seis lições", 1979, "LVM Editora", "Ludwig von Mises");
	    Livro l4 = new Livro("Admirável mundo novo", 1932, " Biblioteca Azul", "Aldous Leonard Huxley"); 
	    Livro l5 = new Livro("1984", 1949, "Via Leitura", "George Orwell"); 
	    
	    Dono dono1 = new Dono("Daniel", "danielconfucio@gmail.com", l1);
		Dono dono2 = new Dono("Arthur", "leocesar@hotmail.com", l2);
		Dono dono3 = new Dono("Pedro", "PedroPaulo@gmail.com", l3);
		Dono dono4 = new Dono("Antonio", "antoniozaozao@gmail.com", l4); 
		Dono dono5 = new Dono("Tagomi", "TagomiMinister@hotmail.com", l1); 
		
		l1.addDono(dono1);
		l1.addDono(dono5);
		l2.addDono(dono2);
		l3.addDono(dono3);
		l4.addDono(dono4);
		
		cad1.cadastra(l1);
		cad1.cadastra(l2);
		cad1.cadastra(l3);
		cad1.cadastra(l4);
		cad1.cadastra(l5);
		
		cad1.cadastra(dono1);
		cad1.cadastra(dono2);
		cad1.cadastra(dono3);
		cad1.cadastra(dono4);
		cad1.cadastra(dono5);
		
  }
	

}
