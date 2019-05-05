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
import android.widget.TextView;

import com.mayendrams.mayendramsapps.R;
import com.mayendrams.mayendramsapps.model.DailyModel;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ReclerAdaterDailyAktifitas extends RecyclerView.Adapter<ReclerAdaterDailyAktifitas.ViewHolder>  {


    private List<DailyModel> dailyModels;
    private OnCallbackListener listener;
    private Context context;

    public ReclerAdaterDailyAktifitas(Context context, List<DailyModel> dailyModels) {
        this.dailyModels = dailyModels;
        this.context = this.context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_activitas_utama,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //DailyModel dailyModel =dailyModels.get(position);
    holder.pukul.setText(dailyModels.get(position).getPukul());
    holder.deskripsi.setText(dailyModels.get(position).getDeskripsi());
    holder.photo.setImageResource(dailyModels.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return dailyModels.size();
    }

    public void setOnCallbackListener(OnCallbackListener listener) {
        this.listener = listener;
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView pukul;
        TextView deskripsi;
        CircleImageView photo;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            pukul = itemView.findViewById(R.id.tvpukul);
            deskripsi = itemView.findViewById(R.id.deskripsi);
            photo = itemView.findViewById(R.id.photo);
        }

        @Override
        public void onClick(View v) {
            if (listener != null) {
                listener.onClick(dailyModels.get(getAdapterPosition()));
            }
        }
    }

    public interface OnCallbackListener {

        void onClick(DailyModel user);
    }
}
