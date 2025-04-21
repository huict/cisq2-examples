package nl.hu.cisq2.media_rater.domain;

public class Artist implements Comparable<Artist> {

    private final String name;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Artist o) {
        return 0;
    }
}
