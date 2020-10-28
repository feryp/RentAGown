package com.example.rentagown.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.rentagown.Adapter.MyBookingAdapter;
import com.example.rentagown.Model.MyBooking;
import com.example.rentagown.R;

import java.util.ArrayList;
import java.util.List;

public class BookFragment extends Fragment {

    RecyclerView rvMyBooking;
    LinearLayout layoutEmpty;
    ArrayList<MyBooking> myBookingList;
    MyBookingAdapter adapter;
    Context context;

    public BookFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_book, container, false);

        //INIT VIEW
        rvMyBooking = view.findViewById(R.id.rv_my_booking);
        layoutEmpty = view.findViewById(R.id.layout_booking_empty);


        //List My Booking
        myBookingList = new ArrayList<>();
        myBookingList.add(new MyBooking(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "On-Progress",
                "08 Sep 2020",
                "09 September 2020",
                "Rp. 5.000.000",
                "Rp. 2.000.000",
                "Rp. 3.000.000"));

        myBookingList.add(new MyBooking(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "On-Progress",
                "08 Sep 2020",
                "09 September 2020",
                "Rp. 5.000.000",
                "Rp. 2.000.000",
                "Rp. 3.000.000"));

        myBookingList.add(new MyBooking(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "On-Progress",
                "08 Sep 2020",
                "09 September 2020",
                "Rp. 5.000.000",
                "Rp. 2.000.000",
                "Rp. 3.000.000"));

        myBookingList.add(new MyBooking(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "On-Progress",
                "08 Sep 2020",
                "09 September 2020",
                "Rp. 5.000.000",
                "Rp. 2.000.000",
                "Rp. 3.000.000"));

        myBookingList.add(new MyBooking(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "On-Progress",
                "08 Sep 2020",
                "09 September 2020",
                "Rp. 5.000.000",
                "Rp. 2.000.000",
                "Rp. 3.000.000"));

        myBookingList.add(new MyBooking(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "On-Progress",
                "08 Sep 2020",
                "09 September 2020",
                "Rp. 5.000.000",
                "Rp. 2.000.000",
                "Rp. 3.000.000"));

        myBookingList.add(new MyBooking(
                R.drawable.prewedding_1,
                "Selina Colourblock Camisole Dress",
                "On-Progress",
                "08 Sep 2020",
                "09 September 2020",
                "Rp. 5.000.000",
                "Rp. 2.000.000",
                "Rp. 3.000.000"));

        //Setup Recycler View
        adapter = new MyBookingAdapter(myBookingList, context);
        rvMyBooking.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvMyBooking.setAdapter(adapter);

        if (adapter.getItemCount() > 0) {
            layoutEmpty.setVisibility(View.GONE);
        }

        return view;
    }
}
