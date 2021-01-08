package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ConfirmPaymentActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton back;
    Button btnConfirmation, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_payment);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        btnConfirmation = findViewById(R.id.btn_confirmation);
        btnCancel = findViewById(R.id.btn_cancel);

        //SET LISTENER
        back.setOnClickListener(this);
        btnConfirmation.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_back:
                finish();
                break;

            case R.id.btn_confirmation:
                Intent confirmation = new Intent(ConfirmPaymentActivity.this, FormConfirmationActivity.class);
                startActivity(confirmation);
                break;
        }
    }
}