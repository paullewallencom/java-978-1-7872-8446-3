import java.util.HashSet;
import java.util.Set;

public class MyApp {
    public static void main(String[] args) {
        Song song = new Song();
        song.setName("My favourite songs");

        Author author1 = new Author("First Author's name");
        SongInformation songInformation = new SongInformation("Title 1", 2017, 10, author1);

        Author author2 = new Author("Second Author's name");
        SongInformation songInformation2 = new SongInformation("Title 1 (Studio Version)", 2017, 10, author2);

        song.addInformation(songInformation);
        song.addInformation(songInformation2);

        Song song2 = new Song();
        song2.setName("Second track on this album");

        SongInformation songInformation3 = new SongInformation("Track 2", 2017, 8, author1);
        song2.addInformation(songInformation3);

        StandardAlbum standardAlbum = new StandardAlbum();
        standardAlbum.addSong(song);
        SingleArtist singleArtist = new SingleArtist();
        singleArtist.setName("Singer name");
        singleArtist.addAlbum(standardAlbum);

        Listener listener = new Listener();
        listener.addListenedToSong(song);

        Set<Author> authors = new HashSet<Author>();
        authors.add(author1);
        authors.add(author2);

        System.out.println("First song: " + singleArtist.getAlbums().get(0).getSong(0));
        System.out.println("First listened song: " + listener.getListenedToSong().get(0));
        System.out.println("How many songs in album: " + song.getAlbum().getSongs().size());
        System.out.println("How many listeners for song: " + song.getListeners().size());
        System.out.println("How many songs listened by listener: " + listener.getListenedToSong().size());
        System.out.println("Who is the artist of the first listened song: " + listener.getListenedToSong().get(0).getAlbum().getArtist().getName());
    }
}
