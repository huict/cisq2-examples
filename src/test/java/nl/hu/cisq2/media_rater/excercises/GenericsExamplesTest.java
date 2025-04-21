package nl.hu.cisq2.media_rater.excercises;

import nl.hu.cisq2.media_rater.domain.Content;
import nl.hu.cisq2.media_rater.domain.MockContent;
import nl.hu.cisq2.media_rater.domain.Song;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsExamplesTest {

    @Test
    void listWithoutGenerics() {
        List voorbeeld = new ArrayList();

        voorbeeld.add("Hallo");

        String hallo = voorbeeld.get(0);
    }

    @Test
    void listWithGenerics() {
        List<String> voorbeeld = new ArrayList<>();

        voorbeeld.add("Hallo");

        String hallo = voorbeeld.get(0);
    }

    @Test
    void declarerenGenericClass() {
       List <Song> songs = new ArrayList<>();
         songs.add(new Song("Hard to Handle", "Black Crowes"));

         List<Content> content = songs;
    }

    @Test
    void sortAString() {
        List<String> strings = MockContent.getPopularArtists();

        Collections.sort(strings);
    }

    @Test
    void sortAnObject() {
        List<Song> songs = MockContent.getPopularSongs();

        Collections.sort(songs);

        System.out.println(songs);
    }

    @Test
    void sortAnObjectWithComparableObject() {

    }



}
