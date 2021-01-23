package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.rentagown.Adapter.FavoriteGownAdapter;
import com.example.rentagown.Adapter.NewGownAdapter;
import com.example.rentagown.Adapter.SliderNewGownAdapter;
import com.example.rentagown.Model.FavoriteGown;
import com.example.rentagown.Model.NewGown;

import java.util.ArrayList;
import java.util.List;

public class NewGownActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton back;
    RecyclerView rvNewGown;
    NewGownAdapter newGownAdapter;
    List<NewGown> newGownList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_gown);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        rvNewGown = findViewById(R.id.rv_list_new_gown);

        //Slider New Gown
        newGownList = new ArrayList<>();
        newGownList.add(new NewGown(R.drawable.new_product,"Nude Embellishment Mermaid Gown","Rp. 4.000.000"));
        newGownList.add(new NewGown(R.drawable.new_product,"Nude Embellishment Mermaid Gown","Rp. 4.000.000"));
        newGownList.add(new NewGown(R.drawable.new_product,"Nude Embellishment Mermaid Gown","Rp. 4.000.000"));
        newGownList.add(new NewGown(R.drawable.new_product,"Nude Embellishment Mermaid Gown","Rp. 4.000.000"));
        newGownList.add(new NewGown(R.drawable.new_product,"Nude Embellishment Mermaid Gown","Rp. 4.000.000"));
        newGownList.add(new NewGown(R.drawable.new_product,"Nude Embellishment Mermaid Gown","Rp. 4.000.000"));

        //Setup Recycler View New Gown
        newGownAdapter = new NewGownAdapter(this, newGownList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        rvNewGown.setLayoutManager(gridLayoutManager);
        rvNewGown.setAdapter(newGownAdapter);

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