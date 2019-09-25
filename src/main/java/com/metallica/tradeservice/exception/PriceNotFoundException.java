package com.metallica.tradeservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public
class PriceNotFoundException extends RuntimeException {
    public
    PriceNotFoundException (String cause) {
        super ( cause );
    }
}