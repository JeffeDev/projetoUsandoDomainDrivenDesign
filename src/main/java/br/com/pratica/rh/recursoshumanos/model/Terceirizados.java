package br.com.pratica.rh.recursoshumanos.model;

import javax.persistence.Entity;

@Entity
public class Terceirizados {
	private Long idTerceirizado;
	private String empresaTerceirizada;
	private DadosPessoais dadosPessoais;
	
	public Terceirizados(Long idTerceirizado, String empresaTerceirizada, DadosPessoais dadosPessoais) {
		super();
		this.idTerceirizado = idTerceirizado;
		this.empresaTerceirizada = empresaTerceirizada;
		this.dadosPessoais = dadosPessoais;
	}

	public Long getIdTerceirizado() {
		return idTerceirizado;
	}

	public void setIdTerceirizado(Long idTerceirizado) {
		this.idTerceirizado = idTerceirizado;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
	
	public String getEmpresaTerceirizada() {
		return empresaTerceirizada;
	}

	public void setEmpresaTerceirizada(String empresaTerceirizada) {
		this.empresaTerceirizada = empresaTerceirizada;
	}

}
