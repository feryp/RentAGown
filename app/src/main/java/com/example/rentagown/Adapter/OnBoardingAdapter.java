package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.rentagown.Model.ScreenItem;
import com.example.rentagown.R;

import java.util.List;

public class OnBoardingAdapter extends PagerAdapter {

    Context mContext;
    List<ScreenItem> mListScreen;

    public OnBoardingAdapter(Context mContext, List<ScreenItem> mListScreen) {
        this.mContext = mContext;
        this.mListScreen = mListScreen;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = inflater.inflate(R.layout.layout_screen_boading,null);

        ImageView imageSlide = layoutScreen.findViewById(R.id.img_intro);
        TextView title = layoutScreen.findViewById(R.id.tv_intro_title);
        TextView desc = layoutScreen.findViewById(R.id.tv_intro_desc);

        title.setText(mListScreen.get(position).getTittle());
        desc.setText(mListScreen.get(position).getDescription());
        imageSlide.setImageResource(mListScreen.get(position).getScreenImg());

        container.addView(layoutScreen);

        return layoutScreen;

    }

    @Override
    public int getCount() {
        return mListScreen.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);
    }
}
