package com.example.rentagown.Model;

public class Wishlist {
    int image;
    private String ItemName;
    private String price;

    public Wishlist(int image, String itemName, String price) {
        this.image = image;
        ItemName = itemName;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
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
