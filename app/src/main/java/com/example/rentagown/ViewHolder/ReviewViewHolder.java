package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.R;

public class ReviewViewHolder extends RecyclerView.ViewHolder {

    public TextView tvNameUserReview;
    public TextView tvRatingsReview;
    public TextView tvTimeReview;
    public TextView tvCommentReview;


    public ReviewViewHolder(@NonNull View itemView) {
        super(itemView);

        tvNameUserReview = itemView.findViewById(R.id.tv_name_user_review);
        tvRatingsReview = itemView.findViewById(R.id.tv_ratings_review);
        tvTimeReview = itemView.findViewById(R.id.tv_time_review);
        tvCommentReview = itemView.findViewById(R.id.tv_comment_review);
    }
}
