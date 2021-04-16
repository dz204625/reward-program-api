package com.example.reward.program.modal;


import javax.persistence.*;

@Entity
@Table (name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "product")
    private String product;

    @Column (name = "amount")
    private int amount;

    @Column (name = "date")
    private String date;

    @Column (name = "reward")
    private int reward;

    public Transaction() {

    }

    public Transaction(String product, int amount) {
        this.product = product;
        this.amount = amount;

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

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
}
