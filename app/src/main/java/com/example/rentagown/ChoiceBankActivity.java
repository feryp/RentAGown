package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.rentagown.Adapter.ChoiceBankAdapter;
import com.example.rentagown.Adapter.InvoiceHistoryAdapter;
import com.example.rentagown.Model.Bank;

import java.util.ArrayList;
import java.util.List;

public class ChoiceBankActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView rvListBank;
    ImageButton back;
    List<Bank> bankList;
    ChoiceBankAdapter choiceBankAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_bank);

        //INIT VIEW
        //INIT VIEW
        rvListBank = findViewById(R.id.rv_list_bank);
        back = findViewById(R.id.im_back);

        //List Bank
        bankList = new ArrayList<>();
        bankList.add(new Bank(1, R.drawable.logo_bca,"Transfer Bank BCA", "John Doe", "5496523645"));
        bankList.add(new Bank(1, R.drawable.logo_bca,"Transfer Bank BCA", "John Doe", "5496523645"));
        bankList.add(new Bank(1, R.drawable.logo_bca,"Transfer Bank BCA", "John Doe", "5496523645"));

        //Set up Adapter
        choiceBankAdapter = new ChoiceBankAdapter(bankList, this);
        rvListBank.setLayoutManager(new LinearLayoutManager(this));
        rvListBank.setAdapter(choiceBankAdapter);


        //SET LISTENER
        back.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_back:
                finish();
                break;

        }
    }
}