package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.Promo;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.ListPromoViewHolder;

import java.util.List;

public class ListPromoAdapter extends RecyclerView.Adapter<ListPromoViewHolder>{

    private Context mContext;
    private List<Promo> promoList;

    public ListPromoAdapter(Context mContext, List<Promo> promoList) {
        this.mContext = mContext;
        this.promoList = promoList;
    }

    @NonNull
    @Override
    public ListPromoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_promo_list,parent,false);
        return new ListPromoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListPromoViewHolder holder, int position) {
        holder.imPromoList.setImageResource(promoList.get(position).getImPromo());
        holder.tvTitlePromoList.setText(promoList.get(position).getTitle());
        holder.tvDescPromoList.setText(promoList.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return promoList.size();
    }
}
