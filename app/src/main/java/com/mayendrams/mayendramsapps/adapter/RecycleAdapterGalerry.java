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
import android.widget.Toast;

import com.mayendrams.mayendramsapps.R;
import com.mayendrams.mayendramsapps.model.GalerryModel;

import java.util.List;

public class RecycleAdapterGalerry extends  RecyclerView.Adapter<RecycleAdapterGalerry.ViewHolder> {
    private List<GalerryModel>galerryModels;
    private OnCallbackListener listener;
    private Context context;

    public RecycleAdapterGalerry(Context context, List<GalerryModel> galerryModels) {
        this.galerryModels = galerryModels;
        this.context = context;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.main_gallery, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       // GalerryModel galerryModel = galerryModels.get(position);
        holder.textViewNama.setText(galerryModels.get(position).getNamaPhoto());
        holder.textViewaImage.setImageResource(galerryModels.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return  galerryModels.size();
    }

    public void setOnCallbackListener(OnCallbackListener listener) {
        this.listener = listener;
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textViewNama;
        ImageView textViewaImage;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            textViewNama = itemView.findViewById(R.id.txt);
            textViewaImage = itemView.findViewById(R.id.img);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
        }
    }

    public interface OnCallbackListener {

        void onClick(GalerryModel user);
    }
}
