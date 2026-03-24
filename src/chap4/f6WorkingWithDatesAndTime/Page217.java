package chap4.WorkingWithDatesAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Page217 {
    public static void main(String[] args) {
//        ChronoUnit for Differences

//        ChronoUnit is a great way to determine how far apart two Temporal values are.
//        Temporal includes LocalDate, LocalTime, and so on. ChronoUnit is in the java.time.temporal package.


        var one = LocalTime.of(5, 15);
        var two = LocalTime.of(6, 55);
        var date = LocalDate.of(2025, 1, 20);
        System.out.println(ChronoUnit.HOURS.between(one, two));     // 1
        System.out.println(ChronoUnit.MINUTES.between(one, two));   // 100
//        System.out.println(ChronoUnit.MINUTES.between(one, date));  // DateTimeException


//        The first print statement shows that between truncates rather than rounds.
//        The second shows how easy it is to count in different units. Just change the ChronoUnit type.
//        The last reminds us that Java will throw an exception if we mix up what can be done on date
//        versus time objects.
//        Alternatively, you can truncate any object with a time element. For example:


        LocalTime time = LocalTime.of(3, 12, 45);
        System.out.println(time);      // 03:12:45
        LocalTime truncated = time.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(truncated); // 03:12

//        This example zeroes out any fields smaller than minutes. In our case, it gets rid of the seconds.

//        Using a Duration works the same way as using a Period. For example:

        var date2 = LocalDate.of(2025, 1, 20);
        var time2 = LocalTime.of(6, 15);
        var dateTime2 = LocalDateTime.of(date2, time2);
        var duration2 = Duration.ofHours(6);

        System.out.println(dateTime2.plus(duration2));  // 2025–01–20T12:15
        System.out.println(time2.plus(duration2));      // 12:15
//        System.out.println(date.plus(duration2));  // UnsupportedTemporalTypeException

//        Line 44 shows that we can add hours to a LocalDateTime, since it contains a time.
//        Line 45 also works, since all we have is a time.
//        Line 46 fails because we cannot add hours to an object that does not contain a time.

//        Let’s try that again, but add 23 hours this time.
        var date3 = LocalDate.of(2025, 1, 20);
        var time3 = LocalTime.of(6, 15);
        var dateTime3 = LocalDateTime.of(date3, time3);
        var duration3 = Duration.ofHours(23);
        System.out.println(dateTime3.plus(duration3));  // 2025–01–21T05:15
        System.out.println(time3.plus(duration3));      // 05:15
//        System.out.println(date3.plus(duration3));  // UnsupportedTemporalTypeException

//        This time we see that Java moves forward past the end of the day.
//        Line 60 goes to the next day since we pass
//        midnight.Line 61 doesn’t have a day, so the
//        time just wraps around—just like on a real clock.

    }
}
