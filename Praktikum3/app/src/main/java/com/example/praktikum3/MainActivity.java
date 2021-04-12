package com.example.praktikum3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvSong;
    private ArrayList<SongModel> listSong = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSong = findViewById(R.id.rv_song_list);
        rvSong.setHasFixedSize(true);
        listSong.addAll(SongData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList(){
        rvSong.setLayoutManager(new LinearLayoutManager(this));
        SongAdapter songAdapter = new SongAdapter(this);
        songAdapter.setSongModels(listSong);
        rvSong.setAdapter(songAdapter);
    }
}