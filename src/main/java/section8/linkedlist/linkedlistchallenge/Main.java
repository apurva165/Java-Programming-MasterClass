package section8.linkedlist.linkedlistchallenge;

public class Main {
    public static void main(String[] args) {

        Album allAlbums = new Album("Hindi Album");
        allAlbums.addAlbum("English Album");
        allAlbums.addAlbum("Marathi Album");
        allAlbums.showAllAlbums();

        Song hindiSong = new Song("MyFirstSong", "3 mins", "Hindi Album");
        Song marathiSong = new Song("MyFirstSong", "3 mins", "Marathi Album");

        allAlbums.addSongToAlbum(hindiSong);
        allAlbums.addSongToAlbum(marathiSong);

        allAlbums.showAllSongs();


    }
}
