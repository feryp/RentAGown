package com.example.rentagown.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.rentagown.Adapter.CartAdapter;
import com.example.rentagown.Model.Cart;
import com.example.rentagown.R;

import java.util.ArrayList;
import java.util.List;


public class CartFragment extends Fragment implements View.OnClickListener{

   RecyclerView rvCart;
   List<Cart> cartList;
   CartAdapter cartAdapter;
   Context context;
   Button btnCheckout;
   ImageButton btnWhatsapp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        //INIT VIEW
        rvCart = view.findViewById(R.id.rv_cart_booking);
        btnCheckout = view.findViewById(R.id.btn_checkout);
        btnWhatsapp = view.findViewById(R.id.btn_whatsapp);

        //List Cart
        cartList = new ArrayList<>();
        cartList.add(new Cart(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "Prewedding Gown",
                "One Day Service",
                "Rp. 5.000.000",
                "9 September 2020 - 12 September 2020"));

        cartList.add(new Cart(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "Wedding Gown",
                "One Day Service",
                "Rp. 10.000.000",
                "9 September 2020 - 12 September 2020"));

        cartList.add(new Cart(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "Family Gown",
                "One Day Service",
                "Rp. 20.000.000",
                "9 September 2020 - 12 September 2020"));

        cartList.add(new Cart(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "Prewedding Gown",
                "One Day Service",
                "Rp. 16.000.000",
                "9 September 2020 - 12 September 2020"));

        cartList.add(new Cart(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "Prewedding Gown",
                "One Day Service",
                "Rp. 2.500.000",
                "9 September 2020 - 12 September 2020"));

        //Setup Recycler View
        cartAdapter = new CartAdapter(context, cartList);
        rvCart.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvCart.setAdapter(cartAdapter);

        //SET LISTENER
        btnCheckout.setOnClickListener(CartFragment.this);
        btnWhatsapp.setOnClickListener(CartFragment.this);

        return view;
    }

    @Override
    public void onClick(View v) {

    }
}