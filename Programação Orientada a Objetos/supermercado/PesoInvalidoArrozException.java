package supermercado;

public class PesoInvalidoArrozException extends Exception{

	
	private static final long serialVersionUID = -1717382334692111128L;
	
	public PesoInvalidoArrozException() {
		super(String.format("O peso informado nao condiz com os produtos em estoque (1, 2, 5 e 10) "));
	}

}
