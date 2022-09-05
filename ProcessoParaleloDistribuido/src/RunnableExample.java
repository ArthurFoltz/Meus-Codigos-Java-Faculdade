// Exemplo de thread implementando a interface Runnable
class RunnableExample implements Runnable {

	public void run() {
		System.out.println("Metodo run executado pela thread");
	}

	public static void main(String[] args) {
		RunnableExample t = new RunnableExample();
		Thread t1 = new Thread(t);
        t1.start();
		System.out.println("Metodo main executado pelo programa principal");
	}
}
