package algoritmos1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] numeros = new int[5];
		Scanner leitor = new Scanner(System.in);

		for(int i = 0; i < numeros.length; i ++) {
			System.out.println("Digite um número: ");
			int numero = leitor.nextInt();
			numeros[i] = numero;
			System.out.println();
		}
		// ************************** Busca Linear *********************
		/*System.out.println("--BUSCA LINEAR--");
		System.out.println("Digite o número a ser pesquisado: ");
		int alvo = leitor.nextInt();
		int posicaoResultado = -1;
		for(int i = 0; i<numeros.length; i++) {
			if(numeros[i] == alvo) {
				posicaoResultado = i;
				break;
			}
		}
		if(posicaoResultado < 0) {
			System.out.println("O elemento não foi encontrado");
		}
		else System.out.println("O numero " + alvo + " foi encontrado na posicao " + posicaoResultado);
		
		System.out.println("Vetor completo:");
		imprimirArray(numeros);*/
		// ************************** FIM DA Busca Linear *********************
		
		
		// ************************** Selection Sort *********************
		// 4, 1, 3, 2
		// 1, 1, 3, 2
		// 1, 4, 3, 2
		
		for(int i = 0; i <numeros.length; i++) { // vai ser o 4 por exemplo
			int indiceDoMenor = i;
			 for(int j = i + 1; j< numeros.length; j++ ) { // vai ser o 1 por exemplo
				if(numeros[j] < numeros[indiceDoMenor]) { //  verifica se o 1 é menor que o 4 (se o que tá na frente é menor)
					indiceDoMenor = j; // se for, diz que o menor é o da frente
				}
			}
			 
			 int temp = numeros[indiceDoMenor]; // coloca o da frente(1) no temp
			 numeros[indiceDoMenor] = numeros[i]; // coloca o maior no lugar do menor  -- numeros[indiceDoMenor] "1" = numeros[i] "4"
			 numeros[i] = temp; // coloca o menor no lugar do maior numeros[i] "4" = temp "1"
		}
		
		System.out.println("Vetor ordenado");
		
		imprimirArray(numeros);
			
		
		// ************************** FIM DO Selection Sort *********************
		
		
		
		// ************************** Busca Binária *********************
		
		int resultado = -1;
		int inicio = 0;
		int fim = numeros.length -1;
		int meio = 0;
		
		System.out.println("Digite o número a ser pesquisado: ");
		int alvo = leitor.nextInt();
		
		while(inicio <= fim) {
			meio = (inicio + fim) / 2;
			if(numeros[meio] < alvo) { // 1 2 3 4 5 6 
				inicio = meio + 1;
			}
			else if(numeros[meio] > alvo) {
				fim = meio - 1;
			}
			else if(numeros[meio] == alvo){
				resultado = meio;
				break;
			}
		}
		
		if(resultado < 0) {
			System.out.println("Elemento não encontrado");
		}
		else System.out.println("O numero " + alvo + " foi encontrado na posicao " + resultado);
		
		// ************************** FIM DA Busca Binária *********************
		
		leitor.close();
	}
	
	
	
	private static void imprimirArray(int[] array) {
		for(int i = 0; i< array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
