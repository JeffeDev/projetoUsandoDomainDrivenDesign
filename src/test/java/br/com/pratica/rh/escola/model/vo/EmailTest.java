/**
 * 
 */
package br.com.pratica.rh.escola.model.vo;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * @author Usuario
 *
 */
class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class, 
				() -> new Email(null));
		assertThrows(IllegalArgumentException.class, 
				() -> new Email(""));
		assertThrows(IllegalArgumentException.class, 
				() -> new Email("emailinvalido"));
	}
	
	@Test
	void deveriaCriarEmailsComEnderecosvalidos() {
		assertDoesNotThrow( 
				() -> new Email("jeffe.info@gmail.com"));
	}

}
