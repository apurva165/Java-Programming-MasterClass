package section8.linkedlist.linkedlistchallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private ArrayList<String> albums = new ArrayList<String>();
    private LinkedList<Song> songsByAlbum = new LinkedList<Song>();
    private String albumName;

    public Album(String albumName) {
        this.albumName = albumName;
        addAlbum(albumName);
    }

    public String getAlbumName() {
        return albumName;
    }
//    public LinkedList<Song> getSongs() {
//        return songs;
//    }

    public void addSongToAlbum(Song songNameDurationAlbum) {
        addSongsWithAlbums(new Song(songNameDurationAlbum.getTitle(), songNameDurationAlbum.getDuration(), songNameDurationAlbum.getBelongsToAlbum()));
    }

    public void addAlbum(String albumName) {
        albums.add(albumName);
    }

    public void addSongsWithAlbums(Song song) {
        songsByAlbum.add(song);
    }

    public void showAllAlbums() {
        for (String album : albums) {
            System.out.println("Albums Added : " + album);
        }
    }

    public void showAllSongs(){
        ListIterator<Song> iterator = songsByAlbum.listIterator();
        while (iterator.hasNext()){
            System.out.print("Album name : " + iterator.next().getBelongsToAlbum());
            System.out.print("Song Title : " +iterator.next().getTitle());
            System.out.print("Song Duration : " +iterator.next().getDuration());
            System.out.println();
        }
    }
}
