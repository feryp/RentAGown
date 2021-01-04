package com.example.rentagown.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentagown.Adapter.NotifPromoAdapter;
import com.example.rentagown.Adapter.NotifTransactionAdapter;
import com.example.rentagown.Model.NotifPromo;
import com.example.rentagown.R;

import java.util.ArrayList;
import java.util.List;


public class NotifPromoFragment extends Fragment {

    RecyclerView rvNotifPromo;
    List<NotifPromo> notifPromoList;
    NotifPromoAdapter notifPromoAdapter;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notif_promo, container, false);

        //INIT VIEW
        rvNotifPromo = view.findViewById(R.id.rv_notif_promo);

        //List
        notifPromoList = new ArrayList<>();
        notifPromoList.add(new NotifPromo(
                "17 AGT 2020",
                "Promo Spesial HUT RI Ke 71",
                "Diskon hingga 80%",
                "Dari style Prewedding produk terbaik dengan diskon hingga 80% lho! Cek sekarang, cuma di HUT RI ke 71 ini."));
        notifPromoList.add(new NotifPromo(
                "17 AGT 2020",
                "Promo Spesial HUT RI Ke 71",
                "Diskon hingga 80%",
                "Dari style Prewedding produk terbaik dengan diskon hingga 80% lho! Cek sekarang, cuma di HUT RI ke 71 ini."));
        notifPromoList.add(new NotifPromo(
                "17 AGT 2020",
                "Promo Spesial HUT RI Ke 71",
                "Diskon hingga 80%",
                "Dari style Prewedding produk terbaik dengan diskon hingga 80% lho! Cek sekarang, cuma di HUT RI ke 71 ini."));
        notifPromoList.add(new NotifPromo(
                "17 AGT 2020",
                "Promo Spesial HUT RI Ke 71",
                "Diskon hingga 80%",
                "Dari style Prewedding produk terbaik dengan diskon hingga 80% lho! Cek sekarang, cuma di HUT RI ke 71 ini."));
        notifPromoList.add(new NotifPromo(
                "17 AGT 2020",
                "Promo Spesial HUT RI Ke 71",
                "Diskon hingga 80%",
                "Dari style Prewedding produk terbaik dengan diskon hingga 80% lho! Cek sekarang, cuma di HUT RI ke 71 ini."));
        notifPromoList.add(new NotifPromo(
                "17 AGT 2020",
                "Promo Spesial HUT RI Ke 71",
                "Diskon hingga 80%",
                "Dari style Prewedding produk terbaik dengan diskon hingga 80% lho! Cek sekarang, cuma di HUT RI ke 71 ini."));
        notifPromoList.add(new NotifPromo(
                "17 AGT 2020",
                "Promo Spesial HUT RI Ke 71",
                "Diskon hingga 80%",
                "Dari style Prewedding produk terbaik dengan diskon hingga 80% lho! Cek sekarang, cuma di HUT RI ke 71 ini."));
        notifPromoList.add(new NotifPromo(
                "17 AGT 2020",
                "Promo Spesial HUT RI Ke 71",
                "Diskon hingga 80%",
                "Dari style Prewedding produk terbaik dengan diskon hingga 80% lho! Cek sekarang, cuma di HUT RI ke 71 ini."));
        notifPromoList.add(new NotifPromo(
                "17 AGT 2020",
                "Promo Spesial HUT RI Ke 71",
                "Diskon hingga 80%",
                "Dari style Prewedding produk terbaik dengan diskon hingga 80% lho! Cek sekarang, cuma di HUT RI ke 71 ini."));
        notifPromoList.add(new NotifPromo(
                "17 AGT 2020",
                "Promo Spesial HUT RI Ke 71",
                "Diskon hingga 80%",
                "Dari style Prewedding produk terbaik dengan diskon hingga 80% lho! Cek sekarang, cuma di HUT RI ke 71 ini."));

        //Setup Recycler View
        notifPromoAdapter = new NotifPromoAdapter(context, notifPromoList);
        rvNotifPromo.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvNotifPromo.setAdapter(notifPromoAdapter);


        return view;
    }
}