package org.example;

// Клас BankAccount
public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;

    public BankAccount(int accountNumber, String accountName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Баланс не може бути від'ємним.");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) throws NegativeAmountException, InsufficientFundsException {
        if (amount < 0) {
            throw new NegativeAmountException("Сума переказу не може бути від'ємною.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Недостатньо коштів для переказу.");
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountSummary() {
        return "ID облікового запису: " + accountNumber + "\nІм'я облікового запису: " + accountName + "\nБаланс: " + balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
