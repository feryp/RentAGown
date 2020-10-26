package com.example.rentagown.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.rentagown.Fragment.FamilySliderFragment;
import com.example.rentagown.Fragment.MaternitySliderFragment;
import com.example.rentagown.Fragment.PreweddingSliderFragment;
import com.example.rentagown.Fragment.WeddingSliderFragment;

public class PageMainAdapter extends FragmentStatePagerAdapter {

    int countab;

    public PageMainAdapter( FragmentManager fm, int countab) {
        super(fm);
        this.countab = countab;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PreweddingSliderFragment();

            case 1:
                return new WeddingSliderFragment();

            case 2:
                return new FamilySliderFragment();

            case 3:
                return new MaternitySliderFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return countab;
    }
}
