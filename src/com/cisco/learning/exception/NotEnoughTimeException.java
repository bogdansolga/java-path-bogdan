package com.cisco.learning.exception;

public class NotEnoughTimeException extends RuntimeException {
    public NotEnoughTimeException() {
        System.err.println("There's not enough time");
    }
}
