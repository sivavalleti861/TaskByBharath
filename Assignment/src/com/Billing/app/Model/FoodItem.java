package com.Billing.app.Model;

public class FoodItem {
    private int srno;
    private String itemName;
    private double price;

    public FoodItem(int srno, String itemName, double price) {
        this.srno = srno;
        this.itemName = itemName;
        this.price = price;
    }

    // Getters
    public int getSrno() {
        return srno;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
}
