package nl.hu.cisq2.media_rater.domain;

import java.util.Objects;

public class Movie implements Content {

    private final String title;

    public final String year;

    public Movie(String title, String year) {
        this.title = title;
        this.year = year;
    }

    public String getYear() {
        return year;
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
        return "Movie";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) && Objects.equals(year, movie.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", rating='" + getRating() + '\'' +
                '}';
    }
}
