package com.hypermatrix.exception;

/**
 * Created by anian on 2016/6/25.
 */
public class AdminException extends RuntimeException {
    public AdminException() {
        super();
    }

    public AdminException(String message) {
        super(message);
    }

    public AdminException(String message, Throwable cause) {
        super(message, cause);
    }

    public AdminException(Throwable cause) {
        super(cause);
    }

    protected AdminException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
