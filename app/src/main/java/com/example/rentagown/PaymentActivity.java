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

    LinearLayout btnChoosePaymentMethod, btnChooseBank;
    ImageButton back, btnWhatsaap;
    Button btnPayment, btnAddAddress, btnChangeAddress;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        btnChoosePaymentMethod = findViewById(R.id.btn_choose_payment_method);
        btnChooseBank = findViewById(R.id.choose_list_bank);
        btnPayment = findViewById(R.id.btn_payment);
        btnWhatsaap = findViewById(R.id.btn_whatsapp);
        btnAddAddress = findViewById(R.id.btn_add_address);
        btnChangeAddress = findViewById(R.id.btn_change_address);

        //SET LISTENER
        back.setOnClickListener(this);
        btnChoosePaymentMethod.setOnClickListener(this);
        btnChooseBank.setOnClickListener(this);
        btnPayment.setOnClickListener(this);
        btnWhatsaap.setOnClickListener(this);
        btnAddAddress.setOnClickListener(this);
        btnChangeAddress.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_back:
                finish();
                break;

            case R.id.btn_add_address:
                Intent addAddress = new Intent(PaymentActivity.this, AddAddressActivity.class);
                startActivity(addAddress);
                break;

            case R.id.btn_change_address:
                Intent changeAddress = new Intent(PaymentActivity.this, ChangeAddressActivity.class);
                startActivity(changeAddress);
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

            case R.id.choose_list_bank:
                Intent chooseBank = new Intent(PaymentActivity.this, ChoiceBankActivity.class);
                startActivity(chooseBank);
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