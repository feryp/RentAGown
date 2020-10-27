package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.CategoryMarketting;
import com.example.rentagown.R;

public class CategoryMarkettingViewHolder extends RecyclerView.ViewHolder {

    public TextView tvTitle;
    public Button btnSeeAll;
    public RecyclerView rvItemProduct;

    private CategoryMarketting categoryMarketting;

    public CategoryMarkettingViewHolder(@NonNull View itemView) {
        super(itemView);

        tvTitle = itemView.findViewById(R.id.tv_title_category);
        btnSeeAll = itemView.findViewById(R.id.btn_see_all_marketting);
        rvItemProduct = itemView.findViewById(R.id.rv_item_product);
    }
}
