package br.com.pratica.rh.escola.service.reajustes;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteTributavel {
	private BigDecimal valor;
	private LocalDate data;
	
	public Promocao(BigDecimal valor, LocalDate data) {
		super();
		this.valor = valor;
		this.data = LocalDate.now();
	}

	@Override
	public BigDecimal valor() {
		return valor;
	}

	@Override
	public LocalDate data() {
		return data;
	}

	@Override
	public BigDecimal valorTributo() {
		return valor.multiply(new BigDecimal("0.1"));
	}

}
