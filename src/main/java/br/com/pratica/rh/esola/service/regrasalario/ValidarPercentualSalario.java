package br.com.pratica.rh.esola.service.regrasalario;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.pratica.rh.escola.ValidacaoException;
import br.com.pratica.rh.escola.model.funcionario.Funcionario;

public class ValidarPercentualSalario implements ValidacaoReajuste{
	public void Validar(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
		
	}
}
