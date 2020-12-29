package com.example.rentagown.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentagown.Adapter.NotifTransactionAdapter;
import com.example.rentagown.Model.NotifTransaction;
import com.example.rentagown.R;

import java.util.ArrayList;
import java.util.List;


public class NotifTransactionFragment extends Fragment {

    RecyclerView rvNotifTransaction;
    List<NotifTransaction> notifTransactionList;
    NotifTransactionAdapter notifTransactionAdapter;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notif_transaction, container, false);

        //INIT VIEW
        rvNotifTransaction = view.findViewById(R.id.rv_notif_transaction);

        //List
        notifTransactionList = new ArrayList<>();
        notifTransactionList.add(new NotifTransaction(
                "08 SEP 2020",
                "Prewedding David & Josephine",
                "Sep 9 - Sep 12",
                "07:00-12:00 am",
                "Deposit Booking",
                "Rp. 2.000.000",
                "Successfull"));
        notifTransactionList.add(new NotifTransaction(
                "08 SEP 2020",
                "Prewedding David & Josephine",
                "Sep 9 - Sep 12",
                "07:00-12:00 am",
                "Deposit Booking",
                "Rp. 2.000.000",
                "Successfull"));
        notifTransactionList.add(new NotifTransaction(
                "08 SEP 2020",
                "Prewedding David & Josephine",
                "Sep 9 - Sep 12",
                "07:00-12:00 am",
                "Deposit Booking",
                "Rp. 2.000.000",
                "Successfull"));
        notifTransactionList.add(new NotifTransaction(
                "08 SEP 2020",
                "Prewedding David & Josephine",
                "Sep 9 - Sep 12",
                "07:00-12:00 am",
                "Deposit Booking",
                "Rp. 2.000.000",
                "Successfull"));
        notifTransactionList.add(new NotifTransaction(
                "08 SEP 2020",
                "Prewedding David & Josephine",
                "Sep 9 - Sep 12",
                "07:00-12:00 am",
                "Deposit Booking",
                "Rp. 2.000.000",
                "Successfull"));
        notifTransactionList.add(new NotifTransaction(
                "08 SEP 2020",
                "Prewedding David & Josephine",
                "Sep 9 - Sep 12",
                "07:00-12:00 am",
                "Deposit Booking",
                "Rp. 2.000.000",
                "Successfull"));
        notifTransactionList.add(new NotifTransaction(
                "08 SEP 2020",
                "Prewedding David & Josephine",
                "Sep 9 - Sep 12",
                "07:00-12:00 am",
                "Deposit Booking",
                "Rp. 2.000.000",
                "Successfull"));
        notifTransactionList.add(new NotifTransaction(
                "08 SEP 2020",
                "Prewedding David & Josephine",
                "Sep 9 - Sep 12",
                "07:00-12:00 am",
                "Deposit Booking",
                "Rp. 2.000.000",
                "Successfull"));
        notifTransactionList.add(new NotifTransaction(
                "08 SEP 2020",
                "Prewedding David & Josephine",
                "Sep 9 - Sep 12",
                "07:00-12:00 am",
                "Deposit Booking",
                "Rp. 2.000.000",
                "Successfull"));
        notifTransactionList.add(new NotifTransaction(
                "08 SEP 2020",
                "Prewedding David & Josephine",
                "Sep 9 - Sep 12",
                "07:00-12:00 am",
                "Deposit Booking",
                "Rp. 2.000.000",
                "Successfull"));
        notifTransactionList.add(new NotifTransaction(
                "08 SEP 2020",
                "Prewedding David & Josephine",
                "Sep 9 - Sep 12",
                "07:00-12:00 am",
                "Deposit Booking",
                "Rp. 2.000.000",
                "Successfull"));

        //Setup Recycler View
        notifTransactionAdapter = new NotifTransactionAdapter(context, notifTransactionList);
        rvNotifTransaction.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvNotifTransaction.setAdapter(notifTransactionAdapter);

        return view;

    }
}