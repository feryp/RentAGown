package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.rentagown.Adapter.SliderViewFullscreenAdapter;
import com.example.rentagown.Model.SliderItemProduct;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class FullscreenActivity extends AppCompatActivity implements View.OnClickListener {

    SliderView sliderView;
    SliderViewFullscreenAdapter sliderViewFullscreenAdapter;
    List<SliderItemProduct> sliderItemProductList;
    ImageButton btnClose;
    Button btnAddtoWishlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        //INIT VIEW
        sliderView = findViewById(R.id.slider_view_fullscreen);
        btnClose = findViewById(R.id.im_close);
        btnAddtoWishlist = findViewById(R.id.btn_add_wishlist);

        sliderItemProductList = new ArrayList<>();
        sliderItemProductList.add(new SliderItemProduct(R.drawable.image_product_slide_1));
        sliderItemProductList.add(new SliderItemProduct(R.drawable.image_product_slide_2));
        sliderItemProductList.add(new SliderItemProduct(R.drawable.image_product_slide_3));

        //Setup adapter
        sliderViewFullscreenAdapter = new SliderViewFullscreenAdapter(this, sliderItemProductList);
        sliderView.setSliderAdapter(sliderViewFullscreenAdapter);

        Intent intent = getIntent();
        int pos = intent.getIntExtra("posisi", 0);
        sliderView.setCurrentPagePosition(pos);

        //Set Listener
        btnClose.setOnClickListener(this);
        btnAddtoWishlist.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_close:
                finish();
                break;
            case R.id.btn_add_wishlist:
                //belum ada logic
                break;
        }
    }
}