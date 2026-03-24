package chap4.WorkingWithDatesAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Page208 {
    public static void main(String[] args) {
        var date1 = LocalDate.of(2025, Month.JANUARY, 20);
        var date2 = LocalDate.of(2025, 1, 20);
        System.out.println(date1);
        System.out.println(date2);
//        Up to now, we’ve been continually telling you that Java counts starting with 0.
//        Well, months are an exception. For months in the new date and time methods,
//        Java counts starting from 1, just as we humans do.
//        When creating a time, you can choose how detailed you want to be. You can specify just the hour and minute,
//        or you can include the number of seconds. You can even include nanoseconds if you want to be very precise.
//        (A nanosecond is a billionth of a second, although you probably won’t need to be that specific.)
        var time1 = LocalTime.of(6, 15);               // hour and minute
        var time2 = LocalTime.of(6, 15, 30);           // + seconds
        var time3 = LocalTime.of(6, 15, 30, 200);      // + nanoseconds
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

//        These three times are all different but within a minute of each other. The method signatures are as follows:
//        public static LocalTime of(int hour, int minute)
//        public static LocalTime of(int hour, int minute, int second)
//        public static LocalTime of(int hour, int minute, int second, int nanos)

//        You can combine dates and times into one object.
        var dateTime1 = LocalDateTime.of(2025, Month.JANUARY, 20, 6, 15, 30);
        var dateTime2 = LocalDateTime.of(date1, time2);
        System.out.println(dateTime1);
        System.out.println(dateTime2);

//        The first line of code shows how you can specify all of the information about the LocalDateTime right in the
//        same line.The second line of code shows how you can create LocalDate and LocalTime objects separately first
//        and then combine them to create a LocalDateTime object.
//                There are a lot of method signatures since there are more combinations.The following method signatures
//        use integer values:
//
//        public static LocalDateTime of ( int year, int month,
//        int dayOfMonth, int hour, int minute)
//        public static LocalDateTime of ( int year, int month,
//        int dayOfMonth, int hour, int minute, int second)
//        public static LocalDateTime of ( int year, int month,
//        int dayOfMonth, int hour, int minute, int second, int nanos)

//        Others take a Month reference:

//        public static LocalDateTime of ( int year, Month month,
//        int dayOfMonth, int hour, int minute)
//        public static LocalDateTime of ( int year, Month month,
//        int dayOfMonth, int hour, int minute, int second)
//        public static LocalDateTime of ( int year, Month month,
//        int dayOfMonth, int hour, int minute, int second, int nanos)

//        Finally, one takes an existing LocalDate and LocalTime:
//        public static LocalDateTime of (LocalDate date, LocalTime time)
    }
}
