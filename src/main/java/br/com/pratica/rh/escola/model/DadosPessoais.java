package br.com.pratica.rh.escola.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import br.com.pratica.rh.escola.model.funcionario.Cargo;
import br.com.pratica.rh.escola.model.vo.Cpf;
import br.com.pratica.rh.escola.model.vo.Email;
import br.com.pratica.rh.escola.model.vo.Telefone;

@Entity
public class DadosPessoais {
	private String nome;
	@Id
	private Cpf cpf;
	@Enumerated(EnumType.STRING) 
	private Cargo cargo;
	private BigDecimal salario;
	private Email email;
	
	private List<Telefone> telefones = new ArrayList<>();
	
	public void adicionarTelefone(String ddd, String numero) {
		this.telefones.add( new Telefone(ddd, numero) );
	}
	
	public DadosPessoais(String nome, Cpf cpf, Cargo cargo, BigDecimal salario, Email email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
		this.email = email;
	}
	public Cpf getCpf() {
		return cpf;
	}
	public Email getEmail() {
		return email;
	}
	public DadosPessoais() {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	
}
