package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.rentagown.Adapter.ReviewAdapter;
import com.example.rentagown.Adapter.ReviewsAdapter;
import com.example.rentagown.Model.Review;

import java.util.ArrayList;
import java.util.List;

public class ReviewActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton back;
    RecyclerView rvReview;
    List<Review> reviewList;
    ReviewsAdapter reviewsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        rvReview = findViewById(R.id.rv_comment_review);

        //List Review
        reviewList = new ArrayList<>();
        reviewList.add(new Review("Joan Perkins","3.5","1 days ago","The booking process is fast, and the goods according to the order and the size are also very fitting"));
        reviewList.add(new Review("Frank Garret","3.5","4 days ago","The dress is very nice, and the quality is very good"));
        reviewList.add(new Review("Randy Palmet","3.5","5 days ago","the material is pretty good"));
        reviewList.add(new Review("Randy Palmet","3.5","5 days ago","the material is pretty good"));
        reviewList.add(new Review("Randy Palmet","3.5","5 days ago","the material is pretty good"));
        reviewList.add(new Review("Randy Palmet","3.5","5 days ago","the material is pretty good"));
        reviewList.add(new Review("Randy Palmet","3.5","5 days ago","the material is pretty good"));
        reviewList.add(new Review("Randy Palmet","3.5","5 days ago","the material is pretty good"));

        //Setup Recycler View
        reviewsAdapter = new ReviewsAdapter(this,reviewList);
        rvReview.setLayoutManager(new LinearLayoutManager(this));
        rvReview.setAdapter(reviewsAdapter);

        //SET LISTENER
        back.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.im_back:
                finish();
                break;
        }
    }
}