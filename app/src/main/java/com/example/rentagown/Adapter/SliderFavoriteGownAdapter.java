package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.FavoriteGown;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.SliderFavoriteGownViewHolder;

import java.util.List;

public class SliderFavoriteGownAdapter extends RecyclerView.Adapter<SliderFavoriteGownViewHolder> {

    private Context mContext;
    private List<FavoriteGown> favoriteGownList;

    public SliderFavoriteGownAdapter(Context mContext, List<FavoriteGown> favoriteGownList) {
        this.mContext = mContext;
        this.favoriteGownList = favoriteGownList;
    }

    @NonNull
    @Override
    public SliderFavoriteGownViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product_slider,parent,false);
        return new SliderFavoriteGownViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderFavoriteGownViewHolder holder, int position) {
        holder.tvItemName.setText(favoriteGownList.get(position).getItemName());
        holder.tvPrice.setText(favoriteGownList.get(position).getPrice());
        holder.imProduct.setImageResource(favoriteGownList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return favoriteGownList.size();
    }
}
