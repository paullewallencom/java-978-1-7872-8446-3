public class SingleArtist extends AbstractArtist {
    private String name;
    public static final String ARTIST_TYPE = "Single Artist";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
