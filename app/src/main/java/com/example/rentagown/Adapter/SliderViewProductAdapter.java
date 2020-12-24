package com.example.rentagown.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.rentagown.Model.SliderItemProduct;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.SliderViewProductViewHolder;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class SliderViewProductAdapter extends SliderViewAdapter<SliderViewProductViewHolder> {

    private Context context;
    private List<SliderItemProduct> mSliderItems;

    public SliderViewProductAdapter(Context context, List<SliderItemProduct> mSliderItems) {
        this.context = context;
        this.mSliderItems = mSliderItems;
    }


    public void renewItems(List<SliderItemProduct> sliderItems) {
        this.mSliderItems = sliderItems;
        notifyDataSetChanged();
    }

    public void deleteItem(int position) {
        this.mSliderItems.remove(position);
        notifyDataSetChanged();
    }

    public void addItem(SliderItemProduct sliderItem) {
        this.mSliderItems.add(sliderItem);
        notifyDataSetChanged();
    }



    @Override
    public SliderViewProductViewHolder onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_image_slider_product, null);
        return new SliderViewProductViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(SliderViewProductViewHolder viewHolder, int position) {
//        SliderItemProduct sliderItemProduct = mSliderItems.get(position);

        viewHolder.imageSlider.setImageResource(mSliderItems.get(position).getImageProduct());

//        Glide.with(viewHolder.itemView)
//                .load(sliderItemProduct.getImageProduct())
//                .fitCenter()
//                .into(viewHolder.imageSlider);


    }


    @Override
    public int getCount() {
        return mSliderItems.size();
    }

}
