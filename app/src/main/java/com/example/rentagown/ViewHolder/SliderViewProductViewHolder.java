package com.example.rentagown.ViewHolder;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;

import com.example.rentagown.R;
import com.makeramen.roundedimageview.RoundedImageView;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderViewProductViewHolder extends SliderViewAdapter.ViewHolder {

    public ImageView imageSlider;

    public SliderViewProductViewHolder(View itemView) {
        super(itemView);

        imageSlider = itemView.findViewById(R.id.img_product);
    }
}
