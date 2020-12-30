public class MyApp {
    public static void main(String[] args) {
        Song song = new Song();
        song.setName("My favourite songs");
        StandardAlbum standardAlbum = new StandardAlbum();
        standardAlbum.addSong(song);
        SingleArtist singleArtist = new SingleArtist();
        singleArtist.addAlbum(standardAlbum);

        Listener listener = new Listener();
        listener.addListenedToSong(song);

        System.out.println(singleArtist.getAlbum().get(0).getSong(0).getName());
        System.out.println(listener.getListenedToSong().get(0).getName());
    }
}
