package com.example.rentagown.Model;

public class Promo {

    int imPromo;
    String Title, Desc;

    public Promo(int imPromo, String title, String desc) {
        this.imPromo = imPromo;
        Title = title;
        Desc = desc;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public int getImPromo() {
        return imPromo;
    }

    public void setImPromo(int imPromo) {
        this.imPromo = imPromo;
    }
}
