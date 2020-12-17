package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.Promo;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.SliderPromoViewHolder;

import java.util.List;

public class SliderPromoAdapter extends RecyclerView.Adapter<SliderPromoViewHolder> {

    private Context mContext;
    private List<Promo> promoList;

    public SliderPromoAdapter(Context mContext, List<Promo> promoList) {
        this.mContext = mContext;
        this.promoList = promoList;
    }

    @NonNull
    @Override
    public SliderPromoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_promo_slider,parent,false);
        return new SliderPromoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderPromoViewHolder holder, int position) {
        holder.imPromo.setImageResource(promoList.get(position).getImPromo());
        holder.tvTitlePromo.setText(promoList.get(position).getTitle());
        holder.tvDescPromo.setText(promoList.get(position).getDesc());


    }

    @Override
    public int getItemCount() {
        return promoList.size();
    }
}
