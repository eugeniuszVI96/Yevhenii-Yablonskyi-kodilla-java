package com.kodilla.good.patterns.airport.exception;

public class RepositoryIsEmptyException extends Exception {

    public RepositoryIsEmptyException(final String message) {
        super(message);
    }
}
