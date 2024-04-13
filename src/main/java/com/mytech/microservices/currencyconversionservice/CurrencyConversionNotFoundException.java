package com.mytech.microservices.currencyconversionservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
// @ResponseStatus(code = HttpStatus.NOT_FOUND)  => pour bien spécifier le code de status NotFound '404
// de retour aprés chaque request quand la resorce n'esiste pas
public class CurrencyConversionNotFoundException extends RuntimeException {
    public CurrencyConversionNotFoundException(String message) {
        super(message);
    }
}