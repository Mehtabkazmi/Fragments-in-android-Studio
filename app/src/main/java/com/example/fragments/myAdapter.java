package com.example.fragments;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class myAdapter extends FragmentPagerAdapter{

    private Context myContext;
    int totalTabs;

    public myAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }
    public Fragment getItem(int position){
        switch (position){
            case 0:
                homeFragment homeFragment=new homeFragment();
                return homeFragment;
            case 1:
                movieFragment movieFragment=new movieFragment();
                return movieFragment;
            case 2:
                sportFragment sportFragment=new sportFragment();
                return sportFragment;
            default:
                return null;

        }
    }
    public int getCount(){return totalTabs;}
}
