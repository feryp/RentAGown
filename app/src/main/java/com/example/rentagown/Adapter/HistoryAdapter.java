package com.example.rentagown.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.DetailHistoryBookingActivity;
import com.example.rentagown.InvoiceActivity;
import com.example.rentagown.Model.History;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.HistoryViewHolder;

import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryViewHolder> {

    private Context mContext;
    private List<History> historyList;

    public HistoryAdapter(Context mContext, List<History> historyList) {
        this.mContext = mContext;
        this.historyList = historyList;
    }

    @NonNull
    @Override
    public HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_history,parent,false);
        return new HistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryViewHolder holder, int position) {
        holder.tvDateHistory.setText(historyList.get(position).getDateHistory());
        holder.tvStatusHistory.setText(historyList.get(position).getStatusHistory());
        holder.imProduct.setImageResource(historyList.get(position).getImageProduct());
        holder.tvNameProduct.setText(historyList.get(position).getNameProduct());
        holder.tvCategoryProduct.setText(historyList.get(position).getCategoryProduct());
        holder.tvTotalPrice.setText(historyList.get(position).getTotalPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Detail",Toast.LENGTH_SHORT).show();
                Intent detail = new Intent(v.getContext(), DetailHistoryBookingActivity.class);
                v.getContext().startActivity(detail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return historyList.size();
    }
}
