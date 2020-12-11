package br.edu.infnet.appLanche.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appLanche.model.exception.MedidaNegativaException;

@SpringBootTest
public class BebidaTests {

	@Test
	void testaToString() throws MedidaNegativaException {
		Bebida b = new Bebida("suco", 5, Boolean.TRUE);
		b.setMarca("Da Casa");		
		b.setMedida(200);
		assertTrue("suco;5.0;true;200.0;Da Casa".equals(b.toString()));
	}
	
	@Test
	void testaCalculoValorBebida() throws MedidaNegativaException {
		Bebida b = new Bebida("suco", 5, Boolean.TRUE);
		b.setMarca("Da Casa");
		b.setMedida(200);
		assertEquals(b.calcularValorVenda(), 11);
	}
	
	@Test
	void testaMedidaNegativa() {
		try {
			Bebida b = new Bebida("suco", 5, Boolean.TRUE);
			b.setMarca("Da Casa");
			b.setMedida(-100);
		} catch (MedidaNegativaException e) {
			assertEquals("Medida inválida.", e.getMessage());
		}
	}
}
