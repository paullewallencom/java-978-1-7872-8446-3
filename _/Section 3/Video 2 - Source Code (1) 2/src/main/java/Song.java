import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Song {
    private String name;
    private Map<Author, SongInformation> songInformation = new HashMap<Author, SongInformation>();


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

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", songInformation=" + songInformation +
                '}';
    }
}
