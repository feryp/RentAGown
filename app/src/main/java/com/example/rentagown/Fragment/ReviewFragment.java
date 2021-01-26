package com.example.rentagown.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.rentagown.Adapter.ReviewAdapter;
import com.example.rentagown.Model.Review;
import com.example.rentagown.R;
import com.example.rentagown.ReviewActivity;

import java.util.ArrayList;
import java.util.List;


public class ReviewFragment extends Fragment implements View.OnClickListener{

    RecyclerView rvReview;
    List<Review> reviewList;
    ReviewAdapter reviewAdapter;
    Context context;
    Button btnSeeAll;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_review, container, false);

        //INIT VIEW
        rvReview = view.findViewById(R.id.rv_review_product);
        btnSeeAll = view.findViewById(R.id.btn_see_all_review);

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
        reviewList.add(new Review("Randy Palmet","3.5","5 days ago","the material is pretty good"));
        reviewList.add(new Review("Randy Palmet","3.5","5 days ago","the material is pretty good"));
        reviewList.add(new Review("Randy Palmet","3.5","5 days ago","the material is pretty good!"));

        //Setup Recycler View
        reviewAdapter = new ReviewAdapter(context,reviewList);
        rvReview.setLayoutManager(new LinearLayoutManager(context));
        rvReview.setAdapter(reviewAdapter);


        //Set Listener
        btnSeeAll.setOnClickListener(ReviewFragment.this);

        return view;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_see_all_review:
                Intent review = new Intent(getActivity(), ReviewActivity.class);
                startActivity(review);
                break;
        }
    }
}