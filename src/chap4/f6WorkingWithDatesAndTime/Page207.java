package chap4.WorkingWithDatesAndTime;

import java.time.LocalDate;
import java.time.Month;

public class Page207 {
    public static void main(String[] args) {
//        The key is the type of information in the output.
//        The first line contains only a date and no time.
//        The second contains only a time and no date.
//        The time displays hours, minutes, seconds, and fractional seconds.
//        The third contains both a date and a time.
//        The output uses T to separate the date and time when converting LocalDateTime to a String.
//        Finally, the fourth adds the time zone offset and time zone.
//        New York is four time zones away from Greenwich Mean Time (GMT).
//        Greenwich Mean Time is a time zone in Europe that is used as time zone zero when discussing offsets.
//        You might have also heard of Coordinated Universal Time, which is a time zone standard.
//        It is abbreviated as UTC, as a compromise between the English and French names.
//        (That’s not a typo. UTC isn’t actually the proper acronym in either language!) UTC
//        uses the same time zone zero as GMT.
//        First, let’s try to figure out how far apart the following moments are in time.
//        Notice how India has a half-hour offset, not a full hour.
//        To approach a problem like this, you subtract the time zone from the time.
//        This gives you the GMT equivalent of the time:

//        2025–06–20T06:50+05:30[Asia/Kolkata]    // GMT 2025–06–20 01:20
//        2025–06–20T07:50-04:00[US/Eastern]      // GMT 2025–06–20 11:50

//        Remember that you need to add when subtracting a negative number.
//        After converting to GMT, you can see that the U.S.
//        Eastern time occurs 10 and a half hours after the Kolkata time.

//        The time zone offset can be listed in different ways: +02:00, GMT+2,
//        and UTC+2 all mean the same thing. You might see any of them on the exam.

//        Now that you know how to create the current date and time, let’s look at other specific dates and times.
//        To begin, let’s create just a date with no time. Both of these examples create the same date:
        var date1 = LocalDate.of(2025, Month.JANUARY, 20);
        var date2 = LocalDate.of(2025, 1, 20);

//        Both pass in the year, month, and date. Although it is good to use the Month constants
//        (to make the code easier to read), you can pass the int number of the month directly.
//        Just use the number of the month the same way you would if you were writing the date in real life.

//        The method signatures are as follows:
//        public static LocalDate of(int year, int month, int dayOfMonth)
//        public static LocalDate of(int year, Month month, int dayOfMonth)



    }
}
