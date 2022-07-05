package br.com.pratica.rh.escola.model.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class,
            () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
            () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
            () -> new Telefone("1", "123456789"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("12", "1234567"));

    }
    
    @Test
    void deveriaCriarTelefoneComDDDValidos() {
    	assertDoesNotThrow(
                () -> new Telefone("48", "123456789"));
    	assertDoesNotThrow(
                () -> new Telefone("48", "12345678"));
    }

}
