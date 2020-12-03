package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.rentagown.Adapter.ChangeAddressAdapter;
import com.example.rentagown.Model.ChangeAddress;

import java.util.ArrayList;
import java.util.List;

public class ChangeAddressActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView rvListAddress;
    ImageButton back;
    List<ChangeAddress> changeAddressList;
    ChangeAddressAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_address);

        //INIT VIEW
        rvListAddress = findViewById(R.id.rv_list_address);
        back = findViewById(R.id.im_back);

        //List Address
        changeAddressList = new ArrayList<>();
        changeAddressList.add(new ChangeAddress(
                "Rumah",
                "John Doe",
                "6287871180436",
                "Perum. Visenda, Jl. K.H. Hasyim, Kec. Kembangan, Kota Jakarta Barat, DKI Jakarta"));

        changeAddressList.add(new ChangeAddress(
                "Kantor",
                "John Doe",
                "6287871180436",
                "Gedung Indovision, Jln Martidilaga No. 1, Grogol, Jakarta Barat"));

        changeAddressList.add(new ChangeAddress(
                "Rumah",
                "John Doe",
                "6287871180436",
                "Perum. Visenda, Jl. K.H. Hasyim, Kec. Kembangan, Kota Jakarta Barat, DKI Jakarta."));

        //Setup Adapter
        adapter = new ChangeAddressAdapter(changeAddressList, this);
        rvListAddress.setLayoutManager(new LinearLayoutManager(this));
        rvListAddress.setAdapter(adapter);


        //SET LISTENER
        back.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_back:
                finish();
                break;

        }
    }
}
