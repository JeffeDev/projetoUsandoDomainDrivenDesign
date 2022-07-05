package br.com.pratica.rh.escola.model.vo;

public class Telefone {
	private String ddd;
	private String numero;
	
	public Telefone(String ddd, String numero) {
		if(ddd.length() < 2) {
			throw new IllegalArgumentException("DDD inválido!");
		}
		
		if(numero.length() < 8) {
			throw new IllegalArgumentException("Telefone inválido!");
		}
		this.ddd = ddd;
		this.numero = numero;
	}
	
}
