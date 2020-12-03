package com.example.rentagown.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentagown.Adapter.MainCategoryAdapter;
import com.example.rentagown.Model.MainCategory;
import com.example.rentagown.R;

import java.util.ArrayList;
import java.util.List;

public class WeddingSliderFragment extends Fragment {

    ArrayList<MainCategory> mainCategory;
    RecyclerView rvWedding;
    Context context;
    MainCategoryAdapter adapter;

    public WeddingSliderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wedding_slider, container, false);

        //INIT VIEW
        rvWedding = view.findViewById(R.id.rv_wedding);

        //Slider Wedding
        mainCategory = new ArrayList<>();
        mainCategory.add(new MainCategory(R.drawable.wedding_1,"Trixie Lace Panel Pleated Dress","Rp. 5.000.000"));
        mainCategory.add(new MainCategory(R.drawable.wedding_2,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
        mainCategory.add(new MainCategory(R.drawable.wedding_3,"Claudita Lace Bodycon Dress","Rp. 7.000.000"));
        mainCategory.add(new MainCategory(R.drawable.wedding_4,"Trixie Lace Panel Pleated Dress","Rp. 5.000.000"));
        mainCategory.add(new MainCategory(R.drawable.wedding_5,"Trixie Lace Panel Pleated Dress","Rp. 5.000.000"));
        mainCategory.add(new MainCategory(R.drawable.wedding_6,"Trixie Lace Panel Pleated Dress","Rp. 5.000.000"));

        //Setup Recycler View
        adapter = new MainCategoryAdapter(context, mainCategory);
        rvWedding.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false));
        rvWedding.setAdapter(adapter);

        return view;
    }
}
