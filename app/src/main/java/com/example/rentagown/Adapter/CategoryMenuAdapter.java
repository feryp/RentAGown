package com.example.rentagown.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Interface.ItemClickListener;
import com.example.rentagown.Model.CategoryMenu;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.CategoryMenuViewHolder;

import java.util.ArrayList;
import java.util.List;

public class CategoryMenuAdapter extends RecyclerView.Adapter<CategoryMenuViewHolder> {

    private List<CategoryMenu> categoryMenuList;
    private ItemClickListener listener;

    CategoryMenu selectedCategory = null;


    public CategoryMenuAdapter(List<CategoryMenu> categoryMenuList) {
        this.categoryMenuList = categoryMenuList;
    }

    public CategoryMenuAdapter(List<CategoryMenu> categoryMenuList, ItemClickListener listener) {
        this.categoryMenuList = categoryMenuList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CategoryMenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_title_menu,parent,false);
        return new CategoryMenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryMenuViewHolder holder, final int position) {

        holder.tvTitle.setText(categoryMenuList.get(position).getTitleCategory());

        if (selectedCategory != null){
            if (selectedCategory.getIdCategory() == categoryMenuList.get(position).getIdCategory()){
                holder.tvTitle.setTextColor(Color.parseColor("#C7A87E")); //warna gold
            } else {
                holder.tvTitle.setTextColor(Color.parseColor("#747474")); //warna hitam
            }
        }

        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener != null) listener.onClick(v, position, false);

                selectCategory(categoryMenuList.get(position));

            }
        });

    }

    @Override
    public int getItemCount() {
        return categoryMenuList.size();
    }

    public CategoryMenu getItem(int position) {
        return categoryMenuList.get(position);
    }

    public void selectCategory(CategoryMenu selected){
        selectedCategory = selected;
        notifyDataSetChanged();
    }

    public void selectCategory(int position){
        selectCategory(getItem(position));

    }

}
