package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.rentagown.Adapter.InvoiceHistoryAdapter;
import com.example.rentagown.Model.InvoiceHistory;

import java.util.ArrayList;

public class InvoiceHistoryActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView rvInvoiceHistory;
    LinearLayout layoutEmpty;
    ImageButton back;
    ArrayList<InvoiceHistory> invoiceHistoryList;
    InvoiceHistoryAdapter historyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice_history);

        //INIT VIEW
        rvInvoiceHistory = findViewById(R.id.rv_invoice_history);
        back = findViewById(R.id.im_back);
        layoutEmpty = findViewById(R.id.layout_invoice_empty);

        //List Invoice History
        invoiceHistoryList = new ArrayList<>();
        invoiceHistoryList.add(new InvoiceHistory(
                "INV-08092020-070001",
                "Transfer Manual",
                "10:15",
                "08 Sep 2020",
                "Rp. 2.000.000"));
        invoiceHistoryList.add(new InvoiceHistory(
                "INV-08092020-070001",
                "Transfer Manual",
                "10:15",
                "08 Sep 2020",
                "Rp. 2.000.000"));
        invoiceHistoryList.add(new InvoiceHistory(
                "INV-08092020-070001",
                "Transfer Manual",
                "10:15",
                "08 Sep 2020",
                "Rp. 2.000.000"));
        invoiceHistoryList.add(new InvoiceHistory(
                "INV-08092020-070001",
                "Transfer Manual",
                "10:15",
                "08 Sep 2020",
                "Rp. 2.000.000"));
        invoiceHistoryList.add(new InvoiceHistory(
                "INV-08092020-070001",
                "Transfer Manual",
                "10:15",
                "08 Sep 2020",
                "Rp. 2.000.000"));
        invoiceHistoryList.add(new InvoiceHistory(
                "INV-08092020-070001",
                "Transfer Manual",
                "10:15",
                "08 Sep 2020",
                "Rp. 2.000.000"));
        invoiceHistoryList.add(new InvoiceHistory(
                "INV-08092020-070001",
                "Transfer Manual",
                "10:15",
                "08 Sep 2020",
                "Rp. 2.000.000"));
        invoiceHistoryList.add(new InvoiceHistory(
                "INV-08092020-070001",
                "Transfer Manual",
                "10:15",
                "08 Sep 2020",
                "Rp. 2.000.000"));
        invoiceHistoryList.add(new InvoiceHistory(
                "INV-08092020-070001",
                "Transfer Manual",
                "10:15",
                "08 Sep 2020",
                "Rp. 2.000.000"));
        invoiceHistoryList.add(new InvoiceHistory(
                "INV-08092020-070001",
                "Transfer Manual",
                "10:15",
                "08 Sep 2020",
                "Rp. 2.000.000"));
        invoiceHistoryList.add(new InvoiceHistory(
                "INV-08092020-070001",
                "Transfer Manual",
                "10:15",
                "08 Sep 2020",
                "Rp. 2.000.000"));
        invoiceHistoryList.add(new InvoiceHistory(
                "INV-08092020-070001",
                "Transfer Manual",
                "10:15",
                "08 Sep 2020",
                "Rp. 2.000.000"));
        invoiceHistoryList.add(new InvoiceHistory(
                "INV-08092020-070001",
                "Transfer Manual",
                "10:15",
                "08 Sep 2020",
                "Rp. 2.000.000"));
        invoiceHistoryList.add(new InvoiceHistory(
                "INV-08092020-070001",
                "Transfer Manual",
                "10:15",
                "08 Sep 2020",
                "Rp. 2.000.000"));

        //Set up Adapter
        historyAdapter = new InvoiceHistoryAdapter(invoiceHistoryList, this);
        rvInvoiceHistory.setLayoutManager(new LinearLayoutManager(this));
        rvInvoiceHistory.setAdapter(historyAdapter);

        if (historyAdapter.getItemCount() > 0){
            layoutEmpty.setVisibility(View.GONE);
        }

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
