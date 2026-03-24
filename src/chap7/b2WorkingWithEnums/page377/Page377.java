package chap7.b2WorkingWithEnums.page377;

public class Page377 {

//    Using Enums in switch Statements
//    As we saw in Chapter 3, “Making Decisions,” enums can be used in switch statements and expressions.
//    Enums have the unique property that they do not require a default branch for an exhaustive
//    switch if all enum values are handled.
    static String getWeather(Season value) {
        return switch (value) {
            case SUMMER        -> "Too hot";
            case Season.WINTER -> "Too cold";
            case SPRING, FALL  -> "Just right";
        };
    }

    public static void main(String[] args) {
        System.out.println(getWeather(Season.SUMMER));
    }

//    A default branch can also be added but is not required, so long as all values are handled. Also notice that within each case clause, the name of the enum, Season, is now optional. In previous versions of Java, the name of the enum was disallowed.
//    While each enum value has an accompanying ordinal value, it cannot be used directly within a case clause. For example, this does not compile:
//    String getWeather(Season value) {
//        return switch (value) {
//            case SUMMER -> "Too hot";
//            case 0      -> "Too cold";  // DOES NOT COMPILE
//            default     -> "Just right";
//        };
//    }
}
