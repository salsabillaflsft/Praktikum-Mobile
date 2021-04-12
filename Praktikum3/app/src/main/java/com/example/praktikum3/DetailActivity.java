package com.example.praktikum3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    
    TextView songName, songDetails, songLyrics;
    ImageView songArtwork;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        songArtwork = findViewById(R.id.song_artwork);
        songName = findViewById(R.id.song_name);
        songDetails = findViewById(R.id.song_details);
        songLyrics = findViewById(R.id.song_lyrics);

        getIncomingExtra();
    }

    private void getIncomingExtra(){

        if (getIntent().hasExtra("image")&& getIntent().hasExtra("name") && getIntent().hasExtra("details") && getIntent().hasExtra("lyrics")){
            String imgSong = getIntent().getStringExtra("image");
            String nameSong = getIntent().getStringExtra("name");
            String detailsSong = getIntent().getStringExtra("details");
            String lyricsSong = getIntent().getStringExtra("lyrics");

            setDataActivity(imgSong, nameSong, detailsSong, lyricsSong);
        }
    }

    private void setDataActivity(String imgSong, String nameSong, String detailsSong, String lyricsSong){

        Glide.with(this).asBitmap().load(imgSong).into(songArtwork);
        songName.setText(nameSong);
        songDetails.setText(detailsSong);
        songLyrics.setText(lyricsSong);
    }
}