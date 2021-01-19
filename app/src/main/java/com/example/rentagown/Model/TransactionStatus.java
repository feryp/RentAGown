package com.example.rentagown.Model;

public class TransactionStatus {

    private String dateTransaction;
    private int imageProduct;
    private String nameProduct;
    private String timeBTransaction;
    private String paymentMethod;
    private String priceTransaction;

    public TransactionStatus(String dateTransaction, int imageProduct, String nameProduct, String timeBTransaction, String paymentMethod, String priceTransaction) {
        this.dateTransaction = dateTransaction;
        this.imageProduct = imageProduct;
        this.nameProduct = nameProduct;
        this.timeBTransaction = timeBTransaction;
        this.paymentMethod = paymentMethod;
        this.priceTransaction = priceTransaction;
    }

    public String getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = dateTransaction;
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

    public String getTimeBTransaction() {
        return timeBTransaction;
    }

    public void setTimeBTransaction(String timeBTransaction) {
        this.timeBTransaction = timeBTransaction;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPriceTransaction() {
        return priceTransaction;
    }

    public void setPriceTransaction(String priceTransaction) {
        this.priceTransaction = priceTransaction;
    }
}
