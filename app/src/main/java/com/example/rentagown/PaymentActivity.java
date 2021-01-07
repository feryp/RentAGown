package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class PaymentActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout btnChoosePaymentMethod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        //INIT VIEW
        btnChoosePaymentMethod = findViewById(R.id.btn_choose_payment_method);

        //SET LISTENER
        btnChoosePaymentMethod.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_choose_payment_method:
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(PaymentActivity.this, R.style.BottomSheetDialogTheme);
                View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(
                        R.layout.layout_bottom_sheet_payment_method,
                        (LinearLayout)findViewById(R.id.bottom_sheet_container));

//                RadioGroup radioGroup = findViewById(R.id.radio_group);
//                RadioButton selectPaymentButton;
//
//                int selectedId = radioGroup.getCheckedRadioButtonId();
//                selectPaymentButton = (RadioButton) findViewById(selectedId);
//                if (selectedId == 0){
//                    Toast.makeText(PaymentActivity.this,"Nothing Selected", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(PaymentActivity.this, selectPaymentButton.getText(), Toast.LENGTH_SHORT).show();
//                }

                bottomSheetView.findViewById(R.id.btn_close).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bottomSheetDialog.dismiss();
                    }
                });

                bottomSheetView.findViewById(R.id.btn_continue).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(PaymentActivity.this, "Payment Method", Toast.LENGTH_SHORT).show();
                        bottomSheetDialog.dismiss();
                    }
                });
                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();
                break;
        }
    }
}