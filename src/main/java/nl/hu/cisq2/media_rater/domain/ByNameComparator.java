package nl.hu.cisq2.media_rater.domain;

import java.util.Comparator;

public class ByNameComparator implements Comparator<Artist> {
    @Override
    public int compare(Artist artist1, Artist artist2) {
        return artist1.getName()
                .compareTo(artist2.toString());
    }
}
