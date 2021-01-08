package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class PaymentActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout btnChoosePaymentMethod;
    ImageButton back, btnWhatsaap;
    Button btnPayment;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        btnChoosePaymentMethod = findViewById(R.id.btn_choose_payment_method);
        btnPayment = findViewById(R.id.btn_payment);
        btnWhatsaap = findViewById(R.id.btn_whatsapp);

        //SET LISTENER
        back.setOnClickListener(this);
        btnChoosePaymentMethod.setOnClickListener(this);
        btnPayment.setOnClickListener(this);
        btnWhatsaap.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_back:
                finish();
                break;

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

            case R.id.btn_payment:
                Intent payment = new Intent(PaymentActivity.this, ConfirmPaymentActivity.class);
                startActivity(payment);
                break;

            case R.id.btn_whatsapp:
                String number = "+6281806155676";
                String url = "https://api.whatsapp.com/send/?phone="+number;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

                break;
        }
    }

}