package br.edu.infnet.appLanche.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appLanche.model.exception.AdicionalCaldaInvalidaException;

@SpringBootTest
public class SobremesaTests {

	@Test
	void testaToString() throws AdicionalCaldaInvalidaException {
		Sobremesa sobremesa = new Sobremesa("bolo", 10, Boolean.TRUE);
		sobremesa.setFrio(Boolean.FALSE);
		sobremesa.setAdicionalCalda(100);
		assertTrue("bolo;10.0;true;false;100.0".equals(sobremesa.toString()));
	}
	
	@Test
	void testaCalculoValorSobremesa() throws AdicionalCaldaInvalidaException {
		Sobremesa sobremesa = new Sobremesa("bolo", 10, Boolean.TRUE);
		sobremesa.setFrio(Boolean.FALSE);
		sobremesa.setAdicionalCalda(100);
		assertEquals(sobremesa.calcularValorVenda(), 21);
	}
	
	@Test
	void testaAdicionalCaldaInvalida() {
		try {
			Sobremesa sobremesa = new Sobremesa("bolo", 10, Boolean.TRUE);
			sobremesa.setFrio(Boolean.FALSE);
			sobremesa.setAdicionalCalda(500);
		} catch (AdicionalCaldaInvalidaException e) {
			assertEquals("Adicional calda inválida.", e.getMessage());
		}
	}
}