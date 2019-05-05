package com.mayendrams.mayendramsapps;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 04-05-2019

import com.mayendrams.mayendramsapps.adapter.Adapter_Daily_Activity;


public class Daily extends Fragment {


    public Daily() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_daily, container, false);

        TabLayout tabLayout=(TabLayout)view.findViewById(R.id.tab);
        ViewPager pager=(ViewPager) view.findViewById(R.id.pager);
        Adapter_Daily_Activity utama=new Adapter_Daily_Activity(getFragmentManager());
        pager.setAdapter(utama);

        tabLayout.setupWithViewPager(pager);
        return  view;
    }


}
