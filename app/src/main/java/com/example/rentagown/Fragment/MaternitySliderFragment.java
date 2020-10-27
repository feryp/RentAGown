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

public class MaternitySliderFragment extends Fragment {

    ArrayList<MainCategory> mainCategory;
    RecyclerView rvMaternity;
    Context context;
    MainCategoryAdapter adapter;

    public MaternitySliderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_maternity_slider, container, false);

        //INIT VIEW
        rvMaternity = view.findViewById(R.id.rv_maternity);

        //Slider Maternity
        mainCategory = new ArrayList<>();
        mainCategory.add(new MainCategory(R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
        mainCategory.add(new MainCategory(R.drawable.maternity_2,"Navy elegant maternity gown","Rp. 2.500.000"));
        mainCategory.add(new MainCategory(R.drawable.maternity_3,"Red elegant maternity gown","Rp. 3.000.000"));
        mainCategory.add(new MainCategory(R.drawable.maternity_4,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
        mainCategory.add(new MainCategory(R.drawable.maternity_5,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
        mainCategory.add(new MainCategory(R.drawable.maternity_6,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));

        //Setup Recycler View
//        adapter = new MainCategoryAdapter(context, mainCategory);
//        rvMaternity.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false));
//        rvMaternity.setAdapter(adapter);
        return view;
    }
}
