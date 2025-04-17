package nl.hu.cisq2.snippets.shorthands;

import java.util.List;

public class Shorthands {

    public static List<String> names = List.of("Alice", "Bob", "Charlie");

    public static int IfElseExample(String word) {
        int result = 0;

        if (names.contains(word)) {
            result = 1;
        } else {
            result = 3;
        }

        return result;
    }

    /**
     *  The shorthand for if/else is the ternary operator.
     * @param word
     * @return 1 if the length of the word is less than 5, otherwise 3
     */
    public static int ternaryOperatorExample(String word) {
        return (word.length() < 5) ? 1 : 3;
    }


    public static void printNames() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }

    public static void printNamesWithShortHand() {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
