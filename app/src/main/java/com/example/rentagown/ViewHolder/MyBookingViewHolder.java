package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Interface.ItemClickListener;
import com.example.rentagown.Model.MyBooking;
import com.example.rentagown.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyBookingViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView tvDateTransaction, tvDateBooking, tvNameProduct, tvPrice, tvDpPaid, tvRemainingBills,tvStatusBooking;
    public CircleImageView imProduct;
    public Button btnFitingSize;

    private MyBooking myBooking;

    private ItemClickListener itemClickListener;
    private View.OnClickListener onClickListener;

    public MyBookingViewHolder(@NonNull View itemView) {
        super(itemView);

        tvDateTransaction = itemView.findViewById(R.id.tv_tgl_transaction);
        tvDateBooking = itemView.findViewById(R.id.tv_tgl_booking_product);
        tvNameProduct = itemView.findViewById(R.id.tv_name_dress_booking);
        tvPrice = itemView.findViewById(R.id.tv_price_booking);
        tvDpPaid = itemView.findViewById(R.id.tv_dp_paid);
        tvRemainingBills = itemView.findViewById(R.id.tv_remaining_bils);
        tvStatusBooking = itemView.findViewById(R.id.tv_status_booking);
        imProduct = itemView.findViewById(R.id.im_circle_product);

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
