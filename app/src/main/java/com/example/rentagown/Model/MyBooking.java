package com.example.rentagown.Model;

public class MyBooking {

    int imageProduct;
    private String nameProduct;
    private String statusBooking;
    private String dateTransaction;
    private String startDateBooking;
    private String endDateBooking;
    private String price;
    private String dpPaid;
    private String remainingBills;

    public MyBooking(int imageProduct, String nameProduct, String statusBooking, String dateTransaction, String startDateBooking, String endDateBooking, String price, String dpPaid, String remainingBills) {
        this.imageProduct = imageProduct;
        this.nameProduct = nameProduct;
        this.statusBooking = statusBooking;
        this.dateTransaction = dateTransaction;
        this.startDateBooking = startDateBooking;
        this.endDateBooking = endDateBooking;
        this.price = price;
        this.dpPaid = dpPaid;
        this.remainingBills = remainingBills;
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

    public String getStatusBooking() {
        return statusBooking;
    }

    public void setStatusBooking(String statusBooking) {
        this.statusBooking = statusBooking;
    }

    public String getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public String getStartDateBooking() {
        return startDateBooking;
    }

    public void setStartDateBooking(String startDateBooking) {
        this.startDateBooking = startDateBooking;
    }

    public String getEndDateBooking() {
        return endDateBooking;
    }

    public void setEndDateBooking(String endDateBooking) {
        this.endDateBooking = endDateBooking;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDpPaid() {
        return dpPaid;
    }

    public void setDpPaid(String dpPaid) {
        this.dpPaid = dpPaid;
    }

    public String getRemainingBills() {
        return remainingBills;
    }

    public void setRemainingBills(String remainingBills) {
        this.remainingBills = remainingBills;
    }


}
