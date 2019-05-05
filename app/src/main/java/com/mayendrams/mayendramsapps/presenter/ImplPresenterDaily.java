package com.mayendrams.mayendramsapps.presenter;

//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 04-05-2019

import com.mayendrams.mayendramsapps.model.DailyModel;
import com.mayendrams.mayendramsapps.view.ViewDaily;

import java.util.ArrayList;
import java.util.List;

public class ImplPresenterDaily implements MainPresenterDaily {
    private ViewDaily viewDaily;
    private List<DailyModel>dailyModels=new ArrayList<>();

    public ImplPresenterDaily(ViewDaily viewDaily) {
        this.viewDaily = viewDaily;
        sedData();
    }

    private void sedData(){
//    DailyModel dailyModel=new DailyModel();
//    dailyModel.setPukul("05:00");
//    dailyModel.setDeskripsi("bangun tidur");
//    dailyModel.setPhoto(R.drawable.airterjunjpg);
//    dailyModels.add(dailyModel);
//
//    DailyModel dailyModel1=new DailyModel();
//    dailyModel.setPukul("05:00");
//    dailyModel.setDeskripsi("bangun tidur");
//    dailyModel.setPhoto(R.drawable.airterjunjpg);
//    dailyModels.add(dailyModel1);
//
}

    @Override
    public void load() {
        viewDaily.onLoad(dailyModels);
    }
}

