package com.example.rentagown;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class YourBookingActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton back, btnWhatsapp, btnDelete;
    Button btnCheckout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_booking);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        btnWhatsapp = findViewById(R.id.btn_whatsapp);
        btnCheckout = findViewById(R.id.btn_checkout);
        btnDelete = findViewById(R.id.btn_delete_your_booking);

        //SET LISTENER
        back.setOnClickListener(this);
        btnWhatsapp.setOnClickListener(this);
        btnCheckout.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.im_back:
                finish();
                break;

            case R.id.btn_delete_your_booking:
                showDeleteDialog();
                break;

            case R.id.btn_checkout:
                Intent checkout = new Intent(YourBookingActivity.this, PaymentActivity.class);
                startActivity(checkout);
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

    private void showDeleteDialog() {
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Delete Item");
        alertDialog.setMessage("Are you sure to remove this item ? ");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "YES",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        //fungsi jika delete your booking

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