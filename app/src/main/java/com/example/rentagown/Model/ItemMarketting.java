package com.example.rentagown.Model;

public class ItemMarketting {

    int itemId;
    int imageContent;
    String title;
    String price;

    public ItemMarketting(int itemId, int imageContent, String title, String price) {
        this.itemId = itemId;
        this.imageContent = imageContent;
        this.title = title;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getImageContent() {
        return imageContent;
    }

    public void setImageContent(int imageContent) {
        this.imageContent = imageContent;
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
