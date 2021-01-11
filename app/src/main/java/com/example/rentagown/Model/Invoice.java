package com.example.rentagown.Model;

public class Invoice {
    private String ItemName;
    private String price;

    public Invoice(String itemName, String price) {
        ItemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
