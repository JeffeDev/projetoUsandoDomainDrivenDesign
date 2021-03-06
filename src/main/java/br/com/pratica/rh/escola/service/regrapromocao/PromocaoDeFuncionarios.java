package br.com.pratica.rh.escola.service.regrapromocao;

import br.com.pratica.rh.escola.ValidacaoException;
import br.com.pratica.rh.escola.model.funcionario.Cargo;
import br.com.pratica.rh.escola.model.funcionario.Funcionario;

public class PromocaoDeFuncionarios {
	public void promover(Funcionario funcionario, Boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		
		if(Cargo.GERENTE == cargoAtual ) {
			throw new ValidacaoException("Gerente é o cargo máximo!");
		}
		
		if(metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionário não bateu a meta");
		}
	}
}
