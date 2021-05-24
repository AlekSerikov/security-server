package com.demo.jwtauthserver.exception;

public class NoSuchUserException extends AuthServerException {

    public NoSuchUserException() {
    }

    public NoSuchUserException(String message) {
        super(message);
    }

    public NoSuchUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchUserException(Throwable cause) {
        super(cause);
    }
}
