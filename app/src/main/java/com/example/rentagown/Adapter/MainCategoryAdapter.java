package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.MainCategory;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.MainCategoryViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MainCategoryAdapter extends RecyclerView.Adapter<MainCategoryViewHolder> {

    private Context mContext;
    private ArrayList<MainCategory> mainCategoryList;

    public MainCategoryAdapter(Context mContext, ArrayList<MainCategory> mainCategoryList) {
        this.mContext = mContext;
        this.mainCategoryList = mainCategoryList;
    }

    @NonNull
    @Override
    public MainCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_slider, parent, false);
        final MainCategoryViewHolder viewHolder = new MainCategoryViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainCategoryViewHolder holder, int position) {
        holder.tvTitle.setText(mainCategoryList.get(position).getTitle());
        holder.tvPrice.setText(mainCategoryList.get(position).getPrice());
        holder.imContent.setImageResource(mainCategoryList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
       return mainCategoryList.size();
    }
}
