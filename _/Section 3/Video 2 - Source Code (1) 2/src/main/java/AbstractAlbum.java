import java.util.ArrayList;
import java.util.List;

public abstract class AbstractAlbum implements Album {
    List<Song> songs = new ArrayList<Song>();

    public List<Song> getSongs() {
        return songs;
    }

    public Song getSong(int id) {
        return songs.get(id);
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }
}
