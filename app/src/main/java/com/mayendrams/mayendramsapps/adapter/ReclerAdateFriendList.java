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
import com.mayendrams.mayendramsapps.model.FriendlistModel;

import java.util.List;

public class ReclerAdateFriendList extends RecyclerView.Adapter<ReclerAdateFriendList.ViewHolder>  {


    private List<FriendlistModel>friendlistModels;
    private OnCallbackListener listener;
    private Context context;

    public ReclerAdateFriendList(Context context, List<FriendlistModel> friendlistModels) {
        this.friendlistModels = friendlistModels;
        this.context = this.context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.friends_lis_horizontal,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //DailyModel dailyModel =dailyModels.get(position);
    holder.nama.setText(friendlistModels.get(position).getNama());
    holder.photo.setImageResource(friendlistModels.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return friendlistModels.size();
    }

    public void setOnCallbackListener(OnCallbackListener listener) {
        this.listener = listener;
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView nama;

        ImageView photo;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            nama = itemView.findViewById(R.id.nama);

            photo = itemView.findViewById(R.id.photo);
        }

        @Override
        public void onClick(View v) {
            if (listener != null) {
                listener.onClick(friendlistModels.get(getAdapterPosition()));
            }
        }
    }

    public interface OnCallbackListener {

        void onClick(FriendlistModel user);
    }
}
