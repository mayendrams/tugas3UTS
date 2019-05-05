package com.mayendrams.mayendramsapps;

//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 30-04-2019

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;


public class listvideo extends Fragment {
    VideoView videoView;
    MediaController media_Controller;
    DisplayMetrics dm;

    VideoView videoViewSaya;
    TextView txtJudul;
    Button btnmulai;

    public listvideo() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_listvideo, container, false);
        // view
        videoViewSaya = (VideoView) view.findViewById(R.id.videoViewUtama);
        btnmulai= (Button) view.findViewById(R.id.mulai);
        btnmulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mulai();
            }
        });


        return view;

    }


public void mulai(){

    videoViewSaya.setVideoURI(Uri.parse("android.resource://com.mayendrams.mayendramsapps/"+R.raw.video1));
    videoViewSaya.setMediaController(new MediaController(getContext()));
    videoViewSaya.start();
}


    }

