package nl.hu.cisq2.media_rater.excercises;


import nl.hu.cisq2.media_rater.domain.Content;

import java.util.List;

public class GenericsExample {

    public static List<Content> sortContent(List<Content> contentList) {
        contentList.sort((c1, c2) -> c1.getTitle().compareTo(c2.getTitle()));
        return contentList;
    }

}
