package br.ifpe;

import org.junit.Assert;
import org.junit.Test;



public class AplicacaoTest {
    
	@Test
	public void teste1() {
	 //cen�rio -> ddaos necessarios para poder se trabalhar com o teste
	Aplicacao app = new Aplicacao();
	//a��o
	String valor = app.acao();	
	//verifica��o
      Assert.assertTrue(valor == "Exemplos");
	}
}
