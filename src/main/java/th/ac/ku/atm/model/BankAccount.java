package th.ac.ku.atm.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BankAccount {

    private int id;
    private int customerId;
    private String type;
    private double balance;

    //  ..Generate.. Getters, Setters, toString()

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double deposit) {
        this.balance = this.balance + deposit;
    }

    public void withdraw(double withdraw) {
        this.balance = this.balance - withdraw;
    }

    @Override
    public String toString(){
        return "BankAccount{" +
                "id=" + id +
                ", customerId" + customerId + '\'' +
                ", type" + type + '\'' +
                ", balance=" + balance +
                '}';
    }
}

