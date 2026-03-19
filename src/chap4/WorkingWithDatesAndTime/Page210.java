package chap4.WorkingWithDatesAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Page210 {
    public static void main(String[] args) {
//        Manipulating Dates and Times
//        Adding to a date is easy. The date and time classes are immutable.
//        Remember to assign the results of these methods to a reference variable so they are not lost.
        var date = LocalDate.of(2025, Month.JANUARY, 20);
        System.out.println(date);    // 2025–01–20
        date = date.plusDays(2);
        System.out.println(date);    // 2025–01–22
        date = date.plusWeeks(1);
        System.out.println(date);    // 2025–01–29
        date = date.plusMonths(1);
        System.out.println(date);    // 2025–02–28
        date = date.plusYears(5);
        System.out.println(date);    // 2030–02–28

//        This code is nice because it does just what it looks like.
//        We start out with January 20, 2025. On line 15, we add two days to it and reassign it
//        to our reference variable.
//        On line 17, we add a week. This method allows us to write clearer code than plusDays(7).
//        Now date is January 29, 2025.
//        On line 19, we add a month.
//        This would bring us to February 29, 2025.
//        However, 2025 is not a leap year (2020 and 2024 are leap years).
//        Java is smart enough to realize that February 29, 2025, does not exist,
//        and it gives us February 28, 2025, instead.
//        Finally, line 21 adds five years.

//        February 29 exists only in a leap year.
//        Leap years are years that are a multiple of 4 or 400, but not other multiples of 100.
//        For example, 2000 and 2028 are leap years, but 2100 is not.

//        There are also nice, easy methods to go backward in time.
//        This time, let’s work with LocalDateTime:
        var date2 = LocalDate.of(2025, Month.JANUARY, 20);
        var time = LocalTime.of(5, 15);
        var dateTime = LocalDateTime.of(date2, time);
        System.out.println(dateTime);       // 2025–01–20T05:15
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime);       // 2025–01–19T05:15
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime);       // 2025–01–18T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime);       // 2025–01–18T19:14:30


//        Line 40 prints the original date of January 20, 2025, at 5:15 a.m.
//        Line 41 subtracts a full day, bringing us to January 19, 2025, at 5:15 a.m.
//        Line 43 subtracts 10 hours, showing that the date will change if the
//        hours cause it to adjust, and it brings us to January 18, 2025, at 19:15 (7:15 p.m.).
//        Finally, line 45 subtracts 30 seconds. You can see that all of a sudden,
//        the display value starts showing seconds.
//        Java is smart enough to hide the seconds and nanoseconds when we aren’t using them.

    }
}
