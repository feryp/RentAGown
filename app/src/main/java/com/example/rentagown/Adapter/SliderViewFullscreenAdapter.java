package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentagown.Model.SliderItemProduct;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.SliderViewFullscreenViewHolder;
import com.example.rentagown.ViewHolder.SliderViewProductViewHolder;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class SliderViewFullscreenAdapter extends SliderViewAdapter<SliderViewFullscreenViewHolder> {

    private Context context;
    private List<SliderItemProduct> mSliderItems;

    public SliderViewFullscreenAdapter(Context context, List<SliderItemProduct> mSliderItems) {
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
    public SliderViewFullscreenViewHolder onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_image_slider_fullscreen, null);
        return new SliderViewFullscreenViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(SliderViewFullscreenViewHolder viewHolder, int position) {
        viewHolder.imageSlider.setImageResource(mSliderItems.get(position).getImageProduct());
    }

    @Override
    public int getCount() {
        return mSliderItems.size();
    }
}
