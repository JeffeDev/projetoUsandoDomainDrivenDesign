package br.com.pratica.rh.escola.testarclasses;

import br.com.pratica.rh.escola.model.aluno.Aluno;
import br.com.pratica.rh.escola.model.factory.AlunosFactory;

public class Testar {

	public static void main(String[] args) {
		AlunosFactory fabrica = new AlunosFactory();
		
		Aluno aluno = fabrica.comNomeCpfEmail("Jefferson", "12205151835", "jeffe.info@gmail.com")
		.comTelefone("48", "999679641")
		.comTelefone("48", "999999999")
		.criar();

	}

}
