package com.tourOfHerorsApi.exception;

public class HeroNotFound extends RuntimeException {


    public HeroNotFound(String message) {
        super(message);
    }
}
