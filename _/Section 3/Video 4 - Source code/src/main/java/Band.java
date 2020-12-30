public class Band extends AbstractArtist {
    private String name;
    public static final String ARTIST_TYPE = "Band";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
