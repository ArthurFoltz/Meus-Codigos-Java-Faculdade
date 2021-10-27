package T2;

// Sistema de uma empresa que realiza o aluguel de imoveis, automoveis e vestuarios, onde em cada um destes itens temos o seu nome, 
// id, calculo de aluguel diario, e sua categoria ou tipo. Esses itens alugaveis ficam armazenados em uma lista, sendo possivel:
// adicionar novos itens; 
// calcular o valor do seu aluguel em relacao a quantidade de dias;
// pesquisar se o item existe na lista de alugaveis atraves do nome
// mostrar a lista completa de itens

public class Main {

	public static void main(String[] args) {

		ACMERent gg = new ACMERent();
		gg.preCadastra();
		gg.executa();
	}

}
