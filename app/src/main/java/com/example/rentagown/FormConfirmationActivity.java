package com.example.rentagown;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormConfirmationActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton back;
    Button btnConfirm;
    Spinner spinnerBankName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_confirmation);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        btnConfirm = findViewById(R.id.btn_confirm);
        spinnerBankName = findViewById(R.id.spinner_bank_name);

        //SET LISTENER
        back.setOnClickListener(this);
        btnConfirm.setOnClickListener(this);

        // Initializing a String Array
        String[] bank = new String[]{
                "Your Bank Name",
                "BCA",
                "BNI",
                "MANDIRI",
                "BRI",
                "CIMB NIAGA"
        };

        final List<String> listBank = new ArrayList<>(Arrays.asList(bank));

        // Initializing an ArrayAdapter
        final ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                this, R.layout.layout_item_spinner, listBank) {
            @Override
            public boolean isEnabled(int position) {
                if (position == 0) {

                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;
                } else {

                    return true;
                }
            }

            @Override
            public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) view;
                if (position == 0) {
                    // Set the hint text color gray
                    tv.setTextColor(Color.GRAY);
                } else {
                    tv.setTextColor(Color.BLACK);
                }
                return view;
            }
        };
        spinnerBankName.setAdapter(spinnerArrayAdapter);

        spinnerBankName.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItemText = (String) parent.getItemAtPosition(position);
                // If user change the default selection
                // First item is disable and it is used for hint
                if (position > 0){
                    // Notify the selected item text

                    Toast.makeText(getApplicationContext(),"Selected : " + selectedItemText,Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_back:
                finish();
                break;

            case R.id.btn_confirm:
                Intent confirm = new Intent(FormConfirmationActivity.this, BookingSuccessActivity.class);
                startActivity(confirm);
                break;


        }

    }
}