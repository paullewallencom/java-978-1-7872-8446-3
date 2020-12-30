import java.util.ArrayList;
import java.util.List;

public class SingleArtist implements Artist {
    private String name;
    private List<Album> standardAlbum = new ArrayList<Album>();

    public List<Album> getAlbum() {
        return standardAlbum;
    }

    public void addAlbum(Album album) {
        this.standardAlbum.add(album);
    }
}
