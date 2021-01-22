package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.R;
import com.makeramen.roundedimageview.RoundedImageView;

public class ListPromoViewHolder extends RecyclerView.ViewHolder {

    public TextView tvTitlePromoList;
    public TextView tvDescPromoList;
    public RoundedImageView imPromoList;

    public ListPromoViewHolder(@NonNull View itemView) {
        super(itemView);

        imPromoList = itemView.findViewById(R.id.im_item_list_promo);
        tvTitlePromoList = itemView.findViewById(R.id.tv_title_item_list_promo);
        tvDescPromoList = itemView.findViewById(R.id.tv_desc_item_list_promo);
    }
}
