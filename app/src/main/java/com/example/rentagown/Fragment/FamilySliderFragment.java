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

public class FamilySliderFragment extends Fragment {

    ArrayList<MainCategory> mainCategory;
    RecyclerView rvFamily;
    Context context;
    MainCategoryAdapter adapter;

    public FamilySliderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_family_slider, container, false);

        //INIT VIEW
        rvFamily = view.findViewById(R.id.rv_family);

        //Slider Family
        mainCategory = new ArrayList<>();
        mainCategory.add(new MainCategory(R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
        mainCategory.add(new MainCategory(R.drawable.family_2,"Family of Natalia Gown","Rp. 12.000.000"));
        mainCategory.add(new MainCategory(R.drawable.family_3,"Family of George Gown","Rp. 8.000.000"));
        mainCategory.add(new MainCategory(R.drawable.family_4,"Family of Ceminata Gown","Rp. 10.000.000"));
        mainCategory.add(new MainCategory(R.drawable.family_4,"Family of Ceminata Gown","Rp. 10.000.000"));
        mainCategory.add(new MainCategory(R.drawable.family_4,"Family of Ceminata Gown","Rp. 10.000.000"));

        //Setup Recycler View
        adapter = new MainCategoryAdapter(context, mainCategory);
        rvFamily.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false));
        rvFamily.setAdapter(adapter);

        return view;
    }
}
