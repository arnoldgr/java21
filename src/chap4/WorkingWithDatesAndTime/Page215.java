package chap4.WorkingWithDatesAndTime;

import javax.sound.sampled.Line;
import java.time.*;

public class Page215 {
    public static void main(String[] args) {
//        When you print out the value, Java displays any nonzero parts using this format

        System.out.println(Period.of(1, 2, 3));

//        As you can see, the P always starts out the String to show it is a period measure.
//        Then come the number of years, number of months, and number of days.
//        If any of these are zero, they are omitted.

//        Can you figure out what this outputs?
        System.out.println(Period.ofMonths(3));

//        The output is P3M. Remember that Java omits any measures that are zero.
//        You can also create a period by getting the amount of time between two LocalDate objects:

        var xmas = LocalDate.of(2025, Month.DECEMBER, 25);
        var newYears = LocalDate.of(2026, Month.JANUARY, 1);

        System.out.println(Period.between(xmas, newYears));  // P7D
        System.out.println(Period.between(newYears, xmas));  // P-7D

//        Notice how order matters. The first time Period.between() returns a period representing seven days,
//        but the second time it returns a period of negative seven days.
//        The last thing to know about Period is what objects it can be used with.
//        Let’s look at some code:
        var date = LocalDate.of(2025, 3, 20);
        var time = LocalTime.of(6, 15);
        var dateTime = LocalDateTime.of(date, time);
        var period = Period.ofMonths(-1);
        System.out.println(date.plus(period));     // 2025–02–20
        System.out.println(dateTime.plus(period)); // 2025–02–20T06:15
//      System.out.println(time.plus(period));     // Exception

//        Lines 37 and 38 work as expected.
//        They subtract a month from March 20, 2025, giving us February 20, 2025.
//        The first has only the date, and the second has both the date and time.
//        Line 40 attempts to add a month to an object that has only a time. This won’t work.
//        Java throws an UnsupportedTemporalTypeException and complains that we attempted
//        to use an Unsupported unit: Months.
//        As you can see, you have to pay attention to the type of date and time objects every place you see them.
    }
}
