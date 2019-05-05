package com.mayendrams.mayendramsapps.presenter;

//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 04-05-2019


import com.mayendrams.mayendramsapps.model.MusicModel;
import com.mayendrams.mayendramsapps.view.MainView;

import java.util.ArrayList;
import java.util.List;

public class implPresenterMusic implements MainPresenter {
    private MainView mainView;
    private List<MusicModel> musicModels=new ArrayList<>();
  public implPresenterMusic(MainView mainView){
      this.mainView=mainView;

  }


    @Override
    public void load() {


    }

    @Override
    public void onLoad() {


    }
}
