package br.com.pratica.rh.recursoshumanos.service.reajustes;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Quinquenio implements ReajusteSalarial {
	private BigDecimal valor;
	private LocalDate data;
	
	public Quinquenio(BigDecimal valor, LocalDate data) {
		this.valor = valor;
		this.data = data;
	}

	@Override
	public BigDecimal valor() {
		return this.valor;
	}

	@Override
	public LocalDate data() {
		return this.data;
	}

	@Override
	public BigDecimal valorTributo() {
		return BigDecimal.ZERO;
	}

}
