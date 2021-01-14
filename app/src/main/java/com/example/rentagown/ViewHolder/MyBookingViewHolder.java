package com.example.rentagown.ViewHolder;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.FittingSizeActivity;
import com.example.rentagown.Interface.ItemClickListener;
import com.example.rentagown.Model.MyBooking;
import com.example.rentagown.R;
import com.makeramen.roundedimageview.RoundedImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyBookingViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView tvDateTransaction, tvStartDateBooking, tvEndDateBooking, tvNameProduct, tvPrice, tvDpPaid, tvRemainingBills,tvStatusBooking;
    public RoundedImageView imProduct;
    public Button btnFitingSize;

    private MyBooking myBooking;

    private ItemClickListener itemClickListener;
    private View.OnClickListener onClickListener;

    public MyBookingViewHolder(@NonNull View itemView) {
        super(itemView);

        tvDateTransaction = itemView.findViewById(R.id.tv_tgl_transaction);
        tvStartDateBooking = itemView.findViewById(R.id.tv_start_date_booking_product);
        tvEndDateBooking = itemView.findViewById(R.id.tv_end_date_booking_product);
        tvNameProduct = itemView.findViewById(R.id.tv_name_dress_booking);
        tvPrice = itemView.findViewById(R.id.tv_price_booking);
        tvDpPaid = itemView.findViewById(R.id.tv_dp_paid);
        tvRemainingBills = itemView.findViewById(R.id.tv_remaining_bils);
        tvStatusBooking = itemView.findViewById(R.id.tv_status_booking);
        imProduct = itemView.findViewById(R.id.im_product_booking);

        btnFitingSize = itemView.findViewById(R.id.btn_fitting_size);


        itemView.setOnClickListener(this);
        btnFitingSize.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_fitting_size:
                Intent fittingSize = new Intent(itemView.getContext(), FittingSizeActivity.class);
                itemView.getContext().startActivity(fittingSize);
                break;
            default:
                itemClickListener.onClick(v,getAdapterPosition(),false);
                break;
        }
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
