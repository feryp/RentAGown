package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.ItemMarketting;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.CategoryItemMarkettingViewHolder;

import java.util.List;

public class CategoryItemMarkettingAdapter extends RecyclerView.Adapter<CategoryItemMarkettingViewHolder> {

    private Context context;
    private List<ItemMarketting> itemMarkettingList;

    public CategoryItemMarkettingAdapter(Context context, List<ItemMarketting> itemMarkettingList) {
        this.context = context;
        this.itemMarkettingList = itemMarkettingList;
    }

    @NonNull
    @Override
    public CategoryItemMarkettingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product_slider,parent,false);
        return new CategoryItemMarkettingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemMarkettingViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return itemMarkettingList.size();
    }
}
