package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.rentagown.Adapter.WishlistAdapter;
import com.example.rentagown.Model.Wishlist;

import java.util.ArrayList;
import java.util.List;

public class WishlistActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton back;
    RecyclerView rvWishlist;
    LinearLayout layoutEmpty;
    List<Wishlist> wishlistList;
    WishlistAdapter wishlistAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        rvWishlist = findViewById(R.id.rv_wishlist);
        layoutEmpty = findViewById(R.id.layout_wishlist_empty);

        //List Product Wishlist
        wishlistList = new ArrayList<>();
        wishlistList.add(new Wishlist(R.drawable.prewedding_1, "Selina Colourblock Camisole Dress", "Rp. 5.000.000"));
        wishlistList.add(new Wishlist(R.drawable.prewedding_1, "Selina Colourblock Camisole Dress", "Rp. 5.000.000"));
        wishlistList.add(new Wishlist(R.drawable.wedding_1, "Trixie Lace Panel Pleated Dress", "Rp. 5.000.000"));
        wishlistList.add(new Wishlist(R.drawable.wedding_1, "Trixie Lace Panel Pleated Dress", "Rp. 5.000.000"));
        wishlistList.add(new Wishlist(R.drawable.family_1, "Family of Ceminata Gown", "Rp. 10.000.000"));
        wishlistList.add(new Wishlist(R.drawable.family_1, "Family of Ceminata Gown", "Rp. 10.000.000"));
        wishlistList.add(new Wishlist(R.drawable.maternity_1, "Blue Ocean elegant maternity gown", "Rp. 2.200.000"));
        wishlistList.add(new Wishlist(R.drawable.maternity_1, "Blue Ocean elegant maternity gown", "Rp. 2.200.000"));
        wishlistList.add(new Wishlist(R.drawable.prewedding_1, "Selina Colourblock Camisole Dress", "Rp. 5.000.000"));
        wishlistList.add(new Wishlist(R.drawable.prewedding_1, "Selina Colourblock Camisole Dress", "Rp. 5.000.000"));

        //Setup Adapter
        wishlistAdapter = new WishlistAdapter(this,wishlistList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvWishlist.setLayoutManager(gridLayoutManager);
        rvWishlist.setAdapter(wishlistAdapter);

        if (wishlistAdapter.getItemCount() > 0) {
            layoutEmpty.setVisibility(View.GONE);
        }

        //SET LISTENER
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.im_back:
                finish();
                break;
        }
    }
}
