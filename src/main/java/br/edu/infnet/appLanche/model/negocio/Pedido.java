package br.edu.infnet.appLanche.model.negocio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {

	private LocalDateTime data;
	private boolean web;
	private Solicitante solicitante;
	
	public Pedido() {
		this.data = LocalDateTime.now();
		this.web = Boolean.TRUE;
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		return String.format("%s;%s;%s", 
					this.getData().format(formatter),
					this.web,
					this.solicitante.toString()
				);
	}
	
	public LocalDateTime getData() {
		return data;
	}
	public boolean isWeb() {
		return web;
	}
	public void setWeb(boolean web) {
		this.web = web;
	}
	public Solicitante getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}
}