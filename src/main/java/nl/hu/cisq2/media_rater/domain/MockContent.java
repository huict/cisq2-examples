package nl.hu.cisq2.media_rater.domain;

import java.util.ArrayList;
import java.util.List;

public class MockContent {

    public static List<String> getPopularArtists() {
        ArrayList<String> popularArtists = new ArrayList<>();

        // Add 20 popular artist names to the ArrayList
        popularArtists.add("Beyoncé");
        popularArtists.add("Drake");
        popularArtists.add("Taylor Swift");
        popularArtists.add("Ed Sheeran");
        popularArtists.add("Ariana Grande");
        popularArtists.add("Justin Bieber");
        popularArtists.add("Rihanna");
        popularArtists.add("Eminem");
        popularArtists.add("Kanye West");
        popularArtists.add("Lady Gaga");
        popularArtists.add("Bruno Mars");
        popularArtists.add("Post Malone");
        popularArtists.add("Billie Eilish");
        popularArtists.add("The Weeknd");
        popularArtists.add("Adele");
        popularArtists.add("Travis Scott");
        popularArtists.add("Shawn Mendes");
        popularArtists.add("Katy Perry");
        popularArtists.add("Nicki Minaj");
        popularArtists.add("Imagine Dragons");

        return popularArtists;
    }

    public static List<Song> getPopularSongs() {
        ArrayList<Song> popularSongs = new ArrayList<>();

        // Add 20 popular songs to the ArrayList
        popularSongs.add(new Song("Shape of You", "Ed Sheeran"));
        popularSongs.add(new Song("Blinding Lights", "The Weeknd"));
        popularSongs.add(new Song("Dance Monkey", "Tones and I"));
        popularSongs.add(new Song("Uptown Funk", "Mark Ronson ft. Bruno Mars"));
        popularSongs.add(new Song("Despacito", "Luis Fonsi ft. Daddy Yankee"));
        popularSongs.add(new Song("Old Town Road", "Lil Nas X ft. Billy Ray Cyrus"));
        popularSongs.add(new Song("Hello", "Adele"));
        popularSongs.add(new Song("Someone Like You", "Adele"));
        popularSongs.add(new Song("See You Again", "Wiz Khalifa ft. Charlie Puth"));
        popularSongs.add(new Song("Havana", "Camila Cabello ft. Young Thug"));
        popularSongs.add(new Song("7 Rings", "Ariana Grande"));
        popularSongs.add(new Song("Thinking Out Loud", "Ed Sheeran"));
        popularSongs.add(new Song("Sicko Mode", "Travis Scott"));
        popularSongs.add(new Song("Closer", "The Chainsmokers ft. Halsey"));
        popularSongs.add(new Song("Radioactive", "Imagine Dragons"));
        popularSongs.add(new Song("Rolling in the Deep", "Adele"));
        popularSongs.add(new Song("Sorry", "Justin Bieber"));
        popularSongs.add(new Song("Love Yourself", "Justin Bieber"));
        popularSongs.add(new Song("Bad Guy", "Billie Eilish"));
        popularSongs.add(new Song("Cheap Thrills", "Sia"));

        return popularSongs;
    }

    public static List<Movie> getPopularMovies() {
        // Create an ArrayList to store popular movies
        ArrayList<Movie> popularMovies = new ArrayList<>();

        // Add 20 popular movies to the ArrayList
        popularMovies.add(new Movie("Inception", "2010"));
        popularMovies.add(new Movie("Interstellar", "2014"));
        popularMovies.add(new Movie("The Martian", "2015"));
        popularMovies.add(new Movie("Gravity", "2013"));
        popularMovies.add(new Movie("The Dark Knight", "2008"));
        popularMovies.add(new Movie("Avengers: Endgame", "2019"));
        popularMovies.add(new Movie("Avatar", "2009"));
        popularMovies.add(new Movie("Jurassic Park", "1993"));
        popularMovies.add(new Movie("The Shawshank Redemption", "1994"));
        popularMovies.add(new Movie("Pulp Fiction", "1994"));
        popularMovies.add(new Movie("Titanic", "1997"));
        popularMovies.add(new Movie("The Lord of the Rings: The Fellowship of the Ring", "2001"));
        popularMovies.add(new Movie("The Matrix", "1999"));
        popularMovies.add(new Movie("Forrest Gump", "1994"));
        popularMovies.add(new Movie("Star Wars: Episode IV - A New Hope", "1977"));
        popularMovies.add(new Movie("The Godfather", "1972"));
        popularMovies.add(new Movie("Inglourious Basterds", "2009"));
        popularMovies.add(new Movie("The Lion King", "1994"));
        popularMovies.add(new Movie("The Silence of the Lambs", "1991"));
        popularMovies.add(new Movie("Fight Club", "1999"));

        return popularMovies;
    }

    public static List<Content> getPopularMedia() {
        ArrayList<Content> combined = new ArrayList<>();
        combined.addAll(getPopularMovies());
        combined.addAll(getPopularSongs());

        return combined;
    }

}
