package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.rentagown.Adapter.PageAdapterDetailProduct;
import com.example.rentagown.Adapter.SliderViewProductAdapter;
import com.example.rentagown.Model.SliderItemProduct;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

import biz.laenger.android.vpbs.BottomSheetUtils;
import biz.laenger.android.vpbs.ViewPagerBottomSheetBehavior;

public class ViewProductActivity extends AppCompatActivity implements View.OnClickListener {

    SliderViewProductAdapter sliderViewProductAdapter;
    SliderView sliderView;
    List<SliderItemProduct> sliderItemProductList;
    TabLayout tabDetailProduct;
    ImageButton back, btnWhatsapp;
    Button btnBookNow;
    LinearLayout bottomSheet;

    //tambahan variable
    CoordinatorLayout containerViewProduct;
    ViewPagerBottomSheetBehavior behavior;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product);

        //INIT VIEW
        containerViewProduct = findViewById(R.id.containerActivityViewProduct);
        sliderView = findViewById(R.id.slider_view_product);
        tabDetailProduct = findViewById(R.id.tab_detail_product);
        back = findViewById(R.id.im_back);
        btnWhatsapp = findViewById(R.id.btn_whatsapp);
        btnBookNow = findViewById(R.id.btn_book_now);
        bottomSheet = findViewById(R.id.bottom_sheet);
        final ViewPager viewPager = findViewById(R.id.vp_detail_product);
        BottomSheetUtils.setupViewPager(viewPager);


        sliderView.setIndicatorAnimation(IndicatorAnimationType.SLIDE);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);


        sliderItemProductList = new ArrayList<>();
        sliderItemProductList.add(new SliderItemProduct(R.drawable.image_product_slide_1));
        sliderItemProductList.add(new SliderItemProduct(R.drawable.image_product_slide_2));
        sliderItemProductList.add(new SliderItemProduct(R.drawable.image_product_slide_3));

        //Setup adapter
        sliderViewProductAdapter = new SliderViewProductAdapter(this,sliderItemProductList);
        sliderView.setSliderAdapter(sliderViewProductAdapter);

        //Set Tab Layout
        tabDetailProduct.addTab(tabDetailProduct.newTab().setText("Overview"));
        tabDetailProduct.addTab(tabDetailProduct.newTab().setText("Review"));

        //untuk membuat bottom sheet dinamis
        setupBottomSheet();

        final PageAdapterDetailProduct pageAdapterDetailProduct = new PageAdapterDetailProduct(this,getSupportFragmentManager(),tabDetailProduct.getTabCount());
        viewPager.setAdapter(pageAdapterDetailProduct);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabDetailProduct));
        tabDetailProduct.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //Set Listener
        back.setOnClickListener(this);
        btnWhatsapp.setOnClickListener(this);
        btnBookNow.setOnClickListener(this);

    }

    private void setupBottomSheet() {
        behavior = ViewPagerBottomSheetBehavior.from(bottomSheet);

        //kita cari dulu panjang dari sliderviewnya
        sliderView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                sliderView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int sliderViewHeight = sliderView.getHeight();

                //habis itu kita cari dulu panjang dari containernya
                containerViewProduct.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    @Override
                    public void onGlobalLayout() {
                        containerViewProduct.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        int containerHeight = containerViewProduct.getHeight();

                        behavior.setPeekHeight((containerHeight - sliderViewHeight) + 100);
                    }
                });

            }
        });
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.im_back:
                finish();
                break;

            case R.id.btn_book_now:
                Intent bookNow = new Intent(ViewProductActivity.this, YourBookingActivity.class);
                startActivity(bookNow);
                break;

            case R.id.btn_whatsapp:
                String number = "+6281806155676";
                String url = "https://api.whatsapp.com/send/?phone="+number;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

                break;
        }
    }
}