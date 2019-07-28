package com.github.fish.springboot.errorhandler.exception;

import lombok.Getter;

@Getter
public class AaException extends RuntimeException {
    private String message;

    public AaException(String message) {
        this.message = message;
    }
}
