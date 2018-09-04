package br.ifpe;

import org.junit.Assert;
import org.junit.Test;



public class AplicacaoTest {
    
	@Test
	public void teste1() {
	 //cenário -> ddaos necessarios para poder se trabalhar com o teste
	Aplicacao app = new Aplicacao();
	//ação
	String valor = app.acao();	
	//verificação
      Assert.assertTrue(valor == "Exemplos");
	}
}
