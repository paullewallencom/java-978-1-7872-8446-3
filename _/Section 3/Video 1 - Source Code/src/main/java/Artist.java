import java.util.List;

public interface Artist {
    List<Album> getAlbum();
    void addAlbum(Album album);
}
