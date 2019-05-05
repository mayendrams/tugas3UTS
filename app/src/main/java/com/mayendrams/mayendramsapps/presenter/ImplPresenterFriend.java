package com.mayendrams.mayendramsapps.presenter;

//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 04-05-2019

import com.mayendrams.mayendramsapps.model.FriendlistModel;
import com.mayendrams.mayendramsapps.view.ViewFriend;

import java.util.ArrayList;
import java.util.List;

public class ImplPresenterFriend implements MainPresenterDaily {
    private ViewFriend viewFriend;
    private List<FriendlistModel>friendlistModels=new ArrayList<>();

    public ImplPresenterFriend(ViewFriend viewFriend) {
        this.viewFriend = viewFriend;
        sedData();
    }

    private void sedData(){




    }

    @Override
    public void load() {
        viewFriend.onLoad(friendlistModels);
    }
}

