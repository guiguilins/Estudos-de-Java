package Encapsulation.BankAccount.entities;

public class BankAccount {
    private int number;
    private String name;
    private double value;

    public BankAccount(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        depositValue(initialDeposit);
    }

    public BankAccount(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void depositValue(double amount) {
        value += amount;
    }

    public void withdraw(double amount) {
        value -= amount + 5.0;
    }

    public String toString() {
        return "Account: "
                + number
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", value);

    }
}
