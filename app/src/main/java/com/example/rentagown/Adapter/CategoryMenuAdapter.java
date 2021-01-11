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

    private List<TextView> textViewList = new ArrayList<>();

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

        textViewList.add(holder.tvTitle);
//
        if (!textViewList.contains(holder.tvTitle)) {
            textViewList.add(holder.tvTitle);
        }
        holder.tvTitle.setText(categoryMenuList.get(position).getTitleCategory());



        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener != null) listener.onClick(v, position, false);

//                CategoryMenu items = null;


                for(TextView tv:textViewList){
                    tv.setTextColor(Color.parseColor("#747474"));
                }
                holder.tvTitle.setTextColor(Color.parseColor("#E6B31E"));

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




//    void selectCategory(int categoryId){
//
//        for (CategoryMenu items = null){
//            if (items.getIdCategory() == categoryId){
//
//            }
//        }
//    }
}
