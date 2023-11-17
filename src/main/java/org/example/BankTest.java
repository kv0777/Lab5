package org.example;// Клас Bank
import java.util.ArrayList;
import java.util.List;

// Тестовий клас
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        try {
            BankAccount account1 = bank.createAccount("Володимир Стаценко", 7777);
            BankAccount account2 = bank.createAccount("Арсен Солов'ян", 6666);

            System.out.println("Початковий баланс:");
            System.out.println(account1.getAccountSummary());
            System.out.println(account2.getAccountSummary());

            System.out.println("\nЗачекайте, робимо переказ коштів.. :)");
            bank.transferMoney(account1.getAccountNumber(), account2.getAccountNumber(), 200);

            System.out.println("\nПісля переказу:");
            System.out.println(account1.getAccountSummary());
            System.out.println(account2.getAccountSummary());

            System.out.println("\nСпроба переказати від'ємну суму...");
            account1.withdraw(-100);

        } catch (AccountNotFoundException | InsufficientFundsException | NegativeAmountException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
