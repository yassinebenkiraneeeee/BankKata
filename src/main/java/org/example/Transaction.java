package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private final int amount;
    private final String date;

    public Transaction(int amount) {
        this.amount = amount;
        this.date = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    }

    public int getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }
}
