package br.com.pratica.rh.escola.model;

public enum Cargo {

	ASSISTENTE {
		@Override
		public Cargo getProximoCargo() {
			return DESENVOLVEDOR_JAVA;
		}
	},
	DESENVOLVEDOR_JAVA {
		@Override
		public Cargo getProximoCargo() {
			return ANALISTA;
		}
	},
	ANALISTA {
		@Override
		public Cargo getProximoCargo() {
			return ESPECIALISTA;
		}
	},
	ESPECIALISTA {
		@Override
		public Cargo getProximoCargo() {
			return GERENTE;
		}
	},
	GERENTE {
		@Override
		public Cargo getProximoCargo() {
			return GERENTE;
		}
	};

	public abstract Cargo getProximoCargo();

}
