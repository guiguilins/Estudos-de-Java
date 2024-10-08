package Exception.ExceptionAccount.models.entities;

import Exception.ExceptionAccount.models.exceptions.AccountException;

public class Account {
    private Integer number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(Integer number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;

    }

    public void withdraw(double amount) {
        validateWithdraw(amount);
        balance -= amount;
    }

    private void validateWithdraw(double amount) {
        if (amount > getWithdrawLimit()) {
            throw new AccountException("The amount exceeds withdraw limit");
        }
        if (amount > getBalance()) {
            throw new AccountException("Not enough balance");
        }
    }
}
