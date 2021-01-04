package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.R;

public class NotifTransactionViewHolder extends RecyclerView.ViewHolder{

    public TextView tvDateTransaction;
    public TextView tvNameProduct;
    public TextView tvDateBooking;
    public TextView tvTimeBooking;
    public TextView tvStatusPayment;
    public TextView tvPriceProduct;
    public TextView tvStatusNotif;

    public NotifTransactionViewHolder(@NonNull View itemView) {
        super(itemView);

        tvDateTransaction = itemView.findViewById(R.id.tv_date_transaction_notif);
        tvNameProduct = itemView.findViewById(R.id.tv_name_product_notif);
        tvDateBooking = itemView.findViewById(R.id.tv_date_booking_notif);
        tvTimeBooking = itemView.findViewById(R.id.tv_time_booking_notif);
        tvStatusPayment = itemView.findViewById(R.id.tv_status_payment_notif);
        tvPriceProduct = itemView.findViewById(R.id.tv_price_product_notif);
        tvStatusNotif = itemView.findViewById(R.id.tv_status_notif);
    }
}
