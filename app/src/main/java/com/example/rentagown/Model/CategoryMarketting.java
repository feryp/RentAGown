package com.example.rentagown.Model;

import java.util.List;

public class CategoryMarketting {

    String title;
    List<ItemMarketting> itemMarkettingList;

    public CategoryMarketting(String title, List<ItemMarketting> itemMarkettingList) {
        this.title = title;
        this.itemMarkettingList = itemMarkettingList;
    }

    public List<ItemMarketting> getItemMarkettingList() {
        return itemMarkettingList;
    }

    public void setItemMarkettingList(List<ItemMarketting> itemMarkettingList) {
        this.itemMarkettingList = itemMarkettingList;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
