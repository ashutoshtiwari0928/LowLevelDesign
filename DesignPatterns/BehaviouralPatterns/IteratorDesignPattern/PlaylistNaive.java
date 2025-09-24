package DesignPatterns.BehaviouralPatterns.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

class Playlist{
    private List<String> songs = new ArrayList<>();
    public void addSongs(String song){
        songs.add(song);
    }
    public List<String> getSongs(){
        return songs;
    }
}

class MusicPlayer{
    public void playAll(Playlist playlist){
        for (String s: playlist.getSongs()){
            System.out.println(s);
        }
    }
}
/*
1. Breaks encapsulation:
 */
public class PlaylistNaive {
}
