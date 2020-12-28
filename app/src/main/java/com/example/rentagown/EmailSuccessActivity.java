package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EmailSuccessActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton back;
    Button btntoSign, btnResendLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_success);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        btntoSign = findViewById(R.id.btn_to_back_signin);
        btnResendLink = findViewById(R.id.btn_resend_link);

        //SET LISTENER
        back.setOnClickListener(this);
        btntoSign.setOnClickListener(this);
        btnResendLink.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_back:
                finish();
                break;
            case R.id.btn_to_back_signin:
                Intent backtoLogin = new Intent(EmailSuccessActivity.this,SignInActivity.class);
                startActivity(backtoLogin);
                break;
        }
    }
}