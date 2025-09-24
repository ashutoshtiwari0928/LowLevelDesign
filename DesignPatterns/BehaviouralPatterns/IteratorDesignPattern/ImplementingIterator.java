package DesignPatterns.BehaviouralPatterns.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

interface Iterator<T> {
    boolean hasNext();
    T next();
}
interface Iterable<T> {
    Iterator<T> createIterator();
}
class PlayListIterator implements Iterator<String>{
    private final IterablePlaylist playlist;
    private int index = 0;
    public PlayListIterator(IterablePlaylist playlist){
        this.playlist = playlist;
    }

    @Override
    public boolean hasNext() {
        return index<playlist.getSize();
    }

    @Override
    public String next() {
        return playlist.getSongAt(index++);
    }
}
class IterablePlaylist implements Iterable<String>{
    private final List<String> songs = new ArrayList<>();
    public void addSongs(String song){
        songs.add(song);
    }
    public String getSongAt(int index) {
        return songs.get(index);
    }

    public int getSize() {
        return songs.size();
    }
    @Override
    public Iterator<String> createIterator() {
        return new PlayListIterator(this);
    }
}
public class ImplementingIterator {
}
