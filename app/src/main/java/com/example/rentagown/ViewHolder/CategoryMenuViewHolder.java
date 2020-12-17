package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.R;

public class CategoryMenuViewHolder extends RecyclerView.ViewHolder {

    public TextView tvTitle;
    public View container;

    public CategoryMenuViewHolder(@NonNull View itemView) {
        super(itemView);

        container = itemView.findViewById(R.id.category_menu_item_container);
        tvTitle = itemView.findViewById(R.id.tv_title_menu);
    }
}
