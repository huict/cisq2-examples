package nl.hu.cisq2.media_rater.excercises;


import nl.hu.cisq2.media_rater.domain.Content;
import nl.hu.cisq2.media_rater.domain.Movie;

import java.util.List;
import java.util.Optional;

public class StreamsExercises {

    // gebruik .map()
    public static List<String> getAllTitles(List<Content> content) {
        return null;
    }

    // gebruik .reduce()
    public static int calculateTotalRatingWithReduce(List<? extends Content> contents) {
        return 0;
    }

    // gebruik .sum()
    public static int calculateTotalRatingWithSum(List<? extends Content> contents) {
        return 0;
    }

    // gebruik whatever
    public static int calculateAverageRating(List<? extends Content> contents) {
        return 0;
    }

    // gebruik filter()
    public static <T extends Content> List<T> getAllContentWithRating(int rating, List<T> contentList) {
        return null;
    }

    // use findFirst() of findAny()
    public static <T extends Content> Optional<T> getContentWithRatingOff(int rating, List<T> contentList) {
        return null;
    }

    // use sorted()
    public static <T extends Content> List<T> getContentSortedByTitle(List<T> content) {
        return null;
    }

    public static <T extends Content> List<T> getContentSortedByRating(List<T> content) {
        return null;
    }

    // Returns true if all ratings are higher than given rating
    // gebruik allMatch()
    public static <T extends Content> boolean allRatingsHigherThan(int rating, List<T> contentList) {
        return false;
    }

    // gebruik noneMatch()
    public static <T extends Content> boolean noRatingLowerThan(int rating, List<T> contentList) {
        return false;
    }

    // gebruik anyMatch()
    public static <T extends Content> boolean anyRatingHigherThan(int rating, List<T> contentList) {
        return false;
    }

    // Returns true als beide lijsten dezelfde movies in dezelfde volgorde bevatten.
    // gebruik IntStream.range()
    public static boolean movieListsAreEqual(List<Movie> list1, List<Movie> list2) {
        return false;
    }

}
