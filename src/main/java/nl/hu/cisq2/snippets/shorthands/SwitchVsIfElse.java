package nl.hu.cisq2.snippets.shorthands;

public class SwitchVsIfElse {


    public static String getDayType(int day) {
        return switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
    }

    public static String getDayTypeSwitch(int day) {
        switch (day) {
            case 1, 2, 3, 4, 5:
                return "Weekday";
            case 6, 7:
                return "Weekend";
            default:
                return "Invalid day";
        }
    }

    public static String getDayTypeIfElse(int day) {
        if (day >= 1 && day <= 5) {
            return "Weekday";
        } else if (day == 6 || day == 7) {
            return "Weekend";
        } else {
            return "Invalid day";
        }
    }

}
