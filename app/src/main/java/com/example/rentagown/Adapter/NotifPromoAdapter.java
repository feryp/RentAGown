package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.NotifPromo;
import com.example.rentagown.Model.NotifTransaction;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.NotifPromoViewHolder;

import java.util.List;

public class NotifPromoAdapter extends RecyclerView.Adapter<NotifPromoViewHolder> {

    private Context mContext;
    private List<NotifPromo> notifPromoList;

    public NotifPromoAdapter(Context mContext, List<NotifPromo> notifPromoList) {
        this.mContext = mContext;
        this.notifPromoList = notifPromoList;
    }

    @NonNull
    @Override
    public NotifPromoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_notif_promo,parent,false);
        return new NotifPromoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NotifPromoViewHolder holder, int position) {
        holder.tvDatePromo.setText(notifPromoList.get(position).getDatePromo());
        holder.tvNamePromo.setText(notifPromoList.get(position).getNamePromo());
        holder.tvDiscountPromo.setText(notifPromoList.get(position).getDiscountPromo());
        holder.tvDescPromo.setText(notifPromoList.get(position).getDescPromo());
    }

    @Override
    public int getItemCount() {
        return notifPromoList.size();
    }
}
