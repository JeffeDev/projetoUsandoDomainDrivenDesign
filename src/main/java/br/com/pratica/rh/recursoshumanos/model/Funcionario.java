package br.com.pratica.rh.recursoshumanos.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private DadosPessoais dadosPessoais;
	private BigDecimal salario;
	
	private LocalDate dataUltimoReajuste;	
	
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Funcionario(Long id, DadosPessoais dadosPessoais, LocalDate dataUltimoReajuste, BigDecimal salario) {
		super();
		this.id = id;
		this.dadosPessoais = dadosPessoais;
		this.dataUltimoReajuste = dataUltimoReajuste;
		this.salario = salario;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public Cargo getCargo() {
		return dadosPessoais.getCargo();
	}

	public BigDecimal getSalario() {
		return dadosPessoais.getSalario();
	}

	public void atualizarSalario(BigDecimal salarioReajustado) {
		this.salario = salarioReajustado;
	}
	
	public void promover(Cargo novoCargo) {
		dadosPessoais.setCargo(novoCargo);
	}


}
