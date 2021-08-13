/**
 * Autor: Arthur Mariano Foltz Barroso
 * Faculdade: Engenharia de Software PUCRS
 * 
 * Descrição: Trata-se de uma classe de lista encadeada, além disso 
 * há o método "public boolean removeRange(int fromIndex, int toIndex)"
 * que remove elementos da lista encadeada de fromIndex(incluindo) e 
 * toIndex(excluindo).
 * 
*/

public class LinkedListOfInteger {

    // Classe interna Node
    private class Node { 
        public Integer element; 
        public Node next;       

        public Node(Integer element) {
            this.element = element;
            next = null;
        }
        
        public Node(Integer element, Node next) {
            this.element = element;
            this.next = next;
        }        
    }

    
    // Referência para o primeiro elemento da lista encadeada.
    private Node head;
    // Referência para o último elemento da lista encadeada.
    private Node tail;
    // Contador para a quantidade de elementos que a lista contem.
    private int count;

    
    /**
     * Construtor da lista.
     */
    public LinkedListOfInteger() {
        head = null;
        tail = null;
        count = 0;
    }
    
    /**
     * Retorna true se a lista nao contem elementos.
     * @return true se a lista nao contem elementos
     */
    public boolean isEmpty() {
        return (count==0); //(head == null);
    }

    /**
     * Retorna o numero de elementos da lista.
     * @return o numero de elementos da lista
     */
    public int size() {
        return count;
    }

    /**
     * Esvazia a lista
     */
    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }    

    /**
     * Adiciona um elemento ao final da lista.
     * @param element elemento a ser adicionado ao final da lista
     */
    public void add(Integer element)  { // O(1)
        // Primeiro cria o nodo para guardar element
        Node n = new Node(element); 
        
        // Faz o correto encadeamento do nodo criado
        if (head == null) {  
            head = n;
        } else {
            tail.next = n;
        }
        tail = n;
        
        // Atualiza o count
        count++; 
    }
    
    /**
     * Retorna o elemento de uma determinada posicao da lista.
     * @param index a posição da lista
     * @return o elemento da posicao especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer get(int index) { // O(n)
        // Primeiro verifica se index valido
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException();
        }
        
        // Se tiver que retornar o elemento da ultima posicao
        if (index == count-1)
            return tail.element;
        
        // Senao, "caminha" ate a posicao "index"
        Node aux = head;
        int c = 0;
        while (c < index) {
            aux = aux.next;
            c++;
        }
        return (aux.element);
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        Node aux = head;

        while (aux != null) {
            s.append(aux.element.toString());
            s.append("\n");
            aux = aux.next;
        }

        return s.toString();
    }    
    
    
    ////////////////////////////////////////////////////////////////
    
    
    /**
     * Insere um elemento em uma determinada posicao da lista.
     * @param index a posicao da lista onde o elemento sera inserido
     * @param element elemento a ser inserido
     * @throws IndexOutOfBoundsException se (index < 0 || index > size())
     */
    public void add(int index, Integer element) {
        // Primeiro verifica se index eh valido
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException(); // erro
        
        // Cria o nodo
        Node n = new Node(element);
        
        if (index == 0) { // se insercao no inicio
            if (count == 0) { 
                tail = n; // se a lista estiver vazia, atualiza tail
            }
            else {
                n.next = head; // se a lista nao estiver vazia, "gruda" o novo nodo na lida
            }
            head = n;
        }
        else if (index == count) { // se insercao no fim
            tail.next = n;
            tail = n;
        }
        else { // insercao no meio
            Node ant = head;
            for(int i=0; i<index-1; i++) 
                ant = ant.next; // "caminha" ate a posicao anterior a index
            n.next = ant.next; // primeiro "gruda" o nodo na lista
            ant.next = n; // atualiza "ant"
        }       
        
        // Atualiza count
        count++;        
    }

    /**
     * Substitui o elemento armanzenado em uma determinada posicao da lista pelo
     * elemento indicado.
     * @param index a posicao da lista
     * @param element o elemento a ser armazenado na lista
     * @return o elemento armazenado anteriormente na posicao da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer set(int index, Integer element) { // O(n)
        // Primeiro verifica se index eh valido
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException(); // erro
        
        // Se for na ultima posicao
        if (index == count-1) {
            Integer num = tail.element; // "guarda" o elemento da ultima posicao
            tail.element = element; // troca o elemento da ultima posicao
            return num; // retorna o elemento "guardado"
        }

        // "Caminhar" ate a posicao index
        Node aux = head;
        for(int i=0; i<index; i++) {
            aux = aux.next;
        }
        Integer num = aux.element; // "guarda" o elemento da posicao index
        aux.element = element; // troca o elemento da  posicao index
        return num; // retorna o elemento "guardado"
       
    }

    /**
     * Remove a primeira ocorrencia do elemento na lista, se estiver presente.
     * @param element o elemento a ser removido
     * @return true se a lista contem o elemento especificado
     */
    public boolean remove(Integer element) { // O(n)
        if (count==0) // se a lista estiver vazia
            return false;
        
        // Remocao do primeiro
        if (head.element.equals(element)) {
            head = head.next;
            if (count==1) // se tinha apenas 1 elemento na lista
                tail = null;
            count--; // atualiza count
            return true;
        }
        
        //
        Node ant = head;
        Node aux = head.next;
        
        while (aux != null) {
            if (aux.element.equals(element)) { //se encontrou element
                if (aux == tail) { // remocao do elemento da ultima posicao
                    tail = ant;
                    tail.next = null;
                }
                else { // remocao do elemento que esta no meio da lista
                    ant.next = aux.next;
                }
                count--;
                return true;
            }
            aux = aux.next;
            ant = ant.next;
        }
        return false;
    }

    /**
     * Remove o elemento de uma determinada posicao da lista.
     * @param index a posicao da lista
     * @return o elemento que foi removido da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer removeByIndex(int index) {
        // Primeiro verifica se index valido
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException(); // erro
        
        Integer num=null;
        
        // remocao do inicio
        if (index == 0) {
            num = head.element;
            head = head.next;
            if (count==1) // se tinha apenas um elemento na lista
                tail = null;
            count--;
            return num;
        }

        Node ant = head;
        for(int i=0; i<index-1; i++) {
            ant = ant.next; // "caminha" ate a posicao anterior a que deve ser removida
        }    
        
        if (ant.next == tail) { // remocao do fim
            num = tail.element;
            tail = ant;
            tail.next = null;
        }
        else { // remocao do meio
            num = ant.next.element;
            ant.next = ant.next.next;
        }
         
        count--;
        return num;
    }

    /**
     * Retorna o indice da primeira ocorrencia do elemento na lista, ou -1 se a
     * lista nao contem o elemento.
     * @param element o elemento a ser buscado
     * @return o indice da primeira ocorrencia do elemento na lista, ou -1 se a
     * lista nao contem o elemento
     */
    public int indexOf(Integer element) {
        Node aux = head;
        for (int i = 0; i < count; i++) {
            if (aux.element.equals(element)) {
                return i;
            }
            aux = aux.next;
        }
        return -1;
    }
    
    /**
     * Retorna um arranjo com uma copia de um subconjunto dos elementos da
     * lista.
     *
     * @param fromIndex a posição inicial ("inclusive") dos elementos a serem
     * incluídos
     * @param toIndex a posição final ("exclusive") dos elementos a serem
     * incluídos
     * @return um arranjo com um subconjunto da lista
     * @throws IndexOutOfBoundsException se (fromIndex < 0 || toIndex > size())
     * @throws IllegalArgumentException se (fromIndex > toIndex)
     */
    public Integer[] subList(int fromIndex, int toIndex) {
        // Primeiro verifica se os indices sao validos
        if (fromIndex < 0 || toIndex > size()) 
            throw new IndexOutOfBoundsException("Índices inválidos!");
        if (fromIndex > toIndex) 
            throw new IllegalArgumentException("fromIndex deve ser menor que toIndex!");
        
        // Cria o array
        Integer []a = new Integer[toIndex-fromIndex];
        
        // "Caminha" na lista ate a posicao fromIndex
        Node aux = head;
        for (int i = 0; i < fromIndex; i++) { // para "chegar" ate a posicao fromIndex
            aux = aux.next;
        }
        
        // Copia os elementos entre fromIndex e toIndex para o array
        int pos = 0;
        for (int i = fromIndex; i < toIndex; i++) {
            a[pos] = aux.element;
            aux = aux.next;
            pos++;
        }    
        
        // Retorna o array
        return a;
    }

    /**
     * Retorna true se a lista contem o elemento especificado.
     * @param element o elemento a ser testado
     * @return true se a lista contem o elemento especificado
     */
    public boolean contains(Integer element) { // O(n)
        Node aux = head;
        for(int i=0; i<count; i++) {
            if (aux.element.equals(element)) { // se encontrou element
                return true;
            }
            aux = aux.next;
        }
        return false;
    }

    public void printBackToFront() { // O(n)
        Integer a[] = new Integer[count];
        Node aux = head;
        // Primeiro copia os elementos da lista para o arranjo
        for(int i=0; i<count; i++) {
            a[i] = aux.element;
            aux = aux.next;
        }
        // Depois, percorre o arranjo de trás para frente, imprimindo os valores
        for(int i=count-1; i>=0; i--) {
            System.out.println(a[i]);
        }        
    }
    
        public void recursivePrintBackToFront() {
            if (count!=0)
                recursivePrintBackToFront(head);
        }
        private void recursivePrintBackToFront(Node n) {
            if (n==tail) {
                System.out.println(n.element);
            }
            else {
                recursivePrintBackToFront(n.next);
                System.out.println(n.element);
            }
        }    
        
         public boolean equals(LinkedListOfInteger l) { // O(n)
             if (count != l.count)
                 return false;
             
             Node aux = head;
             Node auxL = l.head;
             
             for (int i=0; i<count; i++) {
                 if ( !aux.element.equals(auxL.element) ) {
                     return false;
                 }
                 aux = aux.next;
                 auxL = auxL.next;
             }
             
             return true;
         }
    
         public boolean removeRange(int fromIndex, int toIndex){
             
            Integer num=null;
            Node ant = head;
             
             if(fromIndex < 0 || toIndex > size()){
                 return false;
             }
             else if(fromIndex > toIndex){
                 return false;
            }
            
            
            Node aux = head;
            
            for(int i=0; i<fromIndex-1; i++) {
              ant = ant.next; // "caminha" ate a posicao anterior a que deve ser removida
            } 
            
            for (int i = fromIndex + 1; i <= toIndex; i++) { // para "chegar" ate a posicao fromIndex
              num = ant.next.element;
              ant.next = ant.next.next;
            }
            
            return true;
            
         }
}
