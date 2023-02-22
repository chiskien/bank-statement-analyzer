package org.chiskien;

import java.time.LocalDate;

public class BankStatement {
    private final double amount;
    private final String description;
    private final LocalDate date;

    public BankStatement(double amount, String description, LocalDate date) {
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }


}
