package com.mayendrams.mayendramsapps;


//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 04-05-2019

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mayendrams.mayendramsapps.adapter.adapter_tabbet;


/**
 * A simple {@link Fragment} subclass.
 */
public class Music extends Fragment {


    public Music() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_music, container, false);

        TabLayout tabLayout=(TabLayout)view.findViewById(R.id.tabs2);
        ViewPager pager=(ViewPager) view.findViewById(R.id.viepagere);
        adapter_tabbet utama=new adapter_tabbet(getFragmentManager());
        pager.setAdapter(utama);

        tabLayout.setupWithViewPager(pager);

        return view;
    }


}
