package com.example.rentagown.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentagown.Adapter.CategoryMarkettingAdapter;
import com.example.rentagown.Adapter.PageMainAdapter;
import com.example.rentagown.Model.CategoryMarketting;
import com.example.rentagown.Model.ItemMarketting;
import com.example.rentagown.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_home, container, false);

        //INIT VIEW
        RecyclerView rvTitleCategory = view.findViewById(R.id.rv_category_marketting);
        TabLayout tabLayout = view.findViewById(R.id.tab_main_menu);


        tabLayout.addTab(tabLayout.newTab().setText("Prewedding"));
        tabLayout.addTab(tabLayout.newTab().setText("Wedding"));
        tabLayout.addTab(tabLayout.newTab().setText("Family"));
        tabLayout.addTab(tabLayout.newTab().setText("Maternity"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = view.findViewById(R.id.view_pager);
        final PageMainAdapter adapter = new PageMainAdapter(getFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
//        viewPager.beginFakeDrag();
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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

        List<ItemMarketting> productFavourite = new ArrayList<>();
        productFavourite.add(new ItemMarketting(1, R.drawable.product_favourite, "Dahlia Cascade Layered Jumpsuit", "Rp. 12.000.000"));
        productFavourite.add(new ItemMarketting(1, R.drawable.product_favourite, "Dahlia Cascade Layered Jumpsuit", "Rp. 12.000.000"));
        productFavourite.add(new ItemMarketting(1, R.drawable.product_favourite, "Dahlia Cascade Layered Jumpsuit", "Rp. 12.000.000"));
        productFavourite.add(new ItemMarketting(1, R.drawable.product_favourite, "Dahlia Cascade Layered Jumpsuit", "Rp. 12.000.000"));
        productFavourite.add(new ItemMarketting(1, R.drawable.product_favourite, "Dahlia Cascade Layered Jumpsuit", "Rp. 12.000.000"));
        productFavourite.add(new ItemMarketting(1, R.drawable.product_favourite, "Dahlia Cascade Layered Jumpsuit", "Rp. 12.000.000"));

        List<ItemMarketting> productNew = new ArrayList<>();
        productNew.add(new ItemMarketting(1, R.drawable.new_product, "Nude Embellishment Mermaid Gown", "Rp. 4.000.000"));
        productNew.add(new ItemMarketting(1, R.drawable.new_product, "Nude Embellishment Mermaid Gown", "Rp. 4.000.000"));
        productNew.add(new ItemMarketting(1, R.drawable.new_product, "Nude Embellishment Mermaid Gown", "Rp. 4.000.000"));
        productNew.add(new ItemMarketting(1, R.drawable.new_product, "Nude Embellishment Mermaid Gown", "Rp. 4.000.000"));
        productNew.add(new ItemMarketting(1, R.drawable.new_product, "Nude Embellishment Mermaid Gown", "Rp. 4.000.000"));
        productNew.add(new ItemMarketting(1, R.drawable.new_product, "Nude Embellishment Mermaid Gown", "Rp. 4.000.000"));

        //add dummy
        List<CategoryMarketting> categoryMarkettingList = new ArrayList<>();
        categoryMarkettingList.add(new CategoryMarketting("Favourite Gown", productFavourite));
        categoryMarkettingList.add(new CategoryMarketting("New Gown", productNew));

        CategoryMarkettingAdapter categoryMarkettingAdapter = new CategoryMarkettingAdapter(getContext(), categoryMarkettingList);
        rvTitleCategory.setLayoutManager(new LinearLayoutManager(getContext()));
        rvTitleCategory.setAdapter(categoryMarkettingAdapter);


        return view;

    }

}
