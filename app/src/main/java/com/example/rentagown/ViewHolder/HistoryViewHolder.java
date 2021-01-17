package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.R;
import com.makeramen.roundedimageview.RoundedImageView;

public class HistoryViewHolder extends RecyclerView.ViewHolder {

    public TextView tvDateHistory, tvStatusHistory, tvNameProduct, tvCategoryProduct, tvTotalPrice;
    public RoundedImageView imProduct;
    public Button btnReview;

    public HistoryViewHolder(@NonNull View itemView) {
        super(itemView);

        tvDateHistory = itemView.findViewById(R.id.tv_date_history);
        tvStatusHistory = itemView.findViewById(R.id.tv_status_history);
        imProduct = itemView.findViewById(R.id.im_product_history);
        tvNameProduct = itemView.findViewById(R.id.tv_name_dress_history);
        tvCategoryProduct = itemView.findViewById(R.id.tv_category_dress_history);
        tvTotalPrice = itemView.findViewById(R.id.tv_total_price_history);
    }
}
