package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.R;
import com.makeramen.roundedimageview.RoundedImageView;

public class TransactionStatusViewHolder extends RecyclerView.ViewHolder {

    public TextView tvDateTransaction, tvNameProduct, tvTimeTrasaction, tvPaymentMethod, tvPriceTransaction;
    public RoundedImageView imProductTransaction;


    public TransactionStatusViewHolder(@NonNull View itemView) {
        super(itemView);

        tvDateTransaction = itemView.findViewById(R.id.tv_date_transaction_payment);
        tvNameProduct = itemView.findViewById(R.id.tv_name_dress_transaction);
        imProductTransaction = itemView.findViewById(R.id.im_product_transaction);
        tvTimeTrasaction = itemView.findViewById(R.id.tv_time_transaction);
        tvPaymentMethod = itemView.findViewById(R.id.tv_payment_method_transaction);
        tvPriceTransaction = itemView.findViewById(R.id.tv_total_price_transaction);

    }
}
