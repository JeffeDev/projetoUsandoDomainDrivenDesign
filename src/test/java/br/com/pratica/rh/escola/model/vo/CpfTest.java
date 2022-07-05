package br.com.pratica.rh.escola.model.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CpfTest {

	@Test
	void naoDeveriaPermitirCpfInvalido() {
		assertThrows(IllegalArgumentException.class, 
				() -> new Cpf(null));
		assertThrows(IllegalArgumentException.class, 
				() -> new Cpf("00000000000"));
		assertThrows(IllegalArgumentException.class, 
				() -> new Cpf("11111111111"));
		assertThrows(IllegalArgumentException.class, 
				() -> new Cpf("22222222222"));
		assertThrows(IllegalArgumentException.class, 
				() -> new Cpf("33333333333"));
		assertThrows(IllegalArgumentException.class, 
				() -> new Cpf("44444444444"));
		assertThrows(IllegalArgumentException.class, 
				() -> new Cpf("55555555555"));
		assertThrows(IllegalArgumentException.class, 
				() -> new Cpf("66666666666"));
		assertThrows(IllegalArgumentException.class, 
				() -> new Cpf("77777777777"));
		assertThrows(IllegalArgumentException.class, 
				() -> new Cpf("88888888888"));
		assertThrows(IllegalArgumentException.class, 
				() -> new Cpf("99999999999"));
		assertThrows(IllegalArgumentException.class, 
				() -> new Cpf("35333535354"));
		assertThrows(IllegalArgumentException.class, 
				() -> new Cpf("353535353"));

	}
	@Test
	void deveriaPermitirCpfestaCorretoComCaracteres() {
        assertDoesNotThrow(() -> new Cpf("122.051.518-35"));
    }
	@Test
	void deveriaPermitirCpfestaCorreto() {
        assertDoesNotThrow(() -> new Cpf("12205151835"));
    }

}
