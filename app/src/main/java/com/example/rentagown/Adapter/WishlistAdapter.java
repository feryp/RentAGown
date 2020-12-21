package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.FavoriteGown;
import com.example.rentagown.Model.Wishlist;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.WishlistViewHolder;

import java.util.List;

public class WishlistAdapter extends RecyclerView.Adapter<WishlistViewHolder> {

    private Context mContext;
    private List<Wishlist> wishlistList;

    public WishlistAdapter(Context mContext, List<Wishlist> wishlistList) {
        this.mContext = mContext;
        this.wishlistList = wishlistList;
    }

    @NonNull
    @Override
    public WishlistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_product_wishlist,parent,false);
        return new WishlistViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull WishlistViewHolder holder, int position) {
        holder.tvItemName.setText(wishlistList.get(position).getItemName());
        holder.tvPrice.setText(wishlistList.get(position).getPrice());
        holder.imProduct.setImageResource(wishlistList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return wishlistList.size();
    }
}
