package br.edu.infnet.appLanche.model.negocio;

import br.edu.infnet.appLanche.model.exception.AdicionalCaldaInvalidaException;

public class Sobremesa extends Produto {

	private boolean frio;
	private float adicionalCalda;

	public Sobremesa(String descricao, float valor, boolean producaoPropria) {
		super(descricao, valor, producaoPropria);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.isFrio());
		sb.append(";");
		sb.append(this.getAdicionalCalda());
		
		return sb.toString();
	}
	
	@Override
	public float calcularValorVenda() {
		float valor = this.getValor() + (this.isProducaoPropria() ? 2 : 0);		
		float valorFrio = valor / 2;		
		float valorCalda = this.getAdicionalCalda() * 0.03f; 

		return valor + valorFrio + valorCalda;
	}

	public boolean isFrio() {
		return frio;
	}
	public void setFrio(boolean frio) {
		this.frio = frio;
	}
	public float getAdicionalCalda() {
		return adicionalCalda;
	}
	public void setAdicionalCalda(float adicionalCalda) throws AdicionalCaldaInvalidaException {
		
		if(adicionalCalda < 1 && adicionalCalda > 300) {
			throw new AdicionalCaldaInvalidaException("Adicional calda inválida.");
		}
		
		this.adicionalCalda = adicionalCalda;
	}
}