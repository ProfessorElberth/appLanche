package br.edu.infnet.appLanche.model.negocio;

public class Comida extends Produto {

	//
	//
	
	public Comida(String descricao, float valor, boolean producaoPropria) {
		super(descricao, valor, producaoPropria);
	}

	@Override
	public float calcularValorVenda() {
		return 0;
	}
}