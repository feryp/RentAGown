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
import com.example.rentagown.ViewHolder.FavoriteGownViewHolder;
import com.example.rentagown.ViewProductActivity;

import java.util.List;

public class FavoriteGownAdapter extends RecyclerView.Adapter<FavoriteGownViewHolder> {

    private Context mContext;
    private List<FavoriteGown> favoriteGownList;

    public FavoriteGownAdapter(Context mContext, List<FavoriteGown> favoriteGownList) {
        this.mContext = mContext;
        this.favoriteGownList = favoriteGownList;
    }

    @NonNull
    @Override
    public FavoriteGownViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_product,parent,false);
        return new FavoriteGownViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteGownViewHolder holder, int position) {
        holder.tvItemName.setText(favoriteGownList.get(position).getItemName());
        holder.tvPrice.setText(favoriteGownList.get(position).getPrice());
        holder.imProduct.setImageResource(favoriteGownList.get(position).getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Product",Toast.LENGTH_SHORT).show();
                Intent product = new Intent(mContext, ViewProductActivity.class);
                mContext.startActivity(product);
            }
        });
    }

    @Override
    public int getItemCount() {
        return favoriteGownList.size();
    }
}
