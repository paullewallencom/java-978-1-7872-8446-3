public class StandardAlbum extends AbstractAlbum {
    private String albumName;
    public static final String RELEASE_TYPE = "Standard album";

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @Override
    public String toString() {
        return "StandardAlbum{" +
                "albumName='" + albumName + '\'' +
                ", songs=" + songs +
                '}';
    }
}
