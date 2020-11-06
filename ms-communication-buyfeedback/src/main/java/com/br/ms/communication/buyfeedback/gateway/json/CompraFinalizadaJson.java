package com.br.ms.communication.buyfeedback.gateway.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CompraFinalizadaJson {

    private CompraChaveJson compraChaveJson;
    private String mensagem;
    private boolean pagamentoOK;
    
	public CompraChaveJson getCompraChaveJson() {
		return compraChaveJson;
	}
	public void setCompraChaveJson(CompraChaveJson compraChaveJson) {
		this.compraChaveJson = compraChaveJson;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public boolean isPagamentoOK() {
		return pagamentoOK;
	}
	public void setPagamentoOK(boolean pagamentoOK) {
		this.pagamentoOK = pagamentoOK;
	}
	
	public CompraFinalizadaJson(CompraChaveJson compraChaveJson, String mensagem, boolean pagamentoOK) {
		super();
		this.compraChaveJson = compraChaveJson;
		this.mensagem = mensagem;
		this.pagamentoOK = pagamentoOK;
	}
	
	public CompraFinalizadaJson() {
		super();
	}

}
