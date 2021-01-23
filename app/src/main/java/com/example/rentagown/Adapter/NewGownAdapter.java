package com.example.rentagown.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.NewGown;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.FavoriteGownViewHolder;
import com.example.rentagown.ViewHolder.NewGownViewHolder;
import com.example.rentagown.ViewProductActivity;

import java.util.List;

public class NewGownAdapter extends RecyclerView.Adapter<NewGownViewHolder> {

    private Context mContext;
    private List<NewGown> newGownList;

    public NewGownAdapter(Context mContext, List<NewGown> newGownList) {
        this.mContext = mContext;
        this.newGownList = newGownList;
    }

    @NonNull
    @Override
    public NewGownViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_product,parent,false);
        return new NewGownViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NewGownViewHolder holder, int position) {
        holder.tvItemName.setText(newGownList.get(position).getItemName());
        holder.tvPrice.setText(newGownList.get(position).getPrice());
        holder.imProduct.setImageResource(newGownList.get(position).getImage());

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
        return newGownList.size();
    }
}
