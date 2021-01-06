package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.Cart;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.CartViewHolder;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartViewHolder> {

    private Context mContext;
    private List<Cart> cartList;

    public CartAdapter(Context mContext, List<Cart> cartList) {
        this.mContext = mContext;
        this.cartList = cartList;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_cart,parent,false);
        return new CartViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        holder.imProduct.setImageResource(cartList.get(position).getImage());
        holder.tvItemName.setText(cartList.get(position).getItemName());
        holder.tvCategoryGown.setText(cartList.get(position).getCategoryGown());
        holder.tvSpecialTreatment.setText(cartList.get(position).getSpecialTreatment());
        holder.tvPrice.setText(cartList.get(position).getPrice());
        holder.tvDateBooking.setText(cartList.get(position).getDateBooking());

    }

    @Override
    public int getItemCount() {
        return cartList.size();
    }
}
