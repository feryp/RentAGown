package com.example.rentagown.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.rentagown.Fragment.OverviewFragment;
import com.example.rentagown.Fragment.ReviewFragment;
import com.example.rentagown.ViewProductActivity;

public class PageAdapterDetailProduct extends FragmentStatePagerAdapter {

    int counttab;

    public PageAdapterDetailProduct(ViewProductActivity viewProductActivity, FragmentManager fm, int counttab) {
        super(fm);
        this.counttab = counttab;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                OverviewFragment overviewFragment = new OverviewFragment();
                return  overviewFragment;

            case 1:
                ReviewFragment reviewFragment = new ReviewFragment();
                return reviewFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return counttab;
    }
}
