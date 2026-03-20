package chap4.WorkingWithDatesAndTime;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Page216 {
    public static void main(String[] args) {
//        Working with Durations
//        You’ve probably noticed by now that a Period is a day or more of time.
//        There is also Duration, which is intended for smaller units of time.
//        For Duration, you can specify the number of days, hours, minutes, seconds, or nanoseconds.
//        And yes, you could pass 365 days to make a year, but you really shouldn’t—that’s what Period is for.
//        Conveniently, Duration works roughly the same way as Period, except it is used with objects that have time.
//        Duration is output beginning with PT, which you can think of as a period of time.
//        A Duration is stored in hours, minutes, and seconds. The number of seconds includes fractional seconds.
//        We can create a Duration using a number of different granularities:

        var daily = Duration.ofDays(1);               // PT24H
        var hourly = Duration.ofHours(1);             // PT1H
        var everyMinute = Duration.ofMinutes(1);      // PT1M
        var everyTenSeconds = Duration.ofSeconds(10); // PT10S
        var everyMilli = Duration.ofMillis(1);        // PT0.001S
        var everyNano = Duration.ofNanos(1);          // PT0.000000001S
        System.out.println(daily);
        System.out.println(hourly);
        System.out.println(everyMinute);
        System.out.println(everyTenSeconds);
        System.out.println(everyMilli);
        System.out.println(everyNano);

//        Duration doesn’t have a factory method that takes multiple units like Period does. If you want something to happen every hour and a half, you specify 90 minutes.
//        Duration includes another more generic factory method. It takes a number and a TemporalUnit. The idea is, say, something like “5 seconds.” However, TemporalUnit is an interface. At the moment, there is only one implementation named ChronoUnit.
//        The previous example could be rewritten like this:
        var daily2 = Duration.of(3, ChronoUnit.DAYS);
        var hourly2 = Duration.of(1, ChronoUnit.HOURS);
        var everyMinute2 = Duration.of(1, ChronoUnit.MINUTES);
        var everyTenSeconds2 = Duration.of(10, ChronoUnit.SECONDS);
        var everyMilli2 = Duration.of(1, ChronoUnit.MILLIS);
        var everyNano2 = Duration.of(1, ChronoUnit.NANOS);
        System.out.println(daily2);
        System.out.println(hourly2);
        System.out.println(everyMinute2);
        System.out.println(everyTenSeconds2);
        System.out.println(everyMilli2);
        System.out.println(everyNano2);
    }
}
