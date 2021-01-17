package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Objects;

public class FittingSizeActivity extends AppCompatActivity implements View.OnClickListener {

    Dialog dialog;
    Button btnTemplate;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitting_size);

        dialog = new Dialog(this);
        back = findViewById(R.id.im_back);
        btnTemplate = findViewById(R.id.btn_template);

        //SET LISTENER
        back.setOnClickListener(this);
        btnTemplate.setOnClickListener(this);

    }

    public void ShowPopup(View view){
        dialog.setContentView(R.layout.layout_popup_template);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_back:
                finish();
                break;

            case R.id.btn_template:
                ShowPopup(v);
                break;

        }
    }
}