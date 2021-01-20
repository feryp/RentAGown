package com.example.rentagown.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.rentagown.ForgotPasswordActivity;
import com.example.rentagown.MainAfterActivity;
import com.example.rentagown.R;
import com.example.rentagown.SignInActivity;
import com.example.rentagown.SignUpActivity;


public class LoginFragment extends Fragment implements View.OnClickListener{

    EditText etEmail, etPassword;
    Button btnSignIn,btnForgotPassword, btnToSignUp;
    ImageView btnShowHidePass;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        //INIT VIEW
        etEmail = view.findViewById(R.id.et_email_login);
        etPassword = view.findViewById(R.id.et_password_login);
        btnSignIn = view.findViewById(R.id.btn_sign_in);
        btnForgotPassword = view.findViewById(R.id.btn_forgot_password);
        btnToSignUp = view.findViewById(R.id.btn_to_layout_signup);
        btnShowHidePass = view.findViewById(R.id.show_pass_btn);

        //Set Listener
        btnSignIn.setOnClickListener(LoginFragment.this);
        btnForgotPassword.setOnClickListener(LoginFragment.this);
        btnToSignUp.setOnClickListener(LoginFragment.this);
        btnShowHidePass.setOnClickListener(LoginFragment.this);

        return view;
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sign_in:
                Intent login = new Intent(getActivity(), MainAfterActivity.class);
                startActivity(login);
                break;
            case R.id.btn_forgot_password:
                Intent forgotPassword = new Intent(getActivity(), ForgotPasswordActivity.class);
                startActivity(forgotPassword);
                break;
            case R.id.btn_to_layout_signup:
                Intent toRegister = new Intent(getActivity(), SignUpActivity.class);
                startActivity(toRegister);
                break;

            case R.id.show_pass_btn:
                if (v.getId() == R.id.show_pass_btn){
                    if (etPassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){
                        ((ImageView)(v)).setImageResource(R.drawable.ic_show);
                        //Show Password
                        etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    }
                    else {
                        ((ImageView)(v)).setImageResource(R.drawable.ic_hide);
                        //Hide Password
                        etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                }
                break;
        }
    }
}