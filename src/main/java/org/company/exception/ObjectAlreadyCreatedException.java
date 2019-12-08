package org.company.exception;

public class ObjectAlreadyCreatedException extends RuntimeException {

    public ObjectAlreadyCreatedException(String message) {
        super(message);
    }
}
