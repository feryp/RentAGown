package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.NotifTransaction;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.NotifTransactionViewHolder;

import java.util.List;

public class NotifTransactionAdapter extends RecyclerView.Adapter<NotifTransactionViewHolder> {

    private Context mContext;
    private List<NotifTransaction> notifTransactionList;

    public NotifTransactionAdapter(Context mContext, List<NotifTransaction> notifTransactionList) {
        this.mContext = mContext;
        this.notifTransactionList = notifTransactionList;
    }

    @NonNull
    @Override
    public NotifTransactionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_notif_transaction,parent,false);
        return new NotifTransactionViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NotifTransactionViewHolder holder, int position) {
        holder.tvDateTransaction.setText(notifTransactionList.get(position).getDateTransaction());
        holder.tvNameProduct.setText(notifTransactionList.get(position).getItemName());
        holder.tvDateBooking.setText(notifTransactionList.get(position).getDateBook());
        holder.tvTimeBooking.setText(notifTransactionList.get(position).getTimeBook());
        holder.tvStatusPayment.setText(notifTransactionList.get(position).getStatusPayment());
        holder.tvPriceProduct.setText(notifTransactionList.get(position).getPrice());
        holder.tvStatusNotif.setText(notifTransactionList.get(position).getStatusNotif());
    }

    @Override
    public int getItemCount() {
        return notifTransactionList.size();
    }
}
