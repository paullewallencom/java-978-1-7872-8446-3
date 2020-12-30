public class MyApp {
    public static void main(String[] args) {
        Song song = new Song();
        song.name = "My favourite song";
        Album album = new Album();
        album.firstSong = song;
        Artist artist = new Artist();
        artist.album = album;

        Listener listener = new Listener();
        listener.listenedToSong = song;

        System.out.println(artist.album.firstSong.name);
        System.out.println(listener.listenedToSong.name);
    }
}
