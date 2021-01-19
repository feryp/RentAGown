package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.rentagown.Adapter.InvoiceHistoryAdapter;
import com.example.rentagown.Adapter.TransactionStatusAdapter;
import com.example.rentagown.Model.TransactionStatus;

import java.util.ArrayList;
import java.util.List;

public class TransactionStatusActivity extends AppCompatActivity implements View.OnClickListener{

    RecyclerView rvTransactionStatus;
    LinearLayout layoutEmpty;
    Button btnRepayment;
    ImageButton back;
    List<TransactionStatus> transactionStatusList;
    TransactionStatusAdapter transactionStatusAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_status);

        //INIT VIEW
        rvTransactionStatus = findViewById(R.id.rv_transaction_status);
        back = findViewById(R.id.im_back);
        btnRepayment = findViewById(R.id.btn_repayment);
        layoutEmpty = findViewById(R.id.layout_transaction_empty);

        //List Invoice History
        transactionStatusList = new ArrayList<>();
        transactionStatusList.add(new TransactionStatus(
                "08 SEP 2020",
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "10:15",
                "Deposit Booking",
                "Rp. 500.000"));

        transactionStatusList.add(new TransactionStatus(
                "08 SEP 2020",
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "10:15",
                "Deposit Booking",
                "Rp. 500.000"));

        transactionStatusList.add(new TransactionStatus(
                "08 SEP 2020",
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "10:15",
                "Deposit Booking",
                "Rp. 500.000"));

        transactionStatusList.add(new TransactionStatus(
                "08 SEP 2020",
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "10:15",
                "Deposit Booking",
                "Rp. 500.000"));

        transactionStatusList.add(new TransactionStatus(
                "08 SEP 2020",
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "10:15",
                "Deposit Booking",
                "Rp. 500.000"));

        transactionStatusList.add(new TransactionStatus(
                "08 SEP 2020",
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "10:15",
                "Deposit Booking",
                "Rp. 500.000"));

        transactionStatusList.add(new TransactionStatus(
                "08 SEP 2020",
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "10:15",
                "Deposit Booking",
                "Rp. 500.000"));

        transactionStatusList.add(new TransactionStatus(
                "08 SEP 2020",
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "10:15",
                "Deposit Booking",
                "Rp. 500.000"));

        //Set up Adapter
        transactionStatusAdapter = new TransactionStatusAdapter(this,transactionStatusList);
        rvTransactionStatus.setLayoutManager(new LinearLayoutManager(this));
        rvTransactionStatus.setAdapter(transactionStatusAdapter);

        if (transactionStatusAdapter.getItemCount() > 0){
            layoutEmpty.setVisibility(View.GONE);
        }

        //SET LISTENER
        back.setOnClickListener(this);
        btnRepayment.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_back:
                finish();
                break;

            case R.id.btn_repayment:
                break;

        }
    }
}