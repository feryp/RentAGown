package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.example.rentagown.R;
import com.makeramen.roundedimageview.RoundedImageView;

public class CartViewHolder extends RecyclerView.ViewHolder {

    public RoundedImageView imProduct;
    public TextView tvItemName;
    public TextView tvCategoryGown;
    public TextView tvSpecialTreatment;
    public TextView tvPrice;
    public TextView tvDateBooking;
    public ElegantNumberButton btnQty;

    public CartViewHolder(@NonNull View itemView) {
        super(itemView);

        imProduct = itemView.findViewById(R.id.im_product_cart);
        tvItemName = itemView.findViewById(R.id.tv_name_dress_cart);
        tvCategoryGown = itemView.findViewById(R.id.tv_category_gown_cart);
        tvSpecialTreatment = itemView.findViewById(R.id.tv_special_treatment_cart);
        tvPrice = itemView.findViewById(R.id.tv_price_dress_cart);
        tvDateBooking = itemView.findViewById(R.id.tv_date_booking_cart);
        btnQty = itemView.findViewById(R.id.btn_qty);
    }
}
