package br.com.pratica.rh.recursoshumanos.service.regrapromocao;

import br.com.pratica.rh.recursoshumanos.ValidacaoException;
import br.com.pratica.rh.recursoshumanos.model.Cargo;
import br.com.pratica.rh.recursoshumanos.model.Funcionario;

public class PromocaoDeFuncionarios {
	public void promover(Funcionario funcionario, Boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		
		if(Cargo.GERENTE == cargoAtual ) {
			throw new ValidacaoException("Gerente é o cargo mássimo!");
		}
		
		if(metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionário não bateu a meta");
		}
	}
}
