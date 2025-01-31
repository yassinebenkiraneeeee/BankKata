package org.example;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private final List<Transaction> transactions = new ArrayList<>();

    public void deposit(int amount) {
        transactions.add(new Transaction(amount));
    }

    public void withdraw(int amount) {
        transactions.add(new Transaction(-amount));
    }

    public void printStatement() {
        int balance = 0;
        System.out.println("Date       | Montant | Solde");
        List<String> statementLines = new ArrayList<>();

        for (Transaction transaction : transactions) {
            balance += transaction.getAmount();
            statementLines.add(transaction.getDate() + " | " + transaction.getAmount() + " | " + balance);
        }

        for (int i = statementLines.size() - 1; i >= 0; i--) {
            System.out.println(statementLines.get(i));
        }
    }
}
