package br.edu.infnet.appLanche.model.negocio;

public class Solicitante {

	private String nome;
	private String cpf;
	private String email;

	public Solicitante(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome());
		sb.append(";");
		sb.append(this.getCpf());
		sb.append(";");
		sb.append(this.getEmail());
		
		return sb.toString();
	}

	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEmail() {
		return email;
	}
}