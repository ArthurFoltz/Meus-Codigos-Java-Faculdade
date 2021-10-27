package T2;

import java.util.ArrayList;

public class Cadastro {
	
	private ArrayList<Alugavel> locaveis = new ArrayList<>();
	
	
	/////////////////////////////////////////////////////////

	public boolean cadastra(Alugavel item) {
	
	  for(int i = 0; i < locaveis.size(); i++ ) {
		  if(item.getIdentificador() == locaveis.get(i).getIdentificador()) {
			  return false;
	   }
	 }
	  locaveis.add(item);
	  return true;
  }
	///////////////////////////////////////////////////////////

	public ArrayList<Alugavel> pesquisa(String nome) {
		
		ArrayList<Alugavel> retorno = new ArrayList();
		int contador = 0;
		
		for(int i = 0; i < locaveis.size(); i++) {
			if(locaveis.get(i).getNome().equalsIgnoreCase(nome)){
				retorno.add(locaveis.get(i));
				contador++;
			}
		}
		if(retorno.isEmpty()) {
			return null;
		}
		return retorno;
	}
	
	///////////////////////////////////////////////////////////

	public String pesquisaTudo() {
		
      String saida = "";
		
	  for(int i = 0; i < locaveis.size(); i++) {
		 saida = saida + (i + 1) + " - " + locaveis.get(i).geraDescricao() + "\n";
			
		}
		if(saida.equals("")) {
			return null;
		}
		
		else return saida;
		
	}
	
	////////////////////////////////////////////////////////////

	public double calculaAluguel(int identificador, int dias) {
		
		for(int i = 0; i < locaveis.size(); i++) {
			if(locaveis.get(i).getIdentificador() == identificador){
				double aluga = locaveis.get(i).calculaAluguelDiario() * dias;
				return aluga;
			}
		}
		
		return -1.0;
	}

}
