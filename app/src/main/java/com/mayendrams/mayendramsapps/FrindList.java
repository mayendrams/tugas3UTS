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

import com.mayendrams.mayendramsapps.adapter.ReclerAdateFriendList;
import com.mayendrams.mayendramsapps.model.FriendlistModel;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FrindList extends Fragment {

    private GridLayoutManager lLayout;

    public FrindList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_friend_list, container, false);
        List<FriendlistModel> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(getContext(), 1, GridLayoutManager.HORIZONTAL,false);

        RecyclerView rView = (RecyclerView) view.findViewById(R.id.recyclerview_friend);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        ReclerAdateFriendList rcAdapter = new ReclerAdateFriendList(getContext(), rowListItem);
        rView.setAdapter(rcAdapter);
        return view;
   }

    private List<FriendlistModel> getAllItemList() {

        List<FriendlistModel> allItems = new ArrayList<FriendlistModel>();

        allItems.add(new FriendlistModel("test1", R.drawable.profile_img));
        allItems.add(new FriendlistModel("test2", R.drawable.slide1_img));
        allItems.add(new FriendlistModel("test3", R.drawable.ic_header));


        return allItems;

    }
}
