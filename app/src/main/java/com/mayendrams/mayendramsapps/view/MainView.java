package com.mayendrams.mayendramsapps.view;


//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 04-05-2019

import com.mayendrams.mayendramsapps.model.GalerryModel;
import com.mayendrams.mayendramsapps.model.MusicModel;

import java.util.List;

public interface MainView {
    void onLoad(List<GalerryModel> galerryModels);
    void onLoadMusic(List<MusicModel> musicModels);
}
