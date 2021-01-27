package com.example.rentagown.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.rentagown.Adapter.MyBookingAdapter;
import com.example.rentagown.Adapter.ProductAdapter;
import com.example.rentagown.Adapter.SimilarCategoryAdapter;
import com.example.rentagown.DateBookingActivity;
import com.example.rentagown.InvoiceHistoryActivity;
import com.example.rentagown.Model.Product;
import com.example.rentagown.R;

import java.util.ArrayList;
import java.util.List;


public class OverviewFragment extends Fragment implements View.OnClickListener {

    RecyclerView rvSimilarCategory;
    List<Product> productList;
    SimilarCategoryAdapter similarCategoryAdapter;
    Context context;
    LinearLayout btnStartDate, btnEndDate;
    ImageButton btnLike;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_overview, container, false);

        //INIT VIEW
        rvSimilarCategory = view.findViewById(R.id.rv_similar_category);
        btnLike = view.findViewById(R.id.btn_like);
        btnStartDate = view.findViewById(R.id.layout_detail_start_date);
        btnEndDate = view.findViewById(R.id.layout_detail_end_date);



        //List Similar Category
        productList = new ArrayList<>();
        productList.add(new Product(0,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
        productList.add(new Product(0,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
        productList.add(new Product(0,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
        productList.add(new Product(0,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
        productList.add(new Product(0,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
        productList.add(new Product(0,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
        productList.add(new Product(0,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
        productList.add(new Product(0,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
        productList.add(new Product(0,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
        productList.add(new Product(0,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));

        //Setup Recycler View
        similarCategoryAdapter = new SimilarCategoryAdapter(context, productList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvSimilarCategory.setLayoutManager(gridLayoutManager);
        rvSimilarCategory.setAdapter(similarCategoryAdapter);

        //SET LISTENER
        btnStartDate.setOnClickListener(OverviewFragment.this);
        btnEndDate.setOnClickListener(OverviewFragment.this);
        btnLike.setOnClickListener(OverviewFragment.this);

        return view;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.layout_detail_start_date:

            case R.id.layout_detail_end_date:
                Intent startDate = new Intent(getActivity(), DateBookingActivity.class);
                startActivity(startDate);
                break;

            case R.id.btn_like:
                if (v == btnLike){
                    btnLike.setBackgroundResource(R.drawable.btn_like_selected);
                }
                break;
        }
    }
}