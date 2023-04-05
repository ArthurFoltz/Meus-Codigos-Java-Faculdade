/**
 * Autor: Arthur Mariano Foltz Barroso
 * Faculdade: Engenharia de Software PUCRS
 * 
 * Descrição: Trata-se de uma classe pilha, para isso temos os métodos push, pop, top e entre outros.
 * Um outro objetivo foi a criação de um método capaz de inverter o sinal dos números contidos na
 * pilha, se -1 então 1, o método "public Stack trocaSinal(Stack pilha)" faz esse trabalho,
 * junto ao método "public int aponta(int elem)" para auxiliar.
 * 
*/

import java.util.EmptyStackException;

public class Stack {
   // Atributos 
   private int count;
   private Integer pilha[];
   
   public Stack() {
      count = 0;
      pilha = new Integer[10];
   }
   
   // insere o elemento no topo da pilha
   // O(1)
   public void push(Integer element) {
       if (count == pilha.length) // se o array esta cheio
           throw new FullStackException();
       pilha[count] = element;
       count++;
   }
   
   // remove e retorna o elemento do topo da pilha 
   //(erro se a pilha estiver vazia)
   // O(1)
   public Integer pop() {
       if (count == 0) 
           throw new EmptyStackException();
       Integer num = pilha[count-1];
       pilha[count-1] = null;
       count--;
       return num;
   }
   
   // retorna, mas não remove, o elemento do topo da pilha 
   // (erro se a pilha estiver vazia)
   // O(1)
   public Integer top() {
        if (count == 0) 
           throw new EmptyStackException();
        return pilha[count-1];
   }
   
   // retorna o número de elementos da pilha
   // O(1)
   public int size() {
       return count;
   }
   
   // retorna true se a pilha estiver vazia, e false caso contrário
   // O(1)
    public boolean isEmpty() {
        return count==0;
    }
    
    // esvazia a pilha
    // O(1)
    public void clear() {
       count = 0;
       pilha = new Integer[10];           
    } 
    
    // pega o elemento da pilha na determinada posição
    public int aponta(int elem){
        return pilha[elem];
    }
    
    public Stack trocaSinal(Stack pilha){
       
        
       int tamanho = pilha.size(); // recebe o size() da pilha criada no Main
       
       int vetor[] = new int[tamanho]; // criar um array do mesmo tamanho
       
       // aloca os números da pilha no array criado anteriormente 
       for(int i = 0; i < pilha.size(); i++){
           int x = pilha.aponta(i);
           vetor[i] = x;
           
        }
        
       // esvazia a pilha
       while(!pilha.isEmpty()){
            pilha.pop();
        }
        
       // inverte o sinal dos números contidos no array 
       for(int c = 0; c < vetor.length; c++){
           
           if(vetor[c] < 0){
               
               vetor[c] = Math.abs(vetor[c]);
           }
            
           else if(vetor[c] > 0){
              
              vetor[c] = -vetor[c];
           } 
       }
       
       // insere novamente os números com sinal invertido para a pilha
       for(int b = 0; b < vetor.length; b++){
           
           int m = vetor[b];
           pilha.push(m);
           
           
       }
       
       
       return pilha; 
    }
}

