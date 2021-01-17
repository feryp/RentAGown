package com.example.rentagown.Model;

public class History {
    private int imageProduct;
    private String nameProduct;
    private String categoryProduct;
    private String statusHistory;
    private String dateHistory;
    private String totalPrice;

    public History(int imageProduct, String nameProduct, String categoryProduct, String statusHistory, String dateHistory, String totalPrice) {
        this.imageProduct = imageProduct;
        this.nameProduct = nameProduct;
        this.categoryProduct = categoryProduct;
        this.statusHistory = statusHistory;
        this.dateHistory = dateHistory;
        this.totalPrice = totalPrice;
    }

    public int getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(int imageProduct) {
        this.imageProduct = imageProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(String categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    public String getStatusHistory() {
        return statusHistory;
    }

    public void setStatusHistory(String statusHistory) {
        this.statusHistory = statusHistory;
    }

    public String getDateHistory() {
        return dateHistory;
    }

    public void setDateHistory(String dateHistory) {
        this.dateHistory = dateHistory;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}
