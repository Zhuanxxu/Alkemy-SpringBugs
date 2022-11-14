package com.alkemy.wallet.exception;

//@ResponseStatus(code= HttpStatus.BAD_REQUEST)
public class TransactionException extends RuntimeException {
    public TransactionException(String error) {
        super(error);
    }
}
