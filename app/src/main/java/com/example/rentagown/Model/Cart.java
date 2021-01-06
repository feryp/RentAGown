package com.example.rentagown.Model;

public class Cart {
    int image;
    String itemName;
    String categoryGown;
    String specialTreatment;
    String price;
    String dateBooking;

    public Cart(int image, String itemName, String categoryGown, String specialTreatment, String price, String dateBooking) {
        this.image = image;
        this.itemName = itemName;
        this.categoryGown = categoryGown;
        this.specialTreatment = specialTreatment;
        this.price = price;
        this.dateBooking = dateBooking;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategoryGown() {
        return categoryGown;
    }

    public void setCategoryGown(String categoryGown) {
        this.categoryGown = categoryGown;
    }

    public String getSpecialTreatment() {
        return specialTreatment;
    }

    public void setSpecialTreatment(String specialTreatment) {
        this.specialTreatment = specialTreatment;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }
}
