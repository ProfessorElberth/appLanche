package br.edu.infnet.appLanche.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SolicitanteTests {

	@Test
	void testaInstancia() {

		Solicitante s = new Solicitante("elberth", "12345678901", "elberth@elberth.com");
		
		assertNotNull(s);
	}
	
	@Test
	void testaToString() {
		
		Solicitante s = new Solicitante("elberth", "12345678901", "elberth@elberth.com");
		
		assertTrue("elberth;12345678901;elberth@elberth.com".equals(s.toString()));
	}
}