package com.example.rentagown.Model;

public class SliderMainMenu {

    int idSlider;
    int image;
    private  String title;
    private String price;

    public SliderMainMenu(int idSlider, int image, String title, String price) {
        this.idSlider = idSlider;
        this.image = image;
        this.title = title;
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


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
