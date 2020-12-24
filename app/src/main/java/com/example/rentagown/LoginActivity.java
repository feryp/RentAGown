package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etEmail, etPassword;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //INIT VIEW
        etEmail = findViewById(R.id.et_email_login);
        etPassword = findViewById(R.id.et_password_login);
        btnSignIn = findViewById(R.id.btn_login);

        //Set Listener
        btnSignIn.setOnClickListener(this);
    }

    public void ShowHidePass(View view) {
        if (view.getId() == R.id.show_pass_btn){
            if (etPassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){
                ((ImageView)(view)).setImageResource(R.drawable.ic_show);
                //Show Password
                etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
            else {
                ((ImageView)(view)).setImageResource(R.drawable.ic_hide);
                //Hide Password
                etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                Intent login = new Intent(LoginActivity.this, MainAfterActivity.class);
                startActivity(login);
                break;
        }
    }
}