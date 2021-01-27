package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.rentagown.Adapter.InvoiceHistoryAdapter;
import com.example.rentagown.Adapter.NoAvailableDateAdapter;
import com.example.rentagown.Model.InvoiceHistory;
import com.example.rentagown.Model.NoAvailableDate;

import java.util.ArrayList;
import java.util.List;

public class SeeNoAvailableDateActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton back;
    RecyclerView rvNoAvailableDate;
    NoAvailableDateAdapter availableDateAdapter;
    List<NoAvailableDate> noAvailableDateList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_no_available_date);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        rvNoAvailableDate = findViewById(R.id.rv_no_available_date);

        //List NoAvailableDate
        noAvailableDateList = new ArrayList<>();
        noAvailableDateList.add(new NoAvailableDate("9 September 2021","21 September 2021"));
        noAvailableDateList.add(new NoAvailableDate("9 September 2021","21 September 2021"));
        noAvailableDateList.add(new NoAvailableDate("9 September 2021","21 September 2021"));
        noAvailableDateList.add(new NoAvailableDate("9 September 2021","21 September 2021"));
        noAvailableDateList.add(new NoAvailableDate("9 September 2021","21 September 2021"));
        noAvailableDateList.add(new NoAvailableDate("9 September 2021","21 September 2021"));
        noAvailableDateList.add(new NoAvailableDate("9 September 2021","21 September 2021"));
        noAvailableDateList.add(new NoAvailableDate("9 September 2021","21 September 2021"));
        noAvailableDateList.add(new NoAvailableDate("9 September 2021","21 September 2021"));
        noAvailableDateList.add(new NoAvailableDate("9 September 2021","21 September 2021"));



        //Set up Adapter
        availableDateAdapter = new NoAvailableDateAdapter(this, noAvailableDateList);
        rvNoAvailableDate.setLayoutManager(new LinearLayoutManager(this));
        rvNoAvailableDate.setAdapter(availableDateAdapter);

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