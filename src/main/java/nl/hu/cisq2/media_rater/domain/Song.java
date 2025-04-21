package nl.hu.cisq2.media_rater.domain;

import java.util.Objects;

public class Song implements Content, Comparable<Content> {

    private final String title;

    private final String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public int getRating() {
        return title.length() % 10;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return "Song";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(title, song.title) && Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", rating='" + getRating() + '\'' +
                '}';
    }


    @Override
    public int compareTo(Content o) {
        return title.compareTo(o.getTitle());
    }
}
