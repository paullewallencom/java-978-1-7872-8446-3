import java.util.List;

public interface Album {
    List<Song> getSongs();
    Song getSong(int id);
    void addSong(Song song);
}
