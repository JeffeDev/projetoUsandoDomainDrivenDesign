package br.com.pratica.rh.escola.model.vo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	private String endereco;

	public Email(String email) {
        boolean isEmailIdValid = false;
        
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        if (!isEmailIdValid) {
        	throw new IllegalArgumentException("Email invalido!");
        }
	}

	public String getEndereco() {
		return endereco;
	}
	
}
