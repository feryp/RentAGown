package com.example.rentagown.Model;

public class Product {
    int idProduct;
    int image;
    private String ItemName;
    private String price;

    public Product(int idProduct, int image, String itemName, String price) {
        this.idProduct = idProduct;
        this.image = image;
        ItemName = itemName;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
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
