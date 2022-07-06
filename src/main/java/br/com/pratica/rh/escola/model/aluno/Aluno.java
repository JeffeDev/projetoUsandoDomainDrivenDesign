package br.com.pratica.rh.escola.model.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.pratica.rh.escola.model.vo.Cpf;
import br.com.pratica.rh.escola.model.vo.Email;
import br.com.pratica.rh.escola.model.vo.Telefone;

public class Aluno {
	private Cpf cpf;
	private String nome;
	private Email email;
	private List<Telefone> telefones = new ArrayList<>();
	
	public void adicionarTelefone(String ddd, String numero) {
		this.telefones.add( new Telefone(ddd, numero) );
	}
	
	public Aluno(Cpf cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public Cpf getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public Email getEmail() {
		return email;
	}


}
