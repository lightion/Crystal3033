package com.lightion.crystal303.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lightion.crystal303.R;
import com.lightion.crystal303.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;
    HomeFragment homeFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        homeFragment = (HomeFragment) fm.findFragmentById(R.id.container_main);
        if(homeFragment==null){
            homeFragment= new HomeFragment();
            fm.beginTransaction()
                    .add(R.id.container_main, homeFragment)
                    .commit();
        }
    }
}
