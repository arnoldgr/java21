package chap4.WorkingWithDatesAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Page218 {
    public static void main(String[] args) {
//        Remember that Period and Duration are not equivalent.
//        This example shows a Period and Duration of the same length:
        var date = LocalDate.of(2025, 5, 25);
        var period = Period.ofDays(1);
        var days = Duration.ofDays(1);

        System.out.println(date.plus(period));   // 2025–05–26
        System.out.println(date.plus(days));     // Unsupported unit: Seconds

//        Since we are working with a LocalDate, we are required to use Period.
//        Duration has time units in it, even if we don’t see them, and they are meant only for objects with time

    }
}
