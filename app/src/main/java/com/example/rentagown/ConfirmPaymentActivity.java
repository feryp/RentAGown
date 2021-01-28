package com.example.rentagown;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ConfirmPaymentActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton back;
    Button btnConfirmation, btnCancel, btnInvoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_payment);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        btnConfirmation = findViewById(R.id.btn_confirmation);
        btnCancel = findViewById(R.id.btn_cancel);
        btnInvoice = findViewById(R.id.btn_invoice);

        //SET LISTENER
        back.setOnClickListener(this);
        btnConfirmation.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
        btnInvoice.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_back:
                finish();
                break;

            case R.id.btn_confirmation:
                Intent confirmation = new Intent(ConfirmPaymentActivity.this, FormConfirmationActivity.class);
                startActivity(confirmation);
                break;

            case R.id.btn_cancel:
                showCancelDialog();
                break;

            case R.id.btn_invoice:
                Intent invoice = new Intent(ConfirmPaymentActivity.this, InvoiceActivity.class);
                startActivity(invoice);
                break;
        }
    }

    private void showCancelDialog() {
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Cancel Transaction");
        alertDialog.setMessage("Do you want to cancel a transaction ? ");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "YES",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        //fungsi jika transaksi cancel

                        dialog.dismiss();

                    }
                });

        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "NO",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
}