import java.util.ArrayList;
import java.util.List;

public class Listener {
    private String name;
    private List<Song> listenedToSong = new ArrayList<Song>();
    private List<Playlist> playlists = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getListenedToSong() {
        return listenedToSong;
    }

    public void addListenedToSong(Song listenedToSong) {
        this.listenedToSong.add(listenedToSong);
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }
}
