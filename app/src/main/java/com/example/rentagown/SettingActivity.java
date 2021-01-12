package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Toast;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    ImageButton back;
    ConstraintLayout editProfile, changePassword, changeAddress;
    SwitchCompat pushCatalogUpdate, pushPromo, pushTransactions;
    SharedPreferences sharedPreferences;
    String PACKAGE_NAME = "com.example.rentagown";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        editProfile = findViewById(R.id.menu_edit_profile);
        changePassword = findViewById(R.id.menu_change_password);
        changeAddress = findViewById(R.id.menu_change_address);
        pushCatalogUpdate = findViewById(R.id.toogle_switch_catalog_update);
        pushPromo = findViewById(R.id.toogle_switch_promo);
        pushTransactions = findViewById(R.id.toogle_switch_transactions);

        //SET LISTENER
        back.setOnClickListener(this);
        editProfile.setOnClickListener(this);
        changePassword.setOnClickListener(this);
        changeAddress.setOnClickListener(this);

        if (pushCatalogUpdate != null){
            pushCatalogUpdate.setOnCheckedChangeListener(this);
        }

        if (pushPromo != null){
            pushPromo.setOnCheckedChangeListener(this);
        }

        if (pushTransactions != null){
            pushTransactions.setOnCheckedChangeListener(this);
        }
    }

    @SuppressLint("NonConstantResourceId")
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

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.toogle_switch_catalog_update:
                Toast.makeText(SettingActivity.this, "Notification switch " + (isChecked ? "on" : "off"),Toast.LENGTH_SHORT).show();
                if (isChecked) {
                    Toast.makeText(SettingActivity.this, "Notification On", Toast.LENGTH_SHORT).show();
                    pushCatalogUpdate.setChecked(true);
                    saveNotifSetting(true);
                } else {
                    Toast.makeText(SettingActivity.this, "Notification Off", Toast.LENGTH_SHORT).show();
                    pushCatalogUpdate.setChecked(false);
                    saveNotifSetting(false);
                }
                break;

            case R.id.toogle_switch_promo:
                Toast.makeText(SettingActivity.this, "Notification switch " + (isChecked ? "on" : "off"),Toast.LENGTH_SHORT).show();
                if (isChecked) {
                    Toast.makeText(SettingActivity.this, "Notification On", Toast.LENGTH_SHORT).show();
                    pushPromo.setChecked(true);
                    saveNotifSetting(true);
                } else {
                    Toast.makeText(SettingActivity.this, "Notification Off", Toast.LENGTH_SHORT).show();
                    pushPromo.setChecked(false);
                    saveNotifSetting(false);
                }
                break;

            case R.id.toogle_switch_transactions:
                Toast.makeText(SettingActivity.this, "Notification switch " + (isChecked ? "on" : "off"),Toast.LENGTH_SHORT).show();
                if (isChecked) {
                    Toast.makeText(SettingActivity.this, "Notification On", Toast.LENGTH_SHORT).show();
                    pushTransactions.setChecked(true);
                    saveNotifSetting(true);
                } else {
                    Toast.makeText(SettingActivity.this, "Notification Off", Toast.LENGTH_SHORT).show();
                    pushTransactions.setChecked(false);
                    saveNotifSetting(false);
                }
                break;
        }

    }

    private void saveNotifSetting(boolean notification) {
        sharedPreferences = getApplicationContext().getSharedPreferences(PACKAGE_NAME + "SETTING_NOTIF", Context.MODE_PRIVATE);
        sharedPreferences.getBoolean("notif", false);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("notif", notification);
        editor.apply();
    }
}
