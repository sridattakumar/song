// Write your code here
package com.example.song;
import java.util.*;

public interface SongRepository{
    
    public ArrayList<Song> getSongs();
    public Song addSong(Song song);
    
}