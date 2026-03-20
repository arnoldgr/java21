package chap4.WorkingWithDatesAndTime;

import java.time.*;

public class Page209 {
    public static void main(String[] args) {
        //carrying these variables over from the previous class
        var date1 = LocalDate.of(2025, Month.JANUARY, 20);
        var date2 = LocalDate.of(2025, 1, 20);
        var time1 = LocalTime.of(6, 15);               // hour and minute
        var time2 = LocalTime.of(6, 15, 30);           // + seconds
        var time3 = LocalTime.of(6, 15, 30, 200);
        var dateTime1 = LocalDateTime.of(2025, Month.JANUARY, 20, 6, 15, 30);
        var dateTime2 = LocalDateTime.of(date1, time2);

//        To create a ZonedDateTime, we first need to get the desired time zone.
//        We will use US/Eastern in our examples:
        var zone = ZoneId.of("US/Eastern");
        var zoned1 = ZonedDateTime.of(2025, 1, 20,
                6, 15, 30, 200, zone);
        var zoned2 = ZonedDateTime.of(date1, time1, zone);
        var zoned3 = ZonedDateTime.of(dateTime1, zone);
        System.out.println(zoned1);
        System.out.println(zoned2);
        System.out.println(zoned3);


//        We start by getting the time zone object. Then we use one of three approaches to create the ZonedDateTime. The first passes all of the fields individually. We don’t recommend this approach—there are too many numbers, and it is hard to read. A better approach is to pass a LocalDate object and a LocalTime object, or a LocalDateTime object.
//        Although there are other ways of creating a ZonedDateTime, you only need to know three for the exam:

//        public static ZonedDateTime of(int year, int month,
//        int dayOfMonth, int hour, int minute, int second,
//        int nanos, ZoneId zone)
//        public static ZonedDateTime of(LocalDate date, LocalTime time,
//                ZoneId zone)
//        public static ZonedDateTime of(LocalDateTime dateTime, ZoneId zone)

//        Notice that there isn’t an option to pass in the Month enum. Also, we did not use a constructor in any of the examples. The date and time classes have private constructors along with static methods that return instances. This is known as the factory pattern. The exam creators may throw something like this at you:
//        var d = new LocalDate(); // DOES NOT COMPILE

//        Don’t fall for this. You are not allowed to construct a date or time object directly.
//        Another trick is what happens when you pass invalid numbers to of(), for example:
//        var d = LocalDate.of(2025, Month.JANUARY, 32); // DateTimeException

//        You don’t need to know the exact exception that’s thrown, but it’s a clear one:
//        java.time.DateTimeException: Invalid value for DayOfMonth
//        (valid values 1-28/31): 32
    }
}
