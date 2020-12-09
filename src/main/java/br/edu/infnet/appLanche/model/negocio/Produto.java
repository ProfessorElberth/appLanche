package br.edu.infnet.appLanche.model.negocio;

public abstract class Produto {

	private String descricao;
	private float valor;
	private boolean producaoPropria; 

	public Produto(String descricao, float valor, boolean producaoPropria) {
		this.descricao = descricao;
		this.valor = valor;
		this.producaoPropria = producaoPropria;
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.getDescricao());
		sb.append(";");
		sb.append(this.getValor());
		sb.append(";");
		sb.append(this.isProducaoPropria());
		
		return sb.toString();
	}
	
	public abstract float calcularValorVenda();

	public String getDescricao() {
		return descricao;
	}
	public float getValor() {
		return valor;
	}
	public boolean isProducaoPropria() {
		return producaoPropria;
	}
}