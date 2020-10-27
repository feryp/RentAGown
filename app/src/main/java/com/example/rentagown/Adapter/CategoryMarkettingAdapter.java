package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.CategoryMarketting;
import com.example.rentagown.Model.ItemMarketting;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.CategoryMarkettingViewHolder;

import java.util.List;

public class CategoryMarkettingAdapter extends RecyclerView.Adapter<CategoryMarkettingViewHolder> {

    private Context mContext;
    private List<CategoryMarketting> categoryMarkettingList;

    public CategoryMarkettingAdapter(Context mContext, List<CategoryMarketting> categoryMarkettingList) {
        this.mContext = mContext;
        this.categoryMarkettingList = categoryMarkettingList;
    }

    @NonNull
    @Override
    public CategoryMarkettingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_title_category,parent,false);
        return new CategoryMarkettingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryMarkettingViewHolder holder, int position) {
        holder.tvTitle.setText(categoryMarkettingList.get(position).getTitle());
        setCatItemRecycler(holder.rvItemProduct, categoryMarkettingList.get(position).getItemMarkettingList());
    }

    @Override
    public int getItemCount() {
        return categoryMarkettingList.size();
    }

    private void setCatItemRecycler(RecyclerView recyclerView, List<ItemMarketting> itemMarkettingList){
        CategoryItemMarkettingAdapter itemMarkettingAdapter = new CategoryItemMarkettingAdapter(mContext, itemMarkettingList);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(itemMarkettingAdapter);
    }
}
