package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.rentagown.Adapter.PageAdapterDetailProduct;
import com.example.rentagown.Adapter.SliderViewProductAdapter;
import com.example.rentagown.Model.SliderItemProduct;
import com.google.android.material.tabs.TabLayout;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewProductActivity extends AppCompatActivity implements View.OnClickListener {

    SliderViewProductAdapter sliderViewProductAdapter;
    SliderView sliderView;
    List<SliderItemProduct> sliderItemProductList;
    TabLayout tabDetailProduct;
    ImageButton back, like;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product);

        //INIT VIEW
        sliderView = findViewById(R.id.slider_view_product);
        tabDetailProduct = findViewById(R.id.tab_detail_product);
        back = findViewById(R.id.im_back);
        like = findViewById(R.id.im_like);
        final ViewPager viewPager = findViewById(R.id.vp_detail_product);

        sliderView.setIndicatorAnimation(IndicatorAnimationType.SLIDE);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
//        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
//        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
//        sliderView.startAutoCycle();

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
        like.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.im_back:
                finish();
                break;
        }
    }
}