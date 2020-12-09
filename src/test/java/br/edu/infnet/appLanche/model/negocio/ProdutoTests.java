package br.edu.infnet.appLanche.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTests {

	@Test
	void testaBebida() {
		Bebida b = new Bebida("suco", 5, Boolean.TRUE);
		
		assertNotNull(b);
	}
	
	@Test
	void testaComida() {
		Comida c = new Comida("pastel", 15, Boolean.FALSE);
		
		assertNotNull(c);
	}
	
	@Test
	void testaSobremesa() {
		Sobremesa s = new Sobremesa("bolo", 10, Boolean.TRUE);
		
		assertNotNull(s);
	}
}
