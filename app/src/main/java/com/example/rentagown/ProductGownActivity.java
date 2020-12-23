package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.rentagown.Adapter.CategoryMenuAdapter;
import com.example.rentagown.Adapter.CategoryProductAdapter;
import com.example.rentagown.Adapter.ProductAdapter;
import com.example.rentagown.Interface.ItemClickListener;
import com.example.rentagown.Model.CategoryMenu;
import com.example.rentagown.Model.Product;
import com.example.rentagown.Model.SliderMainMenu;

import java.util.ArrayList;
import java.util.List;

public class ProductGownActivity extends AppCompatActivity implements View.OnClickListener, ItemClickListener {

    ImageButton back, filter;
    RecyclerView rvMenuCategory, rvProduct;
    CategoryProductAdapter categoryProductAdapter;
    List<CategoryMenu> categoryMenuList;
    List<Product> productList;
    ProductAdapter productAdapter;

    private CategoryMenu selectedCategoryMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_gown);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        filter = findViewById(R.id.im_filter);
        rvMenuCategory = findViewById(R.id.rv_menu_category_product);
        rvProduct = findViewById(R.id.rv_product);

        //Title Menu
        categoryMenuList = new ArrayList<>();
        categoryMenuList.add(new CategoryMenu(0, "All"));
        categoryMenuList.add(new CategoryMenu(1,"Prewedding"));
        categoryMenuList.add(new CategoryMenu(2,"Wedding"));
        categoryMenuList.add(new CategoryMenu(3,"Family"));
        categoryMenuList.add(new CategoryMenu(4,"Maternity"));

        //Setup Recycler View Title Menu
        categoryProductAdapter = new CategoryProductAdapter(categoryMenuList, this);
        rvMenuCategory.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        rvMenuCategory.setAdapter(categoryProductAdapter);

        //Preselect first category
        selectedCategoryMenu = categoryProductAdapter.getItem(0);

        //Product
        productList = getCategoryProduct(selectedCategoryMenu.getIdCategory());

        //Setup Recycler View Product
        productAdapter = new ProductAdapter(this, productList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvProduct.setLayoutManager(gridLayoutManager);
        rvProduct.setAdapter(productAdapter);

        //SET LISTENER
        back.setOnClickListener(this);
        filter.setOnClickListener(this);


    }

    private List<Product> getCategoryProduct(int categoryId){
        ArrayList<Product> dummyProduct = new ArrayList<>();
        switch (categoryId){
            case 0:
                dummyProduct.add(new Product(0,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummyProduct.add(new Product(0,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummyProduct.add(new Product(0,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummyProduct.add(new Product(0,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                dummyProduct.add(new Product(0,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummyProduct.add(new Product(0,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummyProduct.add(new Product(0,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummyProduct.add(new Product(0,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                dummyProduct.add(new Product(0,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummyProduct.add(new Product(0,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummyProduct.add(new Product(0,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummyProduct.add(new Product(0,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                break;

            case 1:
                dummyProduct.add(new Product(1,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummyProduct.add(new Product(1,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummyProduct.add(new Product(1,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummyProduct.add(new Product(1,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummyProduct.add(new Product(1,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummyProduct.add(new Product(1,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummyProduct.add(new Product(1,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummyProduct.add(new Product(1,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummyProduct.add(new Product(1,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                dummyProduct.add(new Product(1,R.drawable.prewedding_1,"Selina Colourblock Camisole Dress","Rp. 5.000.000"));
                break;

            case 2:
                dummyProduct.add(new Product(2,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummyProduct.add(new Product(2,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummyProduct.add(new Product(2,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummyProduct.add(new Product(2,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummyProduct.add(new Product(2,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummyProduct.add(new Product(2,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummyProduct.add(new Product(2,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummyProduct.add(new Product(2,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummyProduct.add(new Product(2,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                dummyProduct.add(new Product(2,R.drawable.wedding_1,"Pearla Tiered Maxi Dress","Rp. 6.000.000"));
                break;

            case 3:
                dummyProduct.add(new Product(3,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummyProduct.add(new Product(3,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummyProduct.add(new Product(3,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummyProduct.add(new Product(3,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummyProduct.add(new Product(3,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummyProduct.add(new Product(3,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummyProduct.add(new Product(3,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummyProduct.add(new Product(3,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummyProduct.add(new Product(3,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                dummyProduct.add(new Product(3,R.drawable.family_1,"Family of Ceminata Gown","Rp. 10.000.000"));
                break;

            case 4:
                dummyProduct.add(new Product(4,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                dummyProduct.add(new Product(4,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                dummyProduct.add(new Product(4,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                dummyProduct.add(new Product(4,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                dummyProduct.add(new Product(4,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                dummyProduct.add(new Product(4,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                dummyProduct.add(new Product(4,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                dummyProduct.add(new Product(4,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                dummyProduct.add(new Product(4,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                dummyProduct.add(new Product(4,R.drawable.maternity_1,"Blue Ocean elegant maternity gown","Rp. 2.200.000"));
                break;


        }

        return dummyProduct;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.im_back:
                finish();
                break;
            case R.id.im_filter:
                Intent filter = new Intent(ProductGownActivity.this, FilterActivity.class);
                startActivity(filter);
                break;
        }
    }

    @Override
    public void onClick(View view, int position, boolean isLongClick) {
        switch (view.getId()){
            case R.id.category_menu_item_container:
                CategoryMenu cm = categoryProductAdapter.getItem(position);

                productAdapter.replaceItems(getCategoryProduct(cm.getIdCategory()));
                break;
        }
    }
}