package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DetailHistoryBookingActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnReview;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_history_booking);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        btnReview = findViewById(R.id.btn_review_detail_history);

        //SET LISTENER
        back.setOnClickListener(this);
        btnReview.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_back:
                finish();
                break;

            case R.id.btn_review_detail_history:
                Intent review = new Intent(DetailHistoryBookingActivity.this, WriteReviewActivity.class);
                startActivity(review);
                break;

        }
    }
}