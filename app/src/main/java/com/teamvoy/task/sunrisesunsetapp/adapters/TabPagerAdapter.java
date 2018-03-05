package com.teamvoy.task.sunrisesunsetapp.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.teamvoy.task.sunrisesunsetapp.R;
import com.teamvoy.task.sunrisesunsetapp.fragments.PlaceFragment;
import com.teamvoy.task.sunrisesunsetapp.fragments.ResponseFragment;


public class TabPagerAdapter extends FragmentPagerAdapter {
    private static final int TAB_COUNT = 2;
    private Context mContext;

    public TabPagerAdapter(FragmentManager fm,Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PlaceFragment();
            default:
                return new ResponseFragment();
        }

    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.place_detail);
            default:
                return mContext.getString(R.string.response_info);
        }
    }
}
