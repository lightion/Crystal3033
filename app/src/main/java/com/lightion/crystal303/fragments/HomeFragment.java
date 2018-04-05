package com.lightion.crystal303.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lightion.crystal303.R;
import com.lightion.crystal303.adapters.HomePagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private HomePagerAdapter pagerAdapter;
    private ViewPager mViewPager;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_home, container, false);
        mViewPager=v.findViewById(R.id.pager);
        mViewPager.setAdapter(pagerAdapter);

        return v;
    }

}
