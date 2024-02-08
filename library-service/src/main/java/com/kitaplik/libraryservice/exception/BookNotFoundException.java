package com.kitaplik.libraryservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException {

    private ExceptionMessage exceptionMessage;

    public BookNotFoundException(String message) {
        super(message);
    }

    public BookNotFoundException(ExceptionMessage message) {
        this.exceptionMessage = message;
    }

    public ExceptionMessage getExceptionMessage() {
        return exceptionMessage;
    }

}
