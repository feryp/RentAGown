package com.example.rentagown.Model;

public class SliderMainMenu {

    int idSlider;
    int image;
    private  String ItemName;
    private String price;

    public SliderMainMenu(int idSlider, int image, String ItemName, String price) {
        this.idSlider = idSlider;
        this.image = image;
        this.ItemName = ItemName;
        this.price = price;
    }

    public int getIdSlider() {
        return idSlider;
    }

    public void setIdSlider(int idSlider) {
        this.idSlider = idSlider;
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
