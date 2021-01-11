package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.R;

public class ItemInvoiceViewHolder extends RecyclerView.ViewHolder{

    public TextView tvItemName;
    public TextView tvPrice;

    public ItemInvoiceViewHolder(@NonNull View itemView) {
        super(itemView);

        tvItemName = itemView.findViewById(R.id.tv_item_name_invoice);
        tvPrice = itemView.findViewById(R.id.tv_item_price_invoice);
    }
}
