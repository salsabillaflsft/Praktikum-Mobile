package com.example.praktikum3;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {

    private ArrayList<String> foto = new ArrayList<>();
    private ArrayList<String> nama = new ArrayList<>();
    private ArrayList<String> detail = new ArrayList<>();
    private ArrayList<String> lirik = new ArrayList<>();
    private Context context;

    public SongAdapter(ArrayList<String> foto, ArrayList<String> nama, ArrayList<String> detail, ArrayList<String> lirik,Context context) {
        this.foto = foto;
        this.nama = nama;
        this.detail = detail;
        this.lirik = lirik;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_song, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(foto.get(position)).into(holder.songArtwork);
        holder.songName.setText(nama.get(position));
        holder.songDetails.setText(detail.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("image", foto.get(position));
                intent.putExtra("name", nama.get(position));
                intent.putExtra("details", detail.get(position));
                intent.putExtra("lyrics", lirik.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return nama.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView songArtwork;
        TextView songName;
        TextView songDetails;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            songArtwork = itemView.findViewById(R.id.song_artwork);
            songName = itemView.findViewById(R.id.song_name);
            songDetails = itemView.findViewById(R.id.song_details);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}