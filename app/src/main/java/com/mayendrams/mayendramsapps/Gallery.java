package com.mayendrams.mayendramsapps;

//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 04-05-2019

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mayendrams.mayendramsapps.adapter.RecycleAdapterGalerry;
import com.mayendrams.mayendramsapps.model.GalerryModel;

import java.util.ArrayList;
import java.util.List;


public class Gallery extends Fragment {


    private GridLayoutManager lLayout;



    public Gallery() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_gallery, container, false);
        // Inflate the layout for this fragment
        List<GalerryModel> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(getContext(), 2);

//        RecyclerView rView = (RecyclerView)view.findViewById(R.id.recyclerview);
//        rView.setHasFixedSize(true);
//        rView.setLayoutManager(lLayout);
//        rView.setHasFixedSize(true);
//        rView.setLayoutManager(lLayout);
//
//        RecycleAdapterGalerry rcAdapter = new RecycleAdapterGalerry(getContext(), rowListItem);
//        rView.setAdapter(rcAdapter);


       return view;
    }
    private List<GalerryModel> getAllItemList(){

        List<GalerryModel> allItems = new ArrayList<GalerryModel>();

        allItems.add(new GalerryModel("Air terjun", R.drawable.slide1_img));
        allItems.add(new GalerryModel("Mountain", R.drawable.profile_img));
        allItems.add(new GalerryModel("Jack Mack ", R.drawable.profile_img));
        allItems.add(new GalerryModel("Icon", R.drawable.profile_img));
        allItems.add(new GalerryModel("Background hitam", R.drawable.profile_img));
        allItems.add(new GalerryModel("Background biru", R.drawable.profile_img));


        return allItems;
    }


}
