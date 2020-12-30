import java.util.*;

public class Song {
    private String name;
    private Map<Author, SongInformation> songInformation = new HashMap<Author, SongInformation>();
    private Album album;
    private List<Listener> listeners = new ArrayList<Listener>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SongInformation getSongInformation(Author author) {
        return songInformation.get(author);
    }

    public Collection<SongInformation> getAllSongInformation() {
        return songInformation.values();
    }

    public void addInformation(SongInformation songInformation) {
        this.songInformation.put(songInformation.getAuthor(), songInformation);
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Listener> getListeners() {
        return listeners;
    }

    public void listen(Listener listeners) {
        listeners.addListenedToSong(this);
        this.listeners.add(listeners);
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", songInformation=" + songInformation +
                '}';
    }
}
