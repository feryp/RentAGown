package com.example.rentagown.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentagown.Adapter.MyBookingAdapter;
import com.example.rentagown.Adapter.ProductAdapter;
import com.example.rentagown.Adapter.SimilarCategoryAdapter;
import com.example.rentagown.Model.Product;
import com.example.rentagown.R;

import java.util.ArrayList;
import java.util.List;


public class OverviewFragment extends Fragment {

    RecyclerView rvSimilarCategory;
    List<Product> productList;
    SimilarCategoryAdapter similarCategoryAdapter;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_overview, container, false);

        //INIT VIEW
        rvSimilarCategory = view.findViewById(R.id.rv_similar_category);


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


        return view;
    }
}