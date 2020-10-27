package com.example.rentagown.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.rentagown.Fragment.FamilyBookingFragment;
import com.example.rentagown.Fragment.MaternityBookingFragment;
import com.example.rentagown.Fragment.PreweddingBookingFragment;
import com.example.rentagown.Fragment.WeddingBookingFragment;

public class PageMybookAdapter extends FragmentStatePagerAdapter {

    int countab;

    public PageMybookAdapter(@NonNull FragmentManager fm, int countab) {
        super(fm);
        this.countab = countab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PreweddingBookingFragment();

            case 1:
                return new WeddingBookingFragment();

            case 2:
                return new FamilyBookingFragment();

            case 3:
                return new MaternityBookingFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return countab;
    }
}
