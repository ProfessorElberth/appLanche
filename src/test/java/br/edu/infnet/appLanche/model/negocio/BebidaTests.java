package br.edu.infnet.appLanche.model.negocio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BebidaTests {

	@Test
	void testaToString() {
		Bebida b = new Bebida("suco", 5, Boolean.TRUE);
		b.setMedida(200);
		b.setMarca("Da Casa");
		
		assertTrue("suco;5.0;true;200.0;Da Casa".equals(b.toString()));
	}
	
	@Test
	void testaCalculoValorBebida() {
		Bebida b = new Bebida("suco", 5, Boolean.TRUE);
		b.setMedida(200);
		b.setMarca("Da Casa");

		assertTrue(b.calcularValorVenda() == 11);
		
		//this.getValor() + (this.isProducaoPropria() ? 2 : 0) + (this.getMedida() * 0.02f);
		//5 + 2 + 4
	}
}
