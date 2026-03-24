package chap7.b2WorkingWithEnums.page379;

interface Visitors {
    void printVisitors();
}

//    Working with Complex Enums
//    While a simple enum is composed of just a list of values, we can define a complex enum with additional elements.
//    Let’s say our zoo wants to keep track of traffic patterns to determine which seasons get the most visitors.

enum SeasonWithVisitors implements Visitors {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

    private final String visitors;
    public static final String DESCRIPTION = "Weather enum";

    private SeasonWithVisitors(String visitors) {
        System.out.print("constructing,");
        this.visitors = visitors;
    }

    @Override
    public void printVisitors() {
        System.out.println(visitors);
    }
}