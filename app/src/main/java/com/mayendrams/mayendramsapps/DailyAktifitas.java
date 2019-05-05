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

import com.mayendrams.mayendramsapps.adapter.ReclerAdaterDailyAktifitas;
import com.mayendrams.mayendramsapps.model.DailyModel;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DailyAktifitas extends Fragment {
    //variabel konsep MVP
//    private ReclerAdaterDailyAktifitas adapter;
//    private List<DailyModel> dailyModelst = new ArrayList<>();
//    private MainPresenterDaily presenter;
//    private RecyclerView recyclerView;
    private GridLayoutManager lLayout;
    public DailyAktifitas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_daily_aktifitas, container, false);
        //konsep MVP
//        presenter = new ImplPresenterDaily((ViewDaily) getActivity());
//        recyclerView = view.findViewById(R.id.recycler_view);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        adapter = new ReclerAdaterDailyAktifitas(dailyModelst);
//        recyclerView.setAdapter(adapter);
//        presenter.load();
//
        List<DailyModel> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(getContext(), 1);

        RecyclerView rView = (RecyclerView)view.findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        ReclerAdaterDailyAktifitas rcAdapter = new ReclerAdaterDailyAktifitas(getContext(), rowListItem);
        rView.setAdapter(rcAdapter);

        return view;
    }

//    @Override
//    public void onLoad(List<DailyModel> dailyModels) {
//        dailyModelst.clear();
//        dailyModelst.addAll(dailyModels);
//
//        adapter.notifyDataSetChanged();
//    }

//
    private List<DailyModel> getAllItemList(){

        List<DailyModel> allItems = new ArrayList<DailyModel>();

        allItems.add(new DailyModel("09:15","Ke kampus", R.drawable.slide1_img));
        allItems.add(new DailyModel("10:00","Ngoding", R.drawable.slide1_img));
        allItems.add(new DailyModel("13:00","Membeli komponen hardware", R.drawable.slide1_img));
        allItems.add(new DailyModel("05:30","merancang komponen hardware", R.drawable.slide1_img));
        allItems.add(new DailyModel("19:00","Menonton", R.drawable.profile_img));
        allItems.add(new DailyModel("20:00","Mengerjakan tugas", R.drawable.slide1_img));
        allItems.add(new DailyModel("21:30","Ngoding(Belajar android/mengerjain tugas android)", R.drawable.slide1_img));
//
//
//
        return allItems;
    }

}
