package section8.linkedlist.linkedlistchallenge;

public class Song {
    private String title;
    private String duration;
    private String belongsToAlbum;

    public Song(String title, String duration, String belongsToAlbum) {
        this.title = title;
        this.duration = duration;
        this.belongsToAlbum = belongsToAlbum;
    }

    public String getBelongsToAlbum() {
        return belongsToAlbum;
    }

    public void setBelongsToAlbum(String belongsToAlbum) {
        this.belongsToAlbum = belongsToAlbum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
