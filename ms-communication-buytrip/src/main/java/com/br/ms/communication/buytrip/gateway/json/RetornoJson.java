package com.br.ms.communication.buytrip.gateway.json;

public class RetornoJson {
	
	private String mensagem;
	private String chavePesquisa;
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getChavePesquisa() {
		return chavePesquisa;
	}
	public void setChavePesquisa(String chavePesquisa) {
		this.chavePesquisa = chavePesquisa;
	}
	
	public RetornoJson(String mensagem, String chavePesquisa) {
		super();
		this.mensagem = mensagem;
		this.chavePesquisa = chavePesquisa;
	}
	
	public RetornoJson() {
		super();
	}

}
