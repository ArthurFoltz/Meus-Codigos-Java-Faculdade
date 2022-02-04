package supermercado;

public class PesoInvalidoChocolateException extends Exception{

	
	private static final long serialVersionUID = 7552709988180200858L;

	public PesoInvalidoChocolateException() {
		super(String.format("O peso informado nao condiz com os produtos em estoque (150, 300, 500) "));
	}

}
