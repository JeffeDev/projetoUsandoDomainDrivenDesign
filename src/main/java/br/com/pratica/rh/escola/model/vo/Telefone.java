package br.com.pratica.rh.escola.model.vo;

public class Telefone {
	private String ddd;
	private String numero;
	private String numeroFormatado;
	
	public Telefone(String ddd, String numero) {
	    
		if (ddd == null || numero == null ) {
	        throw new IllegalArgumentException("DDD e Numero sao obrigatorios!");
	    }
	    if (!ddd.matches("\\d{2}")) {
	        throw new IllegalArgumentException("DDD invalido!");
	    }
	    if (!numero.matches("\\d{8}|\\d{9}")) {
	        throw new IllegalArgumentException("Numero invalido!");
	    }
	    
		this.ddd = ddd;
		this.numero = numero;
		this.setNumeroFormatado(imprimeTelefone(ddd, numero));
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}
	
	public static String imprimeTelefone(String ddd, String numero) {
		if (numero.length() == 8) {
			return ("(" + ddd + ")" +" "+ numero.substring(0, 4) + "-"
					+ numero.substring(5, 8));	
		} else
		return ("(" + ddd + ")" +" "+ numero.substring(0, 5) + "-"
				+ numero.substring(6, 9));
	}

	public String getNumeroFormatado() {
		return numeroFormatado;
	}

	public void setNumeroFormatado(String numeroFormatado) {
		this.numeroFormatado = numeroFormatado;
	}
	
}
