/**
 * Autor: Arthur Mariano Foltz Barroso
 * Faculdade: Engenharia de Software PUCRS
 */ 

public class AppLinked {
    public static void main(String[] args) {
        LinkedListOfInteger lista = new LinkedListOfInteger();
    
        lista.add(3); // 0
        lista.add(4); // 1
        lista.add(5); // 2
        lista.add(6); // 3
        lista.add(7); // 4
        lista.add(8); // 5
        lista.add(9); // 6
        
        boolean b = false;
        
        
        b = lista.removeRange(2,5);
        
        System.out.println(b);
        System.out.println(lista);
        System.out.println("");
        
    }
}