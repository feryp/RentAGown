package com.example.rentagown.Interface;

import com.example.rentagown.Model.Bank;

public interface OnMyListItemClick {
    OnMyListItemClick NULL = new OnMyListItemClick() {
        @Override
        public void onMyListItemClick(Bank bank) {
            //disini untuk klik pilih bank nya

        }

    };

    void onMyListItemClick(Bank bank);
}
