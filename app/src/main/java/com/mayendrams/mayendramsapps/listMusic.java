package com.mayendrams.mayendramsapps;


//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 30-04-2019

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;


/**
 * A simple {@link Fragment} subclass.
 */
public class listMusic extends Fragment {

    ImageView btn_play, btn_pause,btn_lanjut,btn_stop;
    MediaPlayer mPlayer;
    TextView textView;
    private GridLayoutManager lLayout;
    private int durasi;
    private String durasistr;
    public listMusic() {
        // Required empty public constructor
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

            View view=inflater.inflate(R.layout.fragment_list_music, container, false);
            btn_play = (ImageView) view.findViewById(R.id.play);
            btn_pause = (ImageView) view.findViewById(R.id.buttonpause);
            btn_lanjut= (ImageView) view.findViewById(R.id.lanjut);
            btn_stop= (ImageView) view.findViewById(R.id.stop);
            mPlayer = MediaPlayer.create(getContext(),R.raw.lagujepun);

//            mPlayer = MediaPlayer.create(getContext(),R.raw.wshaway);

            stateAwal();
            btn_play.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    play();
                    btn_play.setVisibility(View.GONE);
                    btn_lanjut.setVisibility(View.GONE);
                    btn_pause.setVisibility(View.VISIBLE);

                }
            });
            btn_stop.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    stop();
                    btn_play.setVisibility(View.VISIBLE);
                    btn_lanjut.setVisibility(View.GONE);
                    btn_pause.setVisibility(View.GONE);

                }
            });
            btn_pause.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    pause();
                    btn_play.setVisibility(View.GONE);
                    btn_pause.setVisibility(View.GONE);
                    btn_lanjut.setVisibility(View.VISIBLE);
                }
            });
            btn_lanjut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    pause();
                    btn_play.setVisibility(View.GONE);
                    btn_pause.setVisibility(View.VISIBLE);
                    btn_lanjut.setVisibility(View.GONE);

                }
            });
            btn_stop.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    stop();
                }
            });
            return view;
    }
    public void stateAwal(){
//        btn_play.setEnabled(true);
//        btn_pause.setEnabled(false);
        btn_play.setVisibility(View.VISIBLE);
        btn_pause.setVisibility(View.GONE);
        btn_lanjut.setVisibility(View.GONE);
        //btn_stop.setEnabled(false);
    }
    private void play(){


        mPlayer.getDuration();
        if (mPlayer!=null){
            mPlayer.start();

        }else{
        try {
            mPlayer.prepare();
        }catch (IllegalStateException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        mPlayer.start();
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
            @Override
            public void onCompletion (MediaPlayer mediaPlayer){
                stateAwal();
            }
        });
    }

    }
    public void pause(){
        if (mPlayer.isPlaying()){
            if (mPlayer!=null){
                mPlayer.pause();
            }}else{
                if (mPlayer!=null){
                    mPlayer.start();
                }
            }
    }
    public void stop(){
        mPlayer.stop();
        try {
            mPlayer.prepare();
            mPlayer.seekTo(0);
        }catch (Throwable t){
            t.printStackTrace();
        }
        stateAwal();

    }

}
