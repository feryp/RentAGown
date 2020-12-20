package com.example.rentagown.Model;

public class OnBoadingItem {

    String Tittle, Description;
    int ScreenImg;

    public OnBoadingItem(String tittle, String description, int screenImg) {
        Tittle = tittle;
        Description = description;
        ScreenImg = screenImg;
    }

    public String getTittle() {
        return Tittle;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }
}
