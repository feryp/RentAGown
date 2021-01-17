package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.rentagown.Adapter.HistoryAdapter;
import com.example.rentagown.Adapter.InvoiceHistoryAdapter;
import com.example.rentagown.Model.History;

import java.util.ArrayList;
import java.util.List;

public class HistoryBookingActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView rvHistory;
    ImageButton back;
    HistoryAdapter historyAdapter;
    List<History> historyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_booking);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        rvHistory = findViewById(R.id.rv_history);

        //List History
        historyList = new ArrayList<>();
        historyList.add(new History(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "Prewedding",
                "Done",
                "8 Jan 2020",
                "Rp. 5.000.000"));

        historyList.add(new History(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "Prewedding",
                "Done",
                "8 Jan 2020",
                "Rp. 5.000.000"));

        historyList.add(new History(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "Prewedding",
                "Done",
                "8 Jan 2020",
                "Rp. 5.000.000"));

        historyList.add(new History(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "Prewedding",
                "Done",
                "8 Jan 2020",
                "Rp. 5.000.000"));

        historyList.add(new History(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "Prewedding",
                "Done",
                "8 Jan 2020",
                "Rp. 5.000.000"));

        historyList.add(new History(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "Prewedding",
                "Done",
                "8 Jan 2020",
                "Rp. 5.000.000"));



        //Set up Adapter
        historyAdapter = new HistoryAdapter(this, historyList);
        rvHistory.setLayoutManager(new LinearLayoutManager(this));
        rvHistory.setAdapter(historyAdapter);

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