package br.com.pratica.rh.recursoshumanos.service.reajustes;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface ReajusteSalarial {
	BigDecimal valor();
	LocalDate data();
}
