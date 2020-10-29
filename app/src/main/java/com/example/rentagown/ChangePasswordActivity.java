package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ChangePasswordActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etNewPassword, etRetypePassword;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        //INIT VIEW
        etNewPassword = findViewById(R.id.et_new_password);
        etRetypePassword = findViewById(R.id.et_retype_password);
        back = findViewById(R.id.im_back);

        //SET LISTENER
        back.setOnClickListener(this);

    }

    public void ShowHidePass(View view) {
        if (view.getId() == R.id.show_pass_btn_1){
            if (etNewPassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){
                ((ImageView)(view)).setImageResource(R.drawable.ic_show);
                //Show Password
                etNewPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
            else {
                ((ImageView)(view)).setImageResource(R.drawable.ic_hide);
                //Hide Password
                etNewPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }

        if (view.getId() == R.id.show_pass_btn_2){
            if (etRetypePassword.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){
                ((ImageView)(view)).setImageResource(R.drawable.ic_show);
                //Show Password
                etRetypePassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
            else {
                ((ImageView)(view)).setImageResource(R.drawable.ic_hide);
                //Hide Password
                etRetypePassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.im_back:
                finish();
                break;
        }
    }
}
