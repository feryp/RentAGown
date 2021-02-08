package com.example.rentagown.Fragment;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.rentagown.Adapter.CategoryMenuAdapter;
import com.example.rentagown.Adapter.SliderFavoriteGownAdapter;
import com.example.rentagown.Adapter.SliderMainMenuAdapter;
import com.example.rentagown.Adapter.SliderNewGownAdapter;
import com.example.rentagown.Adapter.SliderPromoAdapter;
import com.example.rentagown.FavoriteGownActivity;
import com.example.rentagown.ItemDecorationSlider;
import com.example.rentagown.Interface.ItemClickListener;
import com.example.rentagown.NewGownActivity;
import com.example.rentagown.PromoActivity;
import com.example.rentagown.Model.CategoryMenu;
import com.example.rentagown.Model.FavoriteGown;
import com.example.rentagown.Model.NewGown;
import com.example.rentagown.Model.Promo;
import com.example.rentagown.Model.SliderMainMenu;
import com.example.rentagown.NotificationActivity;
import com.example.rentagown.ProductGownActivity;
import com.example.rentagown.R;
import com.example.rentagown.SearchViewActivity;
import com.example.rentagown.WishlistActivity;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment implements View.OnClickListener, ItemClickListener {

    Context context;
    ImageButton imWishlist;
    ImageView imNotification;
    ImageView layoutPromoEmpty;
    SearchView searchView;
    ConstraintLayout layoutPromo;
    Button btnSeeAllCategory, btnSeeAllPromo, btnSeeAllFavoriteGown, btnSeeAllNewGown;
    RecyclerView rvTitleMenu, rvSliderMenu, rvSliderPromo, rvSliderFavoriteGown, rvSliderNewGown;
    CategoryMenuAdapter adapterMenu;
    SliderMainMenuAdapter adapterMainMenu;
    SliderPromoAdapter adapterPromo;
    SliderFavoriteGownAdapter adapterFavoriteGown;
    SliderNewGownAdapter adapterNewGown;
    List<CategoryMenu> categoryMenuList;
    List<SliderMainMenu> sliderMainMenuList;
    List<Promo> promoList;
    List<FavoriteGown> favoriteGownList;
    List<NewGown> newGownList;

    private CategoryMenu selectedCategoryMenu;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_home, container, false);

        //INIT VIEW
        imWishlist = view.findViewById(R.id.im_wishlist);
        imNotification = view.findViewById(R.id.im_notification);
        searchView = view.findViewById(R.id.search_view);
        layoutPromoEmpty = view.findViewById(R.id.layout_promo_empty);
        layoutPromo = view.findViewById(R.id.layout_promo);
        btnSeeAllCategory = view.findViewById(R.id.btn_see_all_category);
        btnSeeAllPromo = view.findViewById(R.id.btn_see_all_promo);
        btnSeeAllFavoriteGown = view.findViewById(R.id.btn_see_all_favorite);
        btnSeeAllNewGown = view.findViewById(R.id.btn_see_all_new);
        rvTitleMenu = view.findViewById(R.id.rv_title_menu);
        rvSliderMenu = view.findViewById(R.id.rv_slider_main_menu);
        rvSliderPromo = view.findViewById(R.id.rv_slider_promo);
        rvSliderFavoriteGown = view.findViewById(R.id.rv_slider_favorite_gown);
        rvSliderNewGown = view.findViewById(R.id.rv_slider_new_gown);


        //Title Menu
        categoryMenuList = new ArrayList<>();
        categoryMenuList.add(new CategoryMenu(1,"Prewedding"));
        categoryMenuList.add(new CategoryMenu(2,"Wedding"));
        categoryMenuList.add(new CategoryMenu(3,"Family"));
        categoryMenuList.add(new CategoryMenu(4,"Maternity"));

        //Setup Recycler View Title Menu
        adapterMenu = new CategoryMenuAdapter(categoryMenuList, this);
        rvTitleMenu.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        rvTitleMenu.setAdapter(adapterMenu);
        rvTitleMenu.addItemDecoration(new ItemDecorationSlider(16));
        adapterMenu.selectCategory(0);

        // preselect first category
        selectedCategoryMenu = adapterMenu.getItem(0);


        //Slider Main Menu
        sliderMainMenuList = getSliderMainMenuByCategory(selectedCategoryMenu.getIdCategory());

        //Setup Recycler View Slider Main Menu
        adapterMainMenu = new SliderMainMenuAdapter(context, sliderMainMenuList);
        rvSliderMenu.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false));
        rvSliderMenu.setAdapter(adapterMainMenu);
        rvSliderMenu.addItemDecoration(new ItemDecorationSlider(16));

        //Slider Promo
        promoList = new ArrayList<>();
        promoList.add(new Promo(
                R.drawable.promo,
                "Promo",
                "The wait is over Massive sale! 90% off for third purchase on any dress (except wedding dress), " +
                "Booking period until 15 September 2020. Rental period until December 2021."));
        promoList.add(new Promo(
                R.drawable.promo,
                "Promo",
                "The wait is over Massive sale! 90% off for third purchase on any dress (except wedding dress), " +
                        "Booking period until 15 September 2020. Rental period until December 2021."));
        promoList.add(new Promo(
                R.drawable.promo,
                "Promo",
                "The wait is over Massive sale! 90% off for third purchase on any dress (except wedding dress), " +
                        "Booking period until 15 September 2020. Rental period until December 2021."));
        promoList.add(new Promo(
                R.drawable.promo,
                "Promo",
                "The wait is over Massive sale! 90% off for third purchase on any dress (except wedding dress), " +
                        "Booking period until 15 September 2020. Rental period until December 2021."));
        promoList.add(new Promo(
                R.drawable.promo,
                "Promo",
                "The wait is over Massive sale! 90% off for third purchase on any dress (except wedding dress), " +
                        "Booking period until 15 September 2020. Rental period until December 2021."));
        promoList.add(new Promo(
                R.drawable.promo,
                "Promo",
                "The wait is over Massive sale! 90% off for third purchase on any dress (except wedding dress), " +
                        "Booking period until 15 September 2020. Rental period until December 2021."));

        //Setup Recycler View Promo
        adapterPromo = new SliderPromoAdapter(context, promoList);
        rvSliderPromo.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false));
        rvSliderPromo.setAdapter(adapterPromo);
        rvSliderPromo.addItemDecoration(new ItemDecorationSlider(16));

        if (adapterPromo.getItemCount() > 0){
            layoutPromoEmpty.setVisibility(View.GONE);
            layoutPromo.setVisibility(View.VISIBLE);
        }


        //Slider Favorite Gown
        favoriteGownList = new ArrayList<>();
        favoriteGownList.add(new FavoriteGown(R.drawable.product_favourite,"Dahlia Cascade Layered Jumpsuit","Rp. 12.000.000"));
        favoriteGownList.add(new FavoriteGown(R.drawable.product_favourite,"Dahlia Cascade Layered Jumpsuit","Rp. 12.000.000"));
        favoriteGownList.add(new FavoriteGown(R.drawable.product_favourite,"Dahlia Cascade Layered Jumpsuit","Rp. 12.000.000"));
        favoriteGownList.add(new FavoriteGown(R.drawable.product_favourite,"Dahlia Cascade Layered Jumpsuit","Rp. 12.000.000"));
        favoriteGownList.add(new FavoriteGown(R.drawable.product_favourite,"Dahlia Cascade Layered Jumpsuit","Rp. 12.000.000"));
        favoriteGownList.add(new FavoriteGown(R.drawable.product_favourite,"Dahlia Cascade Layered Jumpsuit","Rp. 12.000.000"));

        //Setup Recycler View Favorite Gown
        adapterFavoriteGown = new SliderFavoriteGownAdapter(context, favoriteGownList);
        rvSliderFavoriteGown.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        rvSliderFavoriteGown.setAdapter(adapterFavoriteGown);
        rvSliderFavoriteGown.addItemDecoration(new ItemDecorationSlider(16));

        //Slider New Gown
        newGownList = new ArrayList<>();
        newGownList.add(new NewGown(R.drawable.new_product,"Nude Embellishment Mermaid Gown","Rp. 4.000.000"));
        newGownList.add(new NewGown(R.drawable.new_product,"Nude Embellishment Mermaid Gown","Rp. 4.000.000"));
        newGownList.add(new NewGown(R.drawable.new_product,"Nude Embellishment Mermaid Gown","Rp. 4.000.000"));
        newGownList.add(new NewGown(R.drawable.new_product,"Nude Embellishment Mermaid Gown","Rp. 4.000.000"));
        newGownList.add(new NewGown(R.drawable.new_product,"Nude Embellishment Mermaid Gown","Rp. 4.000.000"));
        newGownList.add(new NewGown(R.drawable.new_product,"Nude Embellishment Mermaid Gown","Rp. 4.000.000"));

        //Setup Recycler View New Gown
        adapterNewGown = new SliderNewGownAdapter(context, newGownList);
        rvSliderNewGown.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false));
        rvSliderNewGown.setAdapter(adapterNewGown);
        rvSliderNewGown.addItemDecoration(new ItemDecorationSlider(16));

        imWishlist.setOnClickListener(HomeFragment.this);
        imNotification.setOnClickListener(HomeFragment.this);
        btnSeeAllCategory.setOnClickListener(HomeFragment.this);
        btnSeeAllPromo.setOnClickListener(HomeFragment.this);
        btnSeeAllFavoriteGown.setOnClickListener(HomeFragment.this);
        btnSeeAllNewGown.setOnClickListener(HomeFragment.this);
        searchView.setOnClickListener(HomeFragment.this);


        return view;

    }


    private List<SliderMainMenu> getSliderMainMenuByCategory(int categoryId) {
        ArrayList<SliderMainMenu> dummySliderMainMenus = new ArrayList<>();
        switch (categoryId) {
            case 1:
                dummySliderMainMenus.add(new SliderMainMenu(1,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummySliderMainMenus.add(new SliderMainMenu(1,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummySliderMainMenus.add(new SliderMainMenu(1,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummySliderMainMenus.add(new SliderMainMenu(1,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummySliderMainMenus.add(new SliderMainMenu(1,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummySliderMainMenus.add(new SliderMainMenu(1,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
            break;

            case 2:
                dummySliderMainMenus.add(new SliderMainMenu(2,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummySliderMainMenus.add(new SliderMainMenu(2,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummySliderMainMenus.add(new SliderMainMenu(2,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummySliderMainMenus.add(new SliderMainMenu(2,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummySliderMainMenus.add(new SliderMainMenu(2,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummySliderMainMenus.add(new SliderMainMenu(2,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
            break;

            case 3:
                dummySliderMainMenus.add(new SliderMainMenu(3,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummySliderMainMenus.add(new SliderMainMenu(3,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummySliderMainMenus.add(new SliderMainMenu(3,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummySliderMainMenus.add(new SliderMainMenu(3,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummySliderMainMenus.add(new SliderMainMenu(3,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummySliderMainMenus.add(new SliderMainMenu(3,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
            break;

            case 4:
                dummySliderMainMenus.add(new SliderMainMenu(4,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                dummySliderMainMenus.add(new SliderMainMenu(4,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                dummySliderMainMenus.add(new SliderMainMenu(4,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                dummySliderMainMenus.add(new SliderMainMenu(4,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                dummySliderMainMenus.add(new SliderMainMenu(4,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                dummySliderMainMenus.add(new SliderMainMenu(4,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));

            break;
        }

        return dummySliderMainMenus;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.search_view:
                Intent search = new Intent(getActivity(), SearchViewActivity.class);
                if (Intent.ACTION_SEARCH.equals(search.getAction())){
                    String query = search.getStringExtra(SearchManager.QUERY);
                }
                startActivity(search);
                break;

            case R.id.im_wishlist:
                Intent wishlist = new Intent(getActivity(), WishlistActivity.class);
                startActivity(wishlist);
                break;

            case R.id.im_notification:
                Intent notification = new Intent(getActivity(), NotificationActivity.class);
                startActivity(notification);
                break;

            case R.id.btn_see_all_category:
                Intent categoryProduct = new Intent(getActivity(), ProductGownActivity.class);
                startActivity(categoryProduct);
                break;

            case R.id.btn_see_all_promo:
                Intent promoList = new Intent(getActivity(), PromoActivity.class);
                startActivity(promoList);
                break;

            case R.id.btn_see_all_favorite:
                Intent favoriteGown = new Intent(getActivity(), FavoriteGownActivity.class);
                startActivity(favoriteGown);
                break;

            case R.id.btn_see_all_new:
                Intent newGown = new Intent(getActivity(), NewGownActivity.class);
                startActivity(newGown);
                break;
        }
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view, int position, boolean isLongClick) {
        switch (view.getId()) {
            case  R.id.category_menu_item_container:
                CategoryMenu cm = adapterMenu.getItem(position);
                adapterMainMenu.replaceItems(getSliderMainMenuByCategory(cm.getIdCategory()));
                break;

        }
    }

}
