package org.example;// Клас Bank
import java.util.ArrayList;
import java.util.List;

// Тестовий клас
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        try {
            BankAccount account1 = bank.createAccount("John Doe", 1000);
            BankAccount account2 = bank.createAccount("Jane Doe", 500);

            System.out.println("Initial state:");
            System.out.println(account1.getAccountSummary());
            System.out.println(account2.getAccountSummary());

            System.out.println("\nTransferring money...");
            bank.transferMoney(account1.getAccountNumber(), account2.getAccountNumber(), 200);

            System.out.println("\nAfter transfer:");
            System.out.println(account1.getAccountSummary());
            System.out.println(account2.getAccountSummary());

            System.out.println("\nTrying to withdraw a negative amount...");
            account1.withdraw(-100);

        } catch (AccountNotFoundException | InsufficientFundsException | NegativeAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
