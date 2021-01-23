package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.R;
import com.makeramen.roundedimageview.RoundedImageView;

public class FavoriteGownViewHolder extends RecyclerView.ViewHolder {

    public TextView tvItemName;
    public TextView tvPrice;
    public TextView tvPriceOld;
    public TextView tvDiscount;
    public RoundedImageView imProduct;
    public Button btnBooking;

    public FavoriteGownViewHolder(@NonNull View itemView) {
        super(itemView);

        tvItemName = itemView.findViewById(R.id.tv_name_dress_product);
        tvPrice = itemView.findViewById(R.id.tv_price_dress_product);
        tvPriceOld = itemView.findViewById(R.id.tv_price_old_dress_product);
        tvDiscount = itemView.findViewById(R.id.tv_discount_product);
        imProduct = itemView.findViewById(R.id.im_image_product);
        btnBooking = itemView.findViewById(R.id.btn_booking_now);
    }
}
