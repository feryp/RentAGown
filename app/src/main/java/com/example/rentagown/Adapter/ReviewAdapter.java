package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.Review;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.ReviewViewHolder;

import java.util.List;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewViewHolder> {

    private Context mContext;
    private List<Review> reviewList;

    public ReviewAdapter(Context mContext, List<Review> reviewList) {
        this.mContext = mContext;
        this.reviewList = reviewList;
    }

    @NonNull
    @Override
    public ReviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_review,parent,false);
        return new ReviewViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewViewHolder holder, int position) {
        holder.tvNameUserReview.setText(reviewList.get(position).getNameUser());
        holder.tvRatingsReview.setText(reviewList.get(position).getRatings());
        holder.tvTimeReview.setText(reviewList.get(position).getTimeReview());
        holder.tvCommentReview.setText(reviewList.get(position).getCommentReview());
    }

    @Override
    public int getItemCount() {
        return reviewList.size();
    }
}
