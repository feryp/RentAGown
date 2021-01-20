package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etEmail, etPassword;
    Button btnSignIn,btnForgotPassword, btnToSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        //INIT VIEW
        etEmail = findViewById(R.id.et_email_login);
        etPassword = findViewById(R.id.et_password_login);
        btnSignIn = findViewById(R.id.btn_sign_in);
        btnForgotPassword = findViewById(R.id.btn_forgot_password);
        btnToSignUp = findViewById(R.id.btn_to_layout_signup);

        //Set Listener
        btnSignIn.setOnClickListener(this);
        btnForgotPassword.setOnClickListener(this);
        btnToSignUp.setOnClickListener(this);
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

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sign_in:
                Intent login = new Intent(SignInActivity.this, MainAfterActivity.class);
                startActivity(login);
                break;
            case R.id.btn_forgot_password:
                Intent forgotPassword = new Intent(SignInActivity.this, ForgotPasswordActivity.class);
                startActivity(forgotPassword);
                break;
            case R.id.btn_to_layout_signup:
                Intent toRegister = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(toRegister);
                break;
        }
    }
}