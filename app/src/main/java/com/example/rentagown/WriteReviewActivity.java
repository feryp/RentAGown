package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;

public class WriteReviewActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton back;
    Button btnSubmitReview;
    private RatingBar ratingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_review);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        btnSubmitReview = findViewById(R.id.btn_submit_review);
        ratingBar = findViewById(R.id.rate);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Log.d("uuu",ratingBar.getRating()+"");
            }
        });

        //SET LISTENER
        back.setOnClickListener(this);
        btnSubmitReview.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.im_back:
                finish();
                break;

            case R.id.btn_submit_review:
                break;
        }
    }
}