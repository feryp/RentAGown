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
import com.example.rentagown.ViewHolder.SliderNewGownViewHolder;
import com.example.rentagown.ViewProductActivity;

import java.util.List;

public class SliderNewGownAdapter extends RecyclerView.Adapter<SliderNewGownViewHolder> {

    private Context mContext;
    private List<NewGown> newGownList;

    public SliderNewGownAdapter(Context mContext, List<NewGown> newGownList) {
        this.mContext = mContext;
        this.newGownList = newGownList;
    }

    @NonNull
    @Override
    public SliderNewGownViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product_slider,parent,false);
        return new SliderNewGownViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderNewGownViewHolder holder, int position) {
        holder.tvItemName.setText(newGownList.get(position).getItemName());
        holder.tvPrice.setText(newGownList.get(position).getPrice());
        holder.imProduct.setImageResource(newGownList.get(position).getImage());

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
        return newGownList.size();
    }
}
