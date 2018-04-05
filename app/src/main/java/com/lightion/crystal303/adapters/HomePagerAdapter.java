package com.lightion.crystal303.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.lightion.crystal303.fragments.EatChartFragment;
import com.lightion.crystal303.fragments.ShoppingListFragment;

/**
 * Created by prathjain on 4/5/2018.
 */

public class HomePagerAdapter extends FragmentStatePagerAdapter {
    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;

        switch(position){
            case 0:
                fragment=new ShoppingListFragment();
                break;
            case 1:
                fragment=new EatChartFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
