package com.example.zyberpasspro.common;

public class AdminNotFoundException extends RuntimeException {

   public AdminNotFoundException(Long id) {
        super("Could not find admin " + id);
    }
}