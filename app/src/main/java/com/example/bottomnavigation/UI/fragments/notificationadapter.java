package com.example.bottomnavigation.UI.fragments;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class notificationadapter extends FragmentPagerAdapter {
private final List<Fragment> lstfragment=new ArrayList<>();
    private final List<String> lsttitles=new ArrayList<>();
    @Override
    public Fragment getItem(int position) {
        return lstfragment.get(position);

    }

    @Override
    public int getCount() {
        return lsttitles.size();
    }


        public notificationadapter(FragmentManager fm){
            super(fm);
        }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lsttitles.get(position);
    }
    public void AddFragment(Fragment fragment,String title)
    {
        lstfragment.add(fragment);
        lsttitles.add(title);


    }



}
