package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.SliderMainMenu;
import com.example.rentagown.R;
import com.makeramen.roundedimageview.RoundedImageView;

public class SliderMainMenuViewHolder extends RecyclerView.ViewHolder {

    public TextView tvTitle;
    public TextView tvPrice;
    public RoundedImageView imContent;
    public ImageButton btnWishlist;

    private SliderMainMenu sliderMainMenu;

    public SliderMainMenuViewHolder(@NonNull View itemView) {
        super(itemView);

        tvTitle = itemView.findViewById(R.id.tv_name_dress_main);
        tvPrice = itemView.findViewById(R.id.tv_harga_dress_main);
        imContent = itemView.findViewById(R.id.im_content_main);
        btnWishlist = itemView.findViewById(R.id.btn_like_main);

    }
}
