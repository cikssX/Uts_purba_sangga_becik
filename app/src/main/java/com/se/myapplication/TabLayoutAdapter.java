package com.se.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabLayoutAdapter extends FragmentStatePagerAdapter{
    int mNumoftabs;
    public TabLayoutAdapter(FragmentManager fm,int Nooftabs){
        super(fm);
        this.mNumoftabs=Nooftabs;
    }


    @Override
    public int getCount() {
        return mNumoftabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case  0:
                Page1Fragment page1Fragment=new Page1Fragment();
                return page1Fragment;
            case 1:
                Page2Fragment page2Fragment=new Page2Fragment();
                return page2Fragment;
            case 2:
                Page3Fragment page3Fragment=new Page3Fragment();
                return page3Fragment;
            default:
                return null;
        }

    }

}
