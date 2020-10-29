package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton back;
    ConstraintLayout editProfile, changePassword, changeAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        editProfile = findViewById(R.id.menu_edit_profile);
        changePassword = findViewById(R.id.menu_change_password);
        changeAddress = findViewById(R.id.menu_change_address);

        //SET LISTENER
        back.setOnClickListener(this);
        editProfile.setOnClickListener(this);
        changePassword.setOnClickListener(this);
        changeAddress.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.im_back:
                finish();
                break;
            case R.id.menu_edit_profile:
                Intent editProfile = new Intent(SettingActivity.this, EditProfileActivity.class);
                startActivity(editProfile);
                break;
            case R.id.menu_change_password:
                Intent changePassword = new Intent(SettingActivity.this, ChangePasswordActivity.class);
                startActivity(changePassword);
                break;
            case R.id.menu_change_address:
                Intent changeAddress = new Intent(SettingActivity.this, ChangeAddressActivity.class);
                startActivity(changeAddress);
                break;
        }
    }
}
