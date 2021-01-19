package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.TransactionStatus;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.TransactionStatusViewHolder;

import java.util.List;

public class TransactionStatusAdapter extends RecyclerView.Adapter<TransactionStatusViewHolder> {

    private Context mContext;
    private List<TransactionStatus> transactionStatusList;

    public TransactionStatusAdapter(Context mContext, List<TransactionStatus> transactionStatusList) {
        this.mContext = mContext;
        this.transactionStatusList = transactionStatusList;
    }

    @NonNull
    @Override
    public TransactionStatusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_transaction_status,parent,false);
        return new TransactionStatusViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionStatusViewHolder holder, int position) {
        holder.tvDateTransaction.setText(transactionStatusList.get(position).getDateTransaction());
        holder.imProductTransaction.setImageResource(transactionStatusList.get(position).getImageProduct());
        holder.tvNameProduct.setText(transactionStatusList.get(position).getNameProduct());
        holder.tvTimeTrasaction.setText(transactionStatusList.get(position).getTimeBTransaction());
        holder.tvPaymentMethod.setText(transactionStatusList.get(position).getPaymentMethod());
        holder.tvPriceTransaction.setText(transactionStatusList.get(position).getPriceTransaction());
    }

    @Override
    public int getItemCount() {
        return transactionStatusList.size();
    }
}
