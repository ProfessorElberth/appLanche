package br.edu.infnet.appLanche.model.leitura;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArquivoTests {

	@Test
	void testaArquivoLeituraEscrita() {
		Arquivo.main(new String[] {"Migração realizada com sucesso!"});
	}
}
