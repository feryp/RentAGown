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
import java.util.List;

public class MyBookingAdapter extends RecyclerView.Adapter<MyBookingViewHolder> {

    private Context mContext;
    private List<MyBooking> myBookingList;

    public MyBookingAdapter(Context mContext, List<MyBooking> myBookingList) {
        this.mContext = mContext;
        this.myBookingList = myBookingList;
    }

    @NonNull
    @Override
    public MyBookingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_booking,parent,false);
        return new MyBookingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyBookingViewHolder holder, int position) {
        holder.tvDateTransaction.setText(myBookingList.get(position).getDateTransaction());
        holder.tvStartDateBooking.setText(myBookingList.get(position).getStartDateBooking());
        holder.tvEndDateBooking.setText(myBookingList.get(position).getEndDateBooking());
        holder.tvNameProduct.setText(myBookingList.get(position).getNameProduct());
        holder.tvStatusBooking.setText(myBookingList.get(position).getStatusBooking());
        holder.tvPrice.setText(myBookingList.get(position).getPrice());
        holder.tvDpPaid.setText(myBookingList.get(position).getDpPaid());
        holder.tvRemainingBills.setText(myBookingList.get(position).getRemainingBills());
        holder.imProduct.setImageResource(myBookingList.get(position).getImageProduct());


    }

    @Override
    public int getItemCount() {
        return myBookingList.size();
    }

}
