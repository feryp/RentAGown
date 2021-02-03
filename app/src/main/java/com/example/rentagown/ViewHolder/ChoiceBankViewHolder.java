package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.Bank;
import com.example.rentagown.R;

import java.util.List;

public class ChoiceBankViewHolder extends RecyclerView.ViewHolder {

    public TextView tvNameBank;
    public TextView tvAccountNameBank;
    public TextView tvAccountNumberBank;
    public ImageView imLogoBank;
    public View container;

    public ChoiceBankViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNameBank = itemView.findViewById(R.id.tv_name_bank_list);
        tvAccountNameBank = itemView.findViewById(R.id.tv_account_name_bank_list);
        tvAccountNumberBank = itemView.findViewById(R.id.tv_account_number_bank_list);
        imLogoBank = itemView.findViewById(R.id.im_logo_bank_list);
        container = itemView.findViewById(R.id.container_list_bank);

    }


    public void bind(List<Bank> bankList) {
    }
}
