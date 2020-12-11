package br.edu.infnet.appLanche.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appLanche.model.exception.PorcaoInvalidaException;

@SpringBootTest
public class ComidaTests {

	@Test
	void testaToString() throws PorcaoInvalidaException {
		Comida comida = new Comida("pastel", 15, Boolean.FALSE);
		comida.setDoce(Boolean.TRUE);
		comida.setPorcao(3);
		assertTrue("pastel;15.0;false;true;3".equals(comida.toString()));
	}
	
	@Test
	void testaCalculoValorComida() throws PorcaoInvalidaException {
		Comida comida = new Comida("pastel", 15, Boolean.FALSE);
		comida.setDoce(Boolean.TRUE);
		comida.setPorcao(3);
		assertEquals(comida.calcularValorVenda(), 63);
	}
	
	@Test
	void testaPorcaoInvalida() {
		try {
			Comida comida = new Comida("pastel", 15, Boolean.FALSE);
			comida.setDoce(Boolean.TRUE);
			comida.setPorcao(30);
		} catch (PorcaoInvalidaException e) {
			assertEquals("Porção inválida.", e.getMessage());
		}		
	}	
}