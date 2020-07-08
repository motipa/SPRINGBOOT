package com.example.zyberpasspro.common;

public class AnswerNotFoundException extends RuntimeException {
    public AnswerNotFoundException(Long id) {
        super("Could not find Answer " + id);
    }

}
