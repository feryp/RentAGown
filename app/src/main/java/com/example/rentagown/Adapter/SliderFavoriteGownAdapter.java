package com.example.rentagown.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.FavoriteGown;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.SliderFavoriteGownViewHolder;
import com.example.rentagown.ViewProductActivity;

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

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Product",Toast.LENGTH_SHORT).show();
                Intent product = new Intent(v.getContext(), ViewProductActivity.class);
                v.getContext().startActivity(product);
            }
        });
    }

    @Override
    public int getItemCount() {
        return favoriteGownList.size();
    }
}
