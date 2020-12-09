package br.edu.infnet.appLanche.model.negocio;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PedidoTests {

	@Test
	void testaAssociacao() {
		Solicitante s = new Solicitante("elberth", "12345678901", "elberth@elberth.com");		
		
		Pedido p = new Pedido();
		p.setSolicitante(s);
		
		System.out.println("Pedido: " + p);

		assertTrue(s.equals(p.getSolicitante()));
	}
	
	@Test
	void testaWebTrue() {
		Pedido p = new Pedido();
		
		assertTrue(p.isWeb());
	}
	
	@Test
	void testaWebFalse() {
		Pedido p = new Pedido();
		p.setWeb(Boolean.FALSE);
		
		assertFalse(p.isWeb());
	}
}