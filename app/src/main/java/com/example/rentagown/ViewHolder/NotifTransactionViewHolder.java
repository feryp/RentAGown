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
    public TextView tvStatusHistory;

    public NotifTransactionViewHolder(@NonNull View itemView) {
        super(itemView);

        tvDateTransaction = itemView.findViewById(R.id.tv_date_transaction_history);
        tvNameProduct = itemView.findViewById(R.id.tv_name_product_history);
        tvDateBooking = itemView.findViewById(R.id.tv_date_booking_history);
        tvTimeBooking = itemView.findViewById(R.id.tv_time_booking_history);
        tvStatusPayment = itemView.findViewById(R.id.tv_status_payment_history);
        tvPriceProduct = itemView.findViewById(R.id.tv_price_product_history);
        tvStatusHistory = itemView.findViewById(R.id.tv_status_history);
    }
}
