package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.rentagown.Adapter.ListPromoAdapter;
import com.example.rentagown.Adapter.ProductAdapter;
import com.example.rentagown.Interface.ItemClickListener;
import com.example.rentagown.Model.Promo;

import java.util.ArrayList;
import java.util.List;

public class ListPromoActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton back;
    RecyclerView rvListPromo;
    List<Promo> promoList;
    ListPromoAdapter promoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_promo);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        rvListPromo = findViewById(R.id.rv_list_promo);

        //List Promo
        promoList = new ArrayList<>();
        promoList.add(new Promo(
                R.drawable.promo,
                "Promo",
                "The wait is over Massive sale! 90% off for third purchase on any dress (except wedding dress), " +
                        "Booking period until 15 September 2020. Rental period until December 2021."));

        promoList.add(new Promo(
                R.drawable.promo,
                "Promo",
                "The wait is over Massive sale! 90% off for third purchase on any dress (except wedding dress), " +
                        "Booking period until 15 September 2020. Rental period until December 2021."));

        promoList.add(new Promo(
                R.drawable.promo,
                "Promo",
                "The wait is over Massive sale! 90% off for third purchase on any dress (except wedding dress), " +
                        "Booking period until 15 September 2020. Rental period until December 2021."));

        promoList.add(new Promo(
                R.drawable.promo,
                "Promo",
                "The wait is over Massive sale! 90% off for third purchase on any dress (except wedding dress), " +
                        "Booking period until 15 September 2020. Rental period until December 2021."));

        promoList.add(new Promo(
                R.drawable.promo,
                "Promo",
                "The wait is over Massive sale! 90% off for third purchase on any dress (except wedding dress), " +
                        "Booking period until 15 September 2020. Rental period until December 2021."));

        promoList.add(new Promo(
                R.drawable.promo,
                "Promo",
                "The wait is over Massive sale! 90% off for third purchase on any dress (except wedding dress), " +
                        "Booking period until 15 September 2020. Rental period until December 2021."));

        //Setup Recycler View Product
        promoAdapter = new ListPromoAdapter(this, promoList);
        rvListPromo.setLayoutManager(new GridLayoutManager(this, 2));
        rvListPromo.setAdapter(promoAdapter);

        //SET LISTENER
        back.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.im_back:
                finish();
                break;
        }
    }

}