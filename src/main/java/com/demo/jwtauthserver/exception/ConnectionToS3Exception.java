package com.demo.jwtauthserver.exception;

public class ConnectionToS3Exception extends AuthServerException {

    public ConnectionToS3Exception() {
    }

    public ConnectionToS3Exception(String message) {
        super(message);
    }

    public ConnectionToS3Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ConnectionToS3Exception(Throwable cause) {
        super(cause);
    }
}
