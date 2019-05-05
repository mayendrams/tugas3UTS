package com.mayendrams.mayendramsapps.adapter;

//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 04-05-2019

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.mayendrams.mayendramsapps.DailyAktifitas;
import com.mayendrams.mayendramsapps.FrindList;

public class Adapter_Daily_Activity extends FragmentStatePagerAdapter {
    String[] arra=new String[]{"Daily Activity","Friends List"};
    int number=2;
    public Adapter_Daily_Activity(FragmentManager fm) {
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
                DailyAktifitas dailyAkrifitas =new DailyAktifitas();
                return dailyAkrifitas ;
            case 1:
                FrindList frindList=new FrindList();
                return frindList;
        }
        return null;
    }

    @Override
    public int getCount() {


        return number;


    }
}
