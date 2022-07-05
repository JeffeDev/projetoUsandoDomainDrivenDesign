package br.com.pratica.rh.escola.model.vo;

public class Cpf {
	private String numero;

	public Cpf(String numero) {
	    if(numero == null || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")){
	        throw new IllegalArgumentException("CPF invalido!");
	    }
		this.numero = numero;
	}
	
}
