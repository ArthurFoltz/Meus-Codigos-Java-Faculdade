package supermercado;

public class LitragemInvalidaLeiteException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1391752128341466664L;
	
	public LitragemInvalidaLeiteException() {
		super(String.format("A litragem informada nao condiz com os produtos em estoque (1, 2 e 4 litros)"));
	}

}
