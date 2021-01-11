package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.rentagown.Adapter.ItemInvoiceAdapter;
import com.example.rentagown.Model.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton back;
    RecyclerView rvItemInvoice;
    ItemInvoiceAdapter adapter;
    List<Invoice> invoiceList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        rvItemInvoice = findViewById(R.id.rv_item_invoice);

        //List Invoice
        invoiceList = new ArrayList<>();
        invoiceList.add(new Invoice("Selina Colourblock Camisole Dress","Rp. 5.000.000"));
        invoiceList.add(new Invoice("Selina Colourblock Camisole Dress","Rp. 5.000.000"));
        invoiceList.add(new Invoice("Selina Colourblock Camisole Dress","Rp. 5.000.000"));

        //Setup adapter
        adapter = new ItemInvoiceAdapter(this, invoiceList);
        rvItemInvoice.setLayoutManager(new LinearLayoutManager(this));
        rvItemInvoice.setAdapter(adapter);

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