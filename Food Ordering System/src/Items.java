package com.example.switchpage;

public class Items {
    private int food_id;
    private int quantity;
    private double price;

    private String food_name;

    public Items(int food_id,String food_name, double price,int quantity) {
        this.food_id = food_id;
        this.quantity = quantity;
        this.price = price;
        this.food_name = food_name;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public int getFood_id() {
        return food_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getFood_name() {
        return food_name;
    }

}
