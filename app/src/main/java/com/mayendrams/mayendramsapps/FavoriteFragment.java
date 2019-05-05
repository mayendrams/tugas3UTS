package com.mayendrams.mayendramsapps;

//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 30-04-2019

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mayendrams.mayendramsapps.adapter.adapter_tabbet;

public class FavoriteFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);
        TabLayout tabLayout=(TabLayout)view.findViewById(R.id.tabs2);
        ViewPager pager=(ViewPager) view.findViewById(R.id.viepagere);
        adapter_tabbet utama=new adapter_tabbet(getFragmentManager());
        pager.setAdapter(utama);

        tabLayout.setupWithViewPager(pager);
        return view;
    }
}