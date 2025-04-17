package nl.hu.cisq2.snippets.shorthands;

public class RecursiveExample {

    // Recursieve methode om de faculteit van een getal te berekenen.
    public static int factorial(int n) {
        // Basisgeval: als n gelijk is aan 0, stop de recursie en retourneer 1.
        if (n == 0) {
            return 1;
        }
        // Recursieve stap: n * factorial van (n - 1).
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("De faculteit van " + number + " is: " + factorial(number));
    }
}

