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

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etName, etEmail, etNoHp, etPassword;
    Button btnSignUp, btnToSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //INIT VIEW
        etName = findViewById(R.id.et_name_register);
        etEmail = findViewById(R.id.et_email_register);
        etNoHp = findViewById(R.id.et_nohp_register);
        etPassword = findViewById(R.id.et_password_register);
        btnSignUp = findViewById(R.id.btn_sign_up);
        btnToSignIn = findViewById(R.id.btn_to_layout_signin);

        //Set Listener
        btnSignUp.setOnClickListener(this);
        btnToSignIn.setOnClickListener(this);
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
            case R.id.btn_sign_up:
                Intent register = new Intent(SignUpActivity.this, MainAfterActivity.class);
                startActivity(register);
                break;
            case R.id.btn_to_layout_signin:
                Intent toLogin = new Intent(SignUpActivity.this, SignInActivity.class);
                startActivity(toLogin);
                break;
        }
    }
}