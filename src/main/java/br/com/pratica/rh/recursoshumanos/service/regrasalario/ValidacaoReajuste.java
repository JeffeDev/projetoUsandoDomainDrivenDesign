package br.com.pratica.rh.recursoshumanos.service.regrasalario;

import java.math.BigDecimal;

import br.com.pratica.rh.recursoshumanos.model.Funcionario;

public interface ValidacaoReajuste {
	void Validar(Funcionario funcionario, BigDecimal aumento);
}
