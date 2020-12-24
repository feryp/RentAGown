package com.example.rentagown.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.Product;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.ProductViewHolder;
import com.example.rentagown.ViewProductActivity;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    private Context mContext;
    private List<Product> productList;

    public ProductAdapter(Context mContext, List<Product> productList) {
        this.mContext = mContext;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_product,parent,false);
        return new ProductViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.tvItemName.setText(productList.get(position).getItemName());
        holder.tvPrice.setText(productList.get(position).getPrice());
        holder.imProduct.setImageResource(productList.get(position).getImage());

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
        return productList.size();
    }

    public void replaceItems(List<Product> mItems){
        this.productList.clear();
        this.productList.addAll(mItems);

        //notify semua atau satu2
        notifyDataSetChanged();
    }
}
