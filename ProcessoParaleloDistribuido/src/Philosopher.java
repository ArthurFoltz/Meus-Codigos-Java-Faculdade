public class Philosopher implements Runnable {

    // The forks on either side of this Philosopher 
    private Object leftFork;
    private Object rightFork;

    public Philosopher(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    private void doAction(String action) throws InterruptedException {
        System.out.println(
          Thread.currentThread().getName() + " " + action);
        Thread.sleep(((int) (Math.random() * 100)));
    }

    @Override
    public void run() {
        try {
            while (true) {
                
                // thinking
                doAction(System.nanoTime() + ": Pensando");
                synchronized (leftFork) {
                    doAction(
                      System.nanoTime() 
                        + ": Peguei o garfo esquerdo");
                    synchronized (rightFork) {
                        // eating
                        doAction(
                          System.nanoTime() 
                            + ": Peguei o garfo direito - comendo"); 
                        
                        doAction(
                          System.nanoTime() 
                            + ": Devolvi o garfo direto");
                    }
                    
                    // Back to thinking
                    doAction(
                      System.nanoTime() 
                        + ": Devolvi o garfo esquerdo. Voltei a pensar");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
}