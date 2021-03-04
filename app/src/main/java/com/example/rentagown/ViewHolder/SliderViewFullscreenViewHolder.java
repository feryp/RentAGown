package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.ImageView;

import com.example.rentagown.R;
import com.github.chrisbanes.photoview.PhotoView;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderViewFullscreenViewHolder extends SliderViewAdapter.ViewHolder {

    public PhotoView imageSlider;

    public SliderViewFullscreenViewHolder(View itemView) {
        super(itemView);

        imageSlider = itemView.findViewById(R.id.full_img);
    }
}
