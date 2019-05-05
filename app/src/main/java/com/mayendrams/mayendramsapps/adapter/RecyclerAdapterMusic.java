package com.mayendrams.mayendramsapps.adapter;

//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 04-05-2019

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mayendrams.mayendramsapps.R;
import com.mayendrams.mayendramsapps.model.GalerryModel;
import com.mayendrams.mayendramsapps.model.MusicModel;

import java.util.List;

public class RecyclerAdapterMusic extends RecyclerView.Adapter<RecyclerAdapterMusic.ViewHolder>{
    private List<MusicModel>musicModels;
    private Context context;
    private RecycleAdapterGalerry.OnCallbackListener listener;

    public RecyclerAdapterMusic(List<MusicModel> musicModels, Context context) {
        this.musicModels = musicModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_music, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        // GalerryModel galerryModel = galerryModels.get(position);
        viewHolder.judul.setText(musicModels.get(position).getNamamusik());
        viewHolder.play.setImageResource(musicModels.get(position).getPlay());
        viewHolder.stop.setImageResource(musicModels.get(position).getStop());
        viewHolder.pause.setImageResource(musicModels.get(position).getPause());
        viewHolder.lanjut.setImageResource(musicModels.get(position).getLanjut());

    }



    @Override
    public int getItemCount() {
        return  musicModels.size();
    }

    public void setOnCallbackListener(RecycleAdapterGalerry.OnCallbackListener listener) {
        this.listener = listener;
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView judul;
        ImageView play;
        ImageView stop;
        ImageView pause;
        ImageView lanjut;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            judul = itemView.findViewById(R.id.judulmusik);
            play = itemView.findViewById(R.id.play);
            stop = itemView.findViewById(R.id.stop);
            pause = itemView.findViewById(R.id.buttonpause);
            lanjut = itemView.findViewById(R.id.lanjut);
        }

        @Override
        public void onClick(View v) {
        }
    }

    public interface OnCallbackListener {

        void onClick(GalerryModel user);
    }
}
