package com.example.rentagown.Model;

public class NotifTransaction {
    String dateTransaction;
    String ItemName;
    String dateBook;
    String timeBook;
    String statusPayment;
    String price;
    String statusHistory;

    public NotifTransaction(String dateTransaction, String itemName, String dateBook, String timeBook, String statusPayment, String price, String statusHistory) {
        this.dateTransaction = dateTransaction;
        ItemName = itemName;
        this.dateBook = dateBook;
        this.timeBook = timeBook;
        this.statusPayment = statusPayment;
        this.price = price;
        this.statusHistory = statusHistory;
    }

    public String getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getDateBook() {
        return dateBook;
    }

    public void setDateBook(String dateBook) {
        this.dateBook = dateBook;
    }

    public String getTimeBook() {
        return timeBook;
    }

    public void setTimeBook(String timeBook) {
        this.timeBook = timeBook;
    }

    public String getStatusPayment() {
        return statusPayment;
    }

    public void setStatusPayment(String statusPayment) {
        this.statusPayment = statusPayment;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatusHistory() {
        return statusHistory;
    }

    public void setStatusHistory(String statusHistory) {
        this.statusHistory = statusHistory;
    }
}
