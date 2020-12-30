public class SongInformation {
    private String songTitle;
    private Integer releaseYear;
    private Integer rating;
    private Author author;

    public SongInformation(String songTitle, Integer releaseYear, Integer rating, Author author) {
        this.songTitle = songTitle;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.author = author;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "SongInformation{" +
                "songTitle='" + songTitle + '\'' +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                ", author=" + author +
                '}';
    }
}
