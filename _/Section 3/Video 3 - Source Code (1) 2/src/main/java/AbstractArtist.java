import java.util.ArrayList;
import java.util.List;

public abstract class AbstractArtist implements Artist {
    private List<Album> albums = new ArrayList<Album>();


    public List<Album> getAlbums() {
        return albums;
    }

    public void addAlbum(Album album) {
        album.setArtist(this);
        albums.add(album);
    }
}
