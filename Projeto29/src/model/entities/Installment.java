package model.entities;

import java.time.LocalDateTime;

public class Installment {
    private LocalDateTime dueDate;
    public double amount;

    public Installment(LocalDateTime dueDate, double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Installment() {
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
}
