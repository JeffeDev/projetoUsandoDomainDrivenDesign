package br.com.pratica.rh.esola.service.regrasalario;

import java.math.BigDecimal;

import br.com.pratica.rh.escola.model.Funcionario;

public interface ValidacaoReajuste {
	void Validar(Funcionario funcionario, BigDecimal aumento);
}
