package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.R;

public class NoAvailableDateViewHolder extends RecyclerView.ViewHolder {

    public TextView tvStartDate;
    public TextView tvEndDate;

    public NoAvailableDateViewHolder(@NonNull View itemView) {
        super(itemView);

        tvStartDate = itemView.findViewById(R.id.tv_start_date_available);
        tvEndDate = itemView.findViewById(R.id.tv_end_date_available);
    }
}
