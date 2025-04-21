package nl.hu.cisq2.media_rater.excercises;

import nl.hu.cisq2.media_rater.domain.Content;
import nl.hu.cisq2.media_rater.domain.MockContent;
import nl.hu.cisq2.media_rater.domain.Movie;
import nl.hu.cisq2.media_rater.domain.Song;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StreamsExercisesTest {
    @Test
    void getAllTitles() {
        List<Content> allContent = MockContent.getPopularMedia();

        List<String> allTitles = StreamsExercises.getAllTitles(allContent);

        assertEquals(CheckAnswerUtils.allTitlesUnsorted(), allTitles);
    }

    @Test
    void calculateTotalRatingWithReduce() {
        List<Song> songs = MockContent.getPopularSongs();

        assertEquals(90, StreamsExercises.calculateTotalRatingWithReduce(songs));
    }

    @Test
    void calculateTotalRatingWithSum() {
        List<Song> songs = MockContent.getPopularSongs();

        assertEquals(90, StreamsExercises.calculateTotalRatingWithSum(songs));
    }

    @Test
    void calculateAverageRating() {
        List<Song> songs = MockContent.getPopularSongs();

        assertEquals(4, StreamsExercises.calculateAverageRating(songs));
    }

    @Test
    void getAllContentWithRating() {
        List<Movie> movies = MockContent.getPopularMovies();

        List<Movie> result = new ArrayList<>();
        result.add(new Movie("The Dark Knight", "2008"));

        assertEquals(result, StreamsExercises.getAllContentWithRating(5, movies));
    }

    @Test
    void getContentWithRatingOff_Empty() {
        List<Movie> movies = MockContent.getPopularMovies();

        Utils.printList(movies);

        assertEquals(Optional.empty(), StreamsExercises.getContentWithRatingOff(10, movies));
    }

    @Test
    void getContentWithRatingOff() {
        List<Movie> movies = MockContent.getPopularMovies();

        Utils.printList(movies);
        Optional<Movie> expected = Optional.of(new Movie("Inception", "2010"));

        assertEquals(expected, StreamsExercises.getContentWithRatingOff(7, movies));
    }

    @Test
    void getContentSortedByTitle() {
        List<Song> songs = MockContent.getPopularSongs();

        List<Song> sortedSongs = StreamsExercises.getContentSortedByTitle(songs);
        Utils.printList(sortedSongs);

        assertEquals(new Song("7 Rings", "Ariana Grande"), sortedSongs.get(0));
    }

    @Test
    void getContentSortedByRating() {
        List<Song> songs = MockContent.getPopularSongs();

        List<Song> sortedSongs = StreamsExercises.getContentSortedByRating(songs);
        Utils.printList(sortedSongs);

        assertEquals(new Song("Sicko Mode", "Travis Scott"), sortedSongs.get(0));
    }

    @Test
    void allRatingsHigherThan_true() {
        List<Movie> movies = MockContent.getPopularMovies();

        assertTrue(StreamsExercises.allRatingsHigherThan(0, movies));
    }

    @Test
    void noRatingLowerThan() {
        List<Movie> movies = MockContent.getPopularMovies();

        assertTrue(StreamsExercises.noRatingLowerThan(0, movies));
    }

    @Test
    void anyRatingHigherThan() {
        List<Movie> movies = MockContent.getPopularMovies();
        Utils.printList(movies);

        assertTrue(StreamsExercises.anyRatingHigherThan(7, movies));
    }

    @Test
    void compareMovieLists_true() {
        List<Movie> list1 = new ArrayList<>();
        list1.add(new Movie("a test", "2023"));
        list1.add(new Movie("another test", "2024"));

        List<Movie> list2 = new ArrayList<>();
        list2.add(new Movie("a test", "2023"));
        list2.add(new Movie("another test", "2024"));

        assertTrue(StreamsExercises.movieListsAreEqual(list1, list2));
    }

    @Test
    void compareMovieLists_false() {
        List<Movie> list1 = new ArrayList<>();
        list1.add(new Movie("Inception", "2010"));
        list1.add(new Movie("Interstellar", "2014"));

        List<Movie> list2 = new ArrayList<>();
        list2.add(new Movie("a test", "2023"));
        list2.add(new Movie("Interstellar", "2014"));

        assertFalse(StreamsExercises.movieListsAreEqual(list1, list2));
    }
}