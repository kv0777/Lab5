package org.example;

// Спеціалізовані класи винятків
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
