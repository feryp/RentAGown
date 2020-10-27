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


public class PreweddingSliderFragment extends Fragment {

    ArrayList<MainCategory> mainCategory;
    RecyclerView rvPrewedding;
    Context context;
    MainCategoryAdapter adapter;

    public PreweddingSliderFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_prewedding_slider, container, false);

        //INIT VIEW
        rvPrewedding = view.findViewById(R.id.rv_prewedding);

        //Slider Prewedding
        mainCategory = new ArrayList<>();
        mainCategory.add(new MainCategory(R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
        mainCategory.add(new MainCategory(R.drawable.prewedding_2,"Gretia V-neck Midi Bodycon Dress","Rp. 6.200.000"));
        mainCategory.add(new MainCategory(R.drawable.prewedding_3,"Endora Ruched Midi Dress","Rp. 4.000.000"));
        mainCategory.add(new MainCategory(R.drawable.prewedding_4,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
        mainCategory.add(new MainCategory(R.drawable.prewedding_5,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
        mainCategory.add(new MainCategory(R.drawable.prewedding_6,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));

        //Setup Recycler View
        adapter = new MainCategoryAdapter(context, mainCategory);
        rvPrewedding.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false));
        rvPrewedding.setAdapter(adapter);
        return view;
    }
}
