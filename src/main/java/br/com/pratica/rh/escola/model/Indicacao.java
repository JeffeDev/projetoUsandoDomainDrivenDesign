package br.com.pratica.rh.escola.model;

import java.time.LocalDateTime;

public class Indicacao {
	private Aluno quemIndicou;
	private Aluno foiIndicado;
	private LocalDateTime dataIndicacao;
	
	public Indicacao(Aluno quemIndicou, Aluno foiIndicado) {
		this.quemIndicou = quemIndicou;
		this.foiIndicado = foiIndicado;
		this.dataIndicacao = LocalDateTime.now();
	}

	public Aluno getQuemIndicou() {
		return quemIndicou;
	}

	public Aluno getFoiIndicado() {
		return foiIndicado;
	}

	public LocalDateTime getDataIndicacao() {
		return dataIndicacao;
	}
	
	
	
	
}
