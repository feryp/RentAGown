package com.example.rentagown.ViewHolder;

import android.media.Image;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.ItemMarketting;
import com.example.rentagown.R;
import com.makeramen.roundedimageview.RoundedImageView;

public class CategoryItemMarkettingViewHolder extends RecyclerView.ViewHolder {

    public TextView tvNameProduct;
    public TextView tvPrice;
    public RoundedImageView imProduct;
    public Button btnBook;

    private ItemMarketting itemMarketting;

    public CategoryItemMarkettingViewHolder(@NonNull View itemView) {
        super(itemView);

        tvNameProduct = itemView.findViewById(R.id.tv_name_dress_product);
        tvPrice = itemView.findViewById(R.id.tv_price_dress_product);
        imProduct = itemView.findViewById(R.id.im_content_product);
        btnBook = itemView.findViewById(R.id.btn_booking_now);
    }
}
