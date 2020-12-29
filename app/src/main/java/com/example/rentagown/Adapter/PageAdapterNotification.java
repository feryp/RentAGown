package com.example.rentagown.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.rentagown.Fragment.NotifPromoFragment;
import com.example.rentagown.Fragment.NotifTransactionFragment;
import com.example.rentagown.NotificationActivity;

public class PageAdapterNotification extends FragmentStatePagerAdapter {

    int counttab;

    public PageAdapterNotification(NotificationActivity notificationActivity, FragmentManager fm, int counttab) {
        super(fm);
        this.counttab = counttab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                NotifTransactionFragment notifTransactionFragment = new NotifTransactionFragment();
                return  notifTransactionFragment;
            case 1:
                NotifPromoFragment notifPromoFragment = new NotifPromoFragment();
                return notifPromoFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return counttab;
    }
}
