package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.rentagown.Adapter.FavoriteGownAdapter;
import com.example.rentagown.Adapter.ProductAdapter;
import com.example.rentagown.Model.FavoriteGown;
import com.example.rentagown.Model.Product;
import com.example.rentagown.Model.Wishlist;

import java.util.ArrayList;
import java.util.List;

public class FavoriteGownActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton back;
    RecyclerView rvFavoriteGown;
    FavoriteGownAdapter favoriteGownAdapter;
    List<FavoriteGown> favoriteGownList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_gown);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        rvFavoriteGown = findViewById(R.id.rv_list_favorite_gown);

        //List Product Favorite
        favoriteGownList = new ArrayList<>();
        favoriteGownList.add(new FavoriteGown(R.drawable.product_favourite,"Dahlia Cascade Layered Jumpsuit","Rp. 12.000.000"));
        favoriteGownList.add(new FavoriteGown(R.drawable.product_favourite,"Dahlia Cascade Layered Jumpsuit","Rp. 12.000.000"));
        favoriteGownList.add(new FavoriteGown(R.drawable.product_favourite,"Dahlia Cascade Layered Jumpsuit","Rp. 12.000.000"));
        favoriteGownList.add(new FavoriteGown(R.drawable.product_favourite,"Dahlia Cascade Layered Jumpsuit","Rp. 12.000.000"));
        favoriteGownList.add(new FavoriteGown(R.drawable.product_favourite,"Dahlia Cascade Layered Jumpsuit","Rp. 12.000.000"));
        favoriteGownList.add(new FavoriteGown(R.drawable.product_favourite,"Dahlia Cascade Layered Jumpsuit","Rp. 12.000.000"));

        //Setup Recycler View Favorite
        favoriteGownAdapter = new FavoriteGownAdapter(this, favoriteGownList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        rvFavoriteGown.setLayoutManager(gridLayoutManager);
        rvFavoriteGown.setAdapter(favoriteGownAdapter);

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