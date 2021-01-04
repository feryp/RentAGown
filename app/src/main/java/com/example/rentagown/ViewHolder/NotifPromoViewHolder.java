package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.R;

public class NotifPromoViewHolder extends RecyclerView.ViewHolder{
    public TextView tvDatePromo;
    public TextView tvNamePromo;
    public TextView tvDiscountPromo;
    public TextView tvDescPromo;

    public NotifPromoViewHolder(@NonNull View itemView) {
        super(itemView);

        tvDatePromo = itemView.findViewById(R.id.tv_date_promo_notif);
        tvNamePromo = itemView.findViewById(R.id.tv_name_promo_notif);
        tvDiscountPromo = itemView.findViewById(R.id.tv_discount_promo_notif);
        tvDescPromo = itemView.findViewById(R.id.tv_desc_promo_notif);
    }
}
