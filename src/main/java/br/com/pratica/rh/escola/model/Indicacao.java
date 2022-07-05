package br.com.pratica.rh.escola.model;

public class Indicacao {
	private Aluno quemIndicou;
	private Aluno foiIndicado;
	
	public Indicacao(Aluno quemIndicou, Aluno foiIndicado) {
		this.quemIndicou = quemIndicou;
		this.foiIndicado = foiIndicado;
	}
	
	
}
