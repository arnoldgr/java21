package chap4.WorkingWithDatesAndTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Page205 {
    public static void main(String[] args) {
//        You need an import statement to work with the modern date and time classes.
//        To use it, add this import to your program:
//        import java.time.*;    // import time classes
//        Creating Dates and Times
//        In the real world, we usually talk about dates and time zones as if the
//        other person is located near us.
//        For example, if you say to me, “I’ll call you at 11 on Tuesday morning,” we assume that 11
//        means the same thing to both of us.
//        But if I live in New York and you live in California, we need to be more specific.
//        California is three hours earlier than New York because the states are in different time zones.
//        You would instead say, “I’ll call you at 11 EST (Eastern Standard Time) on Tuesday morning.”
//        When working with dates and times, the first thing to do is to decide how much information you need.
//        The exam gives you four choices.
//
//        LocalDate  Contains just a date—no time and no time zone.
//        A good example of LocalDate is your birthday this year.
//        It is your birthday for a full day, regardless of what time it is.
//        LocalTime  Contains just a time—no date and no time zone.
//        A good example of LocalTime is midnight. It is midnight at the same time every day.
//        LocalDateTime  Contains both a date and time but no time zone.
//        A good example of LocalDateTime is “the stroke of midnight on New Year’s Eve.”
//        ZonedDateTime  Contains a date, time, and time zone.
//        A good example of ZonedDateTime is “a conference call at 9 a.m. EST.”
//        If you live in California, you’ll have to get up really early since the call is at 6 a.m. local time!
//
//        You obtain date and time instances using a static method.
//        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

//       Each of the four classes has a static method called now(), which gives the current date and time. Your output is going to depend on the date/time when you run it and where you live. The authors live in the United States, making the output look like the following when run on July 25 at 9:13 a.m.:

    }
}
