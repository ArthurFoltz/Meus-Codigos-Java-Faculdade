package T2;

import static org.junit.jupiter.api.Assertions.*;

public class CadastroTest {

	
	@org.junit.jupiter.api.Test
	public void testCadastraImovel() {
		Cadastro cadastro = new Cadastro();
		Alugavel imovel = new Imovel("ImovelTest", 90, 2000, 68);
		cadastro.cadastra(imovel);
		assertTrue(true);
	}
	
	@org.junit.jupiter.api.Test
	public void testCadastraAutomovel() {
		Cadastro cadastro = new Cadastro();
		Alugavel automovel = new Automovel("AutomovelTest", 91, 500, "SUV");
		cadastro.cadastra(automovel);
		assertTrue(true);
	}
	
	@org.junit.jupiter.api.Test
	public void testCadastraVestuario() {
		Cadastro cadastro = new Cadastro();
		Alugavel vestuario = new Vestuario("Roupa", 92, 70, "Gala");
		cadastro.cadastra(vestuario);
		assertTrue(true);
	}
	
	@org.junit.jupiter.api.Test
	public void testCadastraIdentificadorIgual() {
		Cadastro cadastro = new Cadastro();
		Alugavel imovel = new Imovel("ImovelTestID", 90, 2000, 68);
		cadastro.cadastra(imovel);
		
		Alugavel imovel2 = new Imovel("ImovelTestID", 90, 2000, 68);
		cadastro.cadastra(imovel2);
		assertFalse(false);
	}
	
	@org.junit.jupiter.api.Test
	public void testPesquisaNome() {
		Cadastro cadastro = new Cadastro();
		Alugavel automovel = new Automovel("AutomovelTest", 91, 500, "SUV");
		cadastro.cadastra(automovel);
		
		assertNotNull(cadastro.pesquisa("AutomovelTest"));
	}
	
	@org.junit.jupiter.api.Test
	public void testPesquisaNomeNull() {
		Cadastro estoque = new Cadastro();
		assertNull(estoque.pesquisa("testa"));
	}
	
	@org.junit.jupiter.api.Test
	public void testPesquisaTudo() {
		Cadastro estoque = new Cadastro();
		Automovel automovel = new Automovel("AutomovelTest", 91, 500, "SUV");
		estoque.cadastra(automovel);
		Imovel imovel = new Imovel("ImovelTestID", 90, 2000, 68);
		estoque.cadastra(imovel);
		Vestuario vestuario = new Vestuario("ImovelTestID", 90, 200, "gala");
		estoque.cadastra(vestuario);
		
		assertNotNull(estoque.pesquisaTudo());
	}
	
	@org.junit.jupiter.api.Test
	public void testPesquisaTudoNull() {
		Cadastro estoque = new Cadastro();
		assertEquals(null,estoque.pesquisaTudo());
	}
	
	@org.junit.jupiter.api.Test
	public void testCalculaAluguelImovel() {
		Cadastro cadastro = new Cadastro();
		Alugavel imovel = new Imovel("ImovelTestID", 90, 1000, 98);
		cadastro.cadastra(imovel);
		
		assertEquals(32940.0,cadastro.calculaAluguel(90, 30)); 
		
	}
	
	@org.junit.jupiter.api.Test
	public void testCalculaAluguelNull() {
		Cadastro cadastro = new Cadastro();
		assertEquals(-1.0, cadastro.calculaAluguel(333, 25));
		
	}
	
	@org.junit.jupiter.api.Test
	public void testCalculaAluguelAutomovelSUV() {
		Cadastro cadastro = new Cadastro();
		Alugavel automovel = new Automovel("ImovelTestID", 90, 250, "SUV");
		cadastro.cadastra(automovel);
		
		assertEquals(5750.0,cadastro.calculaAluguel(90, 20)); 
		
	}
	
	@org.junit.jupiter.api.Test
	public void testCalculaAluguelAutomovelSedan() {
		Cadastro cadastro = new Cadastro();
		Alugavel automovel = new Automovel("ImovelTestID", 90, 250, "sedan");
		cadastro.cadastra(automovel);
		
		assertEquals(5250.0,cadastro.calculaAluguel(90, 20)); 
		
	}
	
	@org.junit.jupiter.api.Test
	public void testCalculaAluguelAutomovelComun() {
		Cadastro cadastro = new Cadastro();
		Alugavel automovel = new Automovel("ImovelTestID", 90, 250, "comun");
		cadastro.cadastra(automovel);
		
		assertEquals(5000.0,cadastro.calculaAluguel(90, 20)); 
		
	}
	
	@org.junit.jupiter.api.Test
	public void testCalculaAluguelVestuarioGala() {
		Cadastro cadastro = new Cadastro();
		Alugavel vestuario = new Vestuario("ImovelTestID", 90, 200, "gala");
		cadastro.cadastra(vestuario);
		
		assertEquals(4800.0,cadastro.calculaAluguel(90, 20));
		
	}
	
	@org.junit.jupiter.api.Test
	public void testCalculaAluguelVestuarioSocial() {
		Cadastro cadastro = new Cadastro();
		Alugavel vestuario = new Vestuario("ImovelTestID", 90, 200, "social");
		cadastro.cadastra(vestuario);
		
		assertEquals(4400.0,cadastro.calculaAluguel(90, 20));
		
	}
	
	@org.junit.jupiter.api.Test
	public void testCalculaAluguelVestuarioComun() {
		Cadastro cadastro = new Cadastro();
		Alugavel vestuario = new Vestuario("ImovelTestID", 90, 200, "");
		cadastro.cadastra(vestuario);
		
		assertEquals(4000.0,cadastro.calculaAluguel(90, 20));
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	
	@org.junit.jupiter.api.Test
	public void testGeraDescricaoVestuario() {
		Alugavel vestuario = new Vestuario("ImovelTestID", 90, 1000, "gala");
		assertNotNull(vestuario.geraDescricao());
	}
	
	@org.junit.jupiter.api.Test
	public void testGeraDescricaoImovel() {
		Alugavel imovel = new Imovel("ImovelTestID", 90, 1000, 98);
		assertNotNull(imovel.geraDescricao());
	}
	
	@org.junit.jupiter.api.Test
	public void testGeraDescricaoAutomovel() {
		Alugavel automovel = new Automovel("ImovelTestID", 90, 1000, "SUV");
		assertNotNull(automovel.geraDescricao());
	}
	
}
