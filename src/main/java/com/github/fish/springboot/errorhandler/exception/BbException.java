package com.github.fish.springboot.errorhandler.exception;

import lombok.Getter;

@Getter
public class BbException extends RuntimeException {
    private String message;

    public BbException(String message) {
        this.message = message;
    }
}
