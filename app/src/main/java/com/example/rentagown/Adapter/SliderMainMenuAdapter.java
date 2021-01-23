package com.example.rentagown.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.SliderMainMenu;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.SliderMainMenuViewHolder;
import com.example.rentagown.ViewProductActivity;

import java.util.ArrayList;
import java.util.List;

public class SliderMainMenuAdapter extends RecyclerView.Adapter<SliderMainMenuViewHolder> {

    private Context mContext;
    private List<SliderMainMenu> sliderMainMenuList;

    public SliderMainMenuAdapter(Context mContext, List<SliderMainMenu> sliderMainMenuList) {
        this.mContext = mContext;
        this.sliderMainMenuList = sliderMainMenuList;
    }

    @NonNull
    @Override
    public SliderMainMenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_slider, parent, false);
        final SliderMainMenuViewHolder viewHolder = new SliderMainMenuViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SliderMainMenuViewHolder holder, int position) {
        holder.tvItemName.setText(sliderMainMenuList.get(position).getItemName());
        holder.tvPrice.setText(sliderMainMenuList.get(position).getPrice());
        holder.imContent.setImageResource(sliderMainMenuList.get(position).getImage());

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
       return sliderMainMenuList.size();
    }

    public void replaceItems(List<SliderMainMenu> mItems) {
        this.sliderMainMenuList.clear();
        this.sliderMainMenuList.addAll(mItems);

        // notify semua atau satu2
        notifyDataSetChanged();
    }

}
