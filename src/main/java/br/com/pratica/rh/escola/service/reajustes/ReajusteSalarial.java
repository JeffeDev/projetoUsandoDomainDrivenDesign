package br.com.pratica.rh.escola.service.reajustes;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface ReajusteSalarial {
	BigDecimal valor();
	LocalDate data();
}
