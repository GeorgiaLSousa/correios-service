package com.correio.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CepInexistente extends RuntimeException {


/*
    * Exceção lançada quando o CEP consultado não existe.
 */
    public CepInexistente(String message) {
        super(message);
    }
}
