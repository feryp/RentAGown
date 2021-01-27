package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.NoAvailableDate;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.NoAvailableDateViewHolder;

import java.util.List;

public class NoAvailableDateAdapter extends RecyclerView.Adapter<NoAvailableDateViewHolder> {

    private Context mContext;
    private List<NoAvailableDate> noAvailableDateList;

    public NoAvailableDateAdapter(Context mContext, List<NoAvailableDate> noAvailableDateList) {
        this.mContext = mContext;
        this.noAvailableDateList = noAvailableDateList;
    }

    @NonNull
    @Override
    public NoAvailableDateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_no_available_date,parent,false);
        return new NoAvailableDateViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NoAvailableDateViewHolder holder, int position) {
        holder.tvStartDate.setText(noAvailableDateList.get(position).getStartDateBooking());
        holder.tvEndDate.setText(noAvailableDateList.get(position).getEndDateBooking());
    }

    @Override
    public int getItemCount() {
        return noAvailableDateList.size();
    }
}
