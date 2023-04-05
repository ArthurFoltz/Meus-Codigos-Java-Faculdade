
/**
 * 
 * 
 * @ Arthur Mariano Foltz Barroso 
 * @v1
 */

public class App {
    public static void main(String[] args) {
        
        Stack s = new Stack();
        s.push(1);
        s.push(-2);
        s.push(3);
        s.push(4);
        s.push(-8);
        
        
        s.trocaSinal(s);
        
        while(!s.isEmpty())
          System.out.println(s.pop());
    }
    
    
}
