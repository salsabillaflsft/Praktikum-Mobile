package com.example.praktikum3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {

    private Context context;
    private ArrayList<SongModel> songModels;

    public SongAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<SongModel> getSongModels() {
        return songModels;
    }

    public void setSongModels(ArrayList<SongModel> songModels) {
        this.songModels = songModels;
    }

    @NonNull
    @Override
    public SongAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_song,viewGroup,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull SongAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getSongModels().get(i).getSongArtwork()).into(viewHolder.ivSongArtwork);
        viewHolder.tvSongName.setText(getSongModels().get(i).getSongName());

    }

    @Override
    public int getItemCount() {
        return getSongModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivSongArtwork;
        private TextView tvSongName;
        public ViewHolder( @NonNull View itemView){
            super(itemView);
            ivSongArtwork = itemView.findViewById(R.id.song_artwork);
            tvSongName = itemView.findViewById(R.id.song_name);
        }
    }
}
