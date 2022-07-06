package br.com.pratica.rh.escola.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.pratica.rh.escola.model.funcionario.Funcionario;
import br.com.pratica.rh.esola.service.regrasalario.ValidacaoReajuste;

public class ReajusteService {
	
	private List<ValidacaoReajuste> validacoes;
	
	public void reajustarSalarioFuncionario(Funcionario funcionario, BigDecimal aumento) {
		
		this.validacoes.forEach(v -> v.Validar(funcionario, aumento));
		
		BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}

	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}
	
}
