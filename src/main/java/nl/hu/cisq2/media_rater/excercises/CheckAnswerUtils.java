package nl.hu.cisq2.media_rater.excercises;

import nl.hu.cisq2.example.domain.Content;
import nl.hu.cisq2.example.domain.MockContent;
import nl.hu.cisq2.example.domain.Movie;
import nl.hu.cisq2.example.domain.Song;

import java.util.ArrayList;
import java.util.List;

public class CheckAnswerUtils {

    public static List<String> allMovieTitlesUnsorted() {
        List<String> allTitles = new ArrayList<>();

        for (Movie movie : MockContent.getPopularMovies()) {
            allTitles.add(movie.getTitle());
        }

        return allTitles;
    }

    public static List<String> allSongTitlesUnsorted() {
        List<String> allTitles = new ArrayList<>();

        for (Song song : MockContent.getPopularSongs()) {
            allTitles.add(song.getTitle());
        }

        return allTitles;
    }

    public static List<String> allTitlesUnsorted() {
        List<String> allTitles = new ArrayList<>();

        for (Content content : MockContent.getPopularMedia()) {
            allTitles.add(content.getTitle());
        }

        return allTitles;
    }



}
