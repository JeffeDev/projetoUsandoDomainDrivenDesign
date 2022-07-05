package br.com.pratica.rh.recursoshumanos.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.pratica.rh.recursoshumanos.ValidacaoException;
import br.com.pratica.rh.recursoshumanos.model.Funcionario;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste{
	
	public void Validar(Funcionario funcionario, BigDecimal aumento) {
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		
		Long mesesDoUltimoReajuste = ChronoUnit.MONTHS.between( dataUltimoReajuste, dataAtual );
		
		if (mesesDoUltimoReajuste < 6) {
			throw new ValidacaoException("Intervalo entre reajustes deve ser de no mínimo 6 meses !");
		}
	}
	
}
