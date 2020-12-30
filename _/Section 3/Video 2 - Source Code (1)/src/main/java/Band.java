import java.util.ArrayList;
import java.util.List;

public class Band implements Artist {
    private String name;
    private List<Album> album = new ArrayList<Album>();

    public List<Album> getAlbum() {
        return album;
    }

    public void addAlbum(Album album) {
        this.album.add(album);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
