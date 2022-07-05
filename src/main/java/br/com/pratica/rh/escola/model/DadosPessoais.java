package br.com.pratica.rh.escola.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import br.com.pratica.rh.escola.model.vo.Cpf;

@Entity
public class DadosPessoais {
	private String nome;
	@Id
	private Cpf cpf;
	@Enumerated(EnumType.STRING) 
	private Cargo cargo;
	private BigDecimal salario;
	
	public DadosPessoais(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.nome = nome;
		//Cpf(cpf);
		this.cargo = cargo;
		this.salario = salario;
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
