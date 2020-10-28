package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Interface.ItemClickListener;
import com.example.rentagown.Model.MyBooking;
import com.example.rentagown.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyBookingViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView tv_date_transaction, tv_date_booking, tv_name_product, tv_price, tv_dp_paid, tv_remaining_bills,tv_status_booking;
    public CircleImageView im_product;

    private MyBooking myBooking;

    private ItemClickListener itemClickListener;
    private View.OnClickListener onClickListener;

    public MyBookingViewHolder(@NonNull View itemView) {
        super(itemView);

        tv_date_transaction = itemView.findViewById(R.id.tv_tgl_transaction);
        tv_date_booking = itemView.findViewById(R.id.tv_tgl_booking_product);
        tv_name_product = itemView.findViewById(R.id.tv_name_dress_booking);
        tv_price = itemView.findViewById(R.id.tv_price_booking);
        tv_dp_paid = itemView.findViewById(R.id.tv_dp_paid);
        tv_remaining_bills = itemView.findViewById(R.id.tv_remaining_bils);
        tv_status_booking = itemView.findViewById(R.id.tv_status_booking);
        im_product = itemView.findViewById(R.id.im_circle_product);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
