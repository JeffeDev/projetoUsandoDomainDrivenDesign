package br.com.pratica.rh.recursoshumanos.service;

import java.math.BigDecimal;

import br.com.pratica.rh.recursoshumanos.model.Funcionario;

public interface ValidacaoReajuste {
	void Validar(Funcionario funcionario, BigDecimal aumento);
}
