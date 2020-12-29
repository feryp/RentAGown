package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.Product;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.ProductViewHolder;
import com.example.rentagown.ViewHolder.SimilarCategoryViewHolder;

import java.util.List;

public class SimilarCategoryAdapter extends RecyclerView.Adapter<SimilarCategoryViewHolder>{

    private Context mContext;
    private List<Product> productList;

    public SimilarCategoryAdapter(Context mContext, List<Product> productList) {
        this.mContext = mContext;
        this.productList = productList;
    }


    @NonNull
    @Override
    public SimilarCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_product,parent,false);
        return new SimilarCategoryViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SimilarCategoryViewHolder holder, int position) {
        holder.tvItemName.setText(productList.get(position).getItemName());
        holder.tvPrice.setText(productList.get(position).getPrice());
        holder.imProduct.setImageResource(productList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return productList.size();

    }


}
