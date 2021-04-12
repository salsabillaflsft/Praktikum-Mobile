package com.example.praktikum3;

import java.util.ArrayList;

public class SongData {
    private static String[] title = new String[] {"Last Time","All She Wrote"};
    private static int[] thumbnail = new int[] {R.drawable.song1, R.drawable.song2};

    public static ArrayList<SongModel> getListData(){
        SongModel songModel = null;
        ArrayList<SongModel> list = new ArrayList<>();
        for (int i=0; i < title.length; i++){
            songModel = new SongModel();
            songModel.setSongArtwork(thumbnail[i]);
            songModel.setSongName(title[i]);
            list.add(songModel);
        }
        return list;
    }
}
