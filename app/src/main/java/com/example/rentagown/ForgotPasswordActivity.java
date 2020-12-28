package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ForgotPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etEmail;
    ImageButton back;
    Button btnSendEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        //INIT VIEW
        etEmail = findViewById(R.id.et_email_forgot_password);
        back = findViewById(R.id.im_back);
        btnSendEmail = findViewById(R.id.btn_send_email);

        //SET LISTENER
        back.setOnClickListener(this);
        btnSendEmail.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_back:
                finish();
                break;
            case R.id.btn_send_email:
                Intent sendEmail = new Intent(ForgotPasswordActivity.this, EmailSuccessActivity.class);
                startActivity(sendEmail);
                break;
        }
    }
}