package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BookingSuccessActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnInvoice, btnBacktoHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_success);

        //INIT VIEW
        btnInvoice = findViewById(R.id.btn_invoice_success);
        btnBacktoHome = findViewById(R.id.btn_back_to_home);

        //SET LISTENER
        btnInvoice.setOnClickListener(this);
        btnBacktoHome.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_invoice_success:
                Intent invoice = new Intent(BookingSuccessActivity.this, InvoiceActivity.class);
                startActivity(invoice);
                break;
        }
    }
}