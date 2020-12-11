package br.edu.infnet.appLanche.model.negocio;

import br.edu.infnet.appLanche.model.exception.PorcaoInvalidaException;

public class Comida extends Produto {

	private boolean doce;
	private int porcao;
	
	public Comida(String descricao, float valor, boolean producaoPropria) {
		super(descricao, valor, producaoPropria);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.isDoce());
		sb.append(";");
		sb.append(this.getPorcao());
		
		return sb.toString();
	}

	@Override
	public float calcularValorVenda() {
		float valor = this.getValor() + (this.isProducaoPropria() ? 2 : 0);		
		float valorDoce = valor * 0.20f;		
		float valorPorcao = valor * this.getPorcao(); 

		return valor + valorDoce + valorPorcao;
	}

	public boolean isDoce() {
		return doce;
	}
	public void setDoce(boolean doce) {
		this.doce = doce;
	}
	public int getPorcao() {
		return porcao;
	}
	public void setPorcao(int porcao) throws PorcaoInvalidaException {
		
		if(porcao < 1 && porcao > 10) {
			throw new PorcaoInvalidaException("Porção inválida.");
		}
		
		this.porcao = porcao;
	}
}