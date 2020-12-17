package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.R;
import com.makeramen.roundedimageview.RoundedImageView;

public class SliderPromoViewHolder extends RecyclerView.ViewHolder {

    public TextView tvTitlePromo;
    public TextView tvDescPromo;
    public RoundedImageView imPromo;

    public SliderPromoViewHolder(@NonNull View itemView) {
        super(itemView);

        imPromo = itemView.findViewById(R.id.im_item_promo);
        tvTitlePromo = itemView.findViewById(R.id.tv_title_item_promo);
        tvDescPromo = itemView.findViewById(R.id.tv_desc_item_promo);

    }
}
