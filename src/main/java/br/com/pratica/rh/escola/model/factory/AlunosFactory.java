package br.com.pratica.rh.escola.model.factory;

import br.com.pratica.rh.escola.model.Aluno;
import br.com.pratica.rh.escola.model.vo.Cpf;
import br.com.pratica.rh.escola.model.vo.Email;

public class AlunosFactory {
	private Aluno aluno;
	
	public AlunosFactory comNomeCpfEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(new Cpf(cpf), nome, new Email(email));
		return this;
	}
	public AlunosFactory comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}
	public Aluno criar() {
		return this.aluno;
	}
	
}
