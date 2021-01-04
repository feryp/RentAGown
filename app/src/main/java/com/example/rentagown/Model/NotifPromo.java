package com.example.rentagown.Model;

public class NotifPromo {
    String datePromo;
    String namePromo;
    String discountPromo;
    String descPromo;

    public NotifPromo(String datePromo, String namePromo, String discountPromo, String descPromo) {
        this.datePromo = datePromo;
        this.namePromo = namePromo;
        this.discountPromo = discountPromo;
        this.descPromo = descPromo;
    }

    public String getDatePromo() {
        return datePromo;
    }

    public void setDatePromo(String datePromo) {
        this.datePromo = datePromo;
    }

    public String getNamePromo() {
        return namePromo;
    }

    public void setNamePromo(String namePromo) {
        this.namePromo = namePromo;
    }

    public String getDiscountPromo() {
        return discountPromo;
    }

    public void setDiscountPromo(String discountPromo) {
        this.discountPromo = discountPromo;
    }

    public String getDescPromo() {
        return descPromo;
    }

    public void setDescPromo(String descPromo) {
        this.descPromo = descPromo;
    }




}
