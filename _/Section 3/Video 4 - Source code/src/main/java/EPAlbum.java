public class EPAlbum extends AbstractAlbum {
    private String albumName;
    public final static String RELEASE_TYPE = "EP";

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
