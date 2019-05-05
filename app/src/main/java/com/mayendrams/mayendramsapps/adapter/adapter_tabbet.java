package com.mayendrams.mayendramsapps.adapter;

//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 04-05-2019

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.mayendrams.mayendramsapps.listMusic;
import com.mayendrams.mayendramsapps.listvideo;

public class adapter_tabbet extends FragmentStatePagerAdapter {
    String[] arra=new String[]{"Music","Video"};
    int number=2;
    public adapter_tabbet(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return arra[position];
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                listMusic listmusic =new listMusic();
                return listmusic;
            case 1:

                listvideo listvideo=new listvideo();
                return listvideo;
        }
        return null;
    }

    @Override
    public int getCount() {
        return number;
    }
}
