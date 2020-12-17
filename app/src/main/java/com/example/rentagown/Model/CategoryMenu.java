package com.example.rentagown.Model;

public class CategoryMenu {
    int idCategory;
    String TitleCategory;

    public CategoryMenu(int idCategory, String titleCategory) {
        this.idCategory = idCategory;
        TitleCategory = titleCategory;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getTitleCategory() {
        return TitleCategory;
    }

    public void setTitleCategory(String titleCategory) {
        TitleCategory = titleCategory;
    }
}
