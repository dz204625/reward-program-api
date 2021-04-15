package com.example.reward.program.modal;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "transaction")
public class Transaction {
    private long id;
    private String product;
    private int amount;
    private String date;
    private int reward;

    public Transaction() {

    }

    public Transaction(String product, int amount, String date, int reward) {
        this.product = product;
        this.amount = amount;
        this.date = date;
        this.reward = reward;
    }

    public long getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
}
