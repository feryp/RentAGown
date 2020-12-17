package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.MyBooking;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.MyBookingViewHolder;

import java.util.ArrayList;

public class MyBookingAdapter extends RecyclerView.Adapter<MyBookingViewHolder> {

    private ArrayList<MyBooking> myBookingList;
    Context mContext;

    public MyBookingAdapter(ArrayList<MyBooking> myBookingList, Context mContext) {
        this.myBookingList = myBookingList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyBookingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_booking,parent,false);
        return new MyBookingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyBookingViewHolder holder, int position) {
        holder.tv_date_transaction.setText(myBookingList.get(position).getDateTransaction());
        holder.tv_date_booking.setText(myBookingList.get(position).getDateBooking());
        holder.tv_name_product.setText(myBookingList.get(position).getNameProduct());
        holder.tv_status_booking.setText(myBookingList.get(position).getStatusBooking());
        holder.tv_price.setText(myBookingList.get(position).getPrice());
        holder.tv_dp_paid.setText(myBookingList.get(position).getDpPaid());
        holder.tv_remaining_bills.setText(myBookingList.get(position).getRemainingBills());
        holder.im_product.setImageResource(myBookingList.get(position).getImageProduct());
    }

    @Override
    public int getItemCount() {
        return myBookingList.size();
    }

}
