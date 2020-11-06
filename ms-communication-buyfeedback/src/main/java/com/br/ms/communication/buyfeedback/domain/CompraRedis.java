package com.br.ms.communication.buyfeedback.domain;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("compra")
public class CompraRedis {

	@Id
	private String id;
	private String mensagem;
	
	private Integer codigoPassagem;
	private Integer nroCartao;
	private BigDecimal valorPassagem;
	
	private boolean pagamentoOK;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Integer getCodigoPassagem() {
		return codigoPassagem;
	}

	public void setCodigoPassagem(Integer codigoPassagem) {
		this.codigoPassagem = codigoPassagem;
	}

	public Integer getNroCartao() {
		return nroCartao;
	}

	public void setNroCartao(Integer nroCartao) {
		this.nroCartao = nroCartao;
	}

	public BigDecimal getValorPassagem() {
		return valorPassagem;
	}

	public void setValorPassagem(BigDecimal valorPassagem) {
		this.valorPassagem = valorPassagem;
	}

	public boolean isPagamentoOK() {
		return pagamentoOK;
	}

	public void setPagamentoOK(boolean pagamentoOK) {
		this.pagamentoOK = pagamentoOK;
	}

	public CompraRedis(String id, String mensagem, Integer codigoPassagem, Integer nroCartao, BigDecimal valorPassagem,
			boolean pagamentoOK) {
		super();
		this.id = id;
		this.mensagem = mensagem;
		this.codigoPassagem = codigoPassagem;
		this.nroCartao = nroCartao;
		this.valorPassagem = valorPassagem;
		this.pagamentoOK = pagamentoOK;
	}

	public CompraRedis() {
		super();
	}

}
