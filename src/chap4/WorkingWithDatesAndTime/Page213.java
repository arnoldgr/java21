package chap4.WorkingWithDatesAndTime;

import java.time.LocalDate;
import java.time.Month;

public class Page213 {
    public static void main(String[] args) {
//        These are methods that you can use to create a copy of an object with specific field(s)
//        altered to the specified value. For example:

//      .with...
        var date = LocalDate.of(2025, Month.FEBRUARY, 20);  // 2025-02-20
        var differentDay = date.withDayOfMonth(15);         // 2025-02-15
        var differentMonth = date.withDayOfYear(3);         // 2025-01-03
        var allChanged = date.withYear(2026)
                .withMonth(4)
                .withDayOfMonth(10);                             // 2026-04-10

//        Finally, there are methods to convert from one type to another. For example:
//        .at...
        var date2 = LocalDate.of(2025, Month.MARCH, 3);
        var withTime = date2.atTime(5, 30);  // 2025-03-03T05:30
        var start = date2.atStartOfDay();    // 2025-03-03T00:00

//        The at_________() methods combine the instance variable and the parameter into one new object.
//        They are listed in Table 4.7.

//        LocalDate to LocalDateTime
//        atStartOfDay()atTime(int hour, int minute)
//        atTime(int hour, int minute, int second)
//        atTime(int hour, int minute,int second, int nanos)
//        atTime(LocalTime time)

//        LocalTime to LocalDate
//        atDate(LocalDate date)

//        LocalDateTime to ZonedDateTime
//        atZone(ZoneId zoneId)

//        **********************

//        Working with Periods
//        Now you know enough to do something fun with dates! Our zoo performs animal enrichment
//        activities to give the animals something enjoyable to do.
//        The head zookeeper has decided to switch the toys every month.
//        This system will continue for three months to see how it works out.

        var start2 = LocalDate.of(2025, Month.JANUARY, 1);
        var end = LocalDate.of(2025, Month.MARCH, 30);
        performAnimalEnrichment(start2, end);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        var upTo = start;
        while (upTo.isBefore(end)) {  // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1); // add a month
        }
    }
//    This code works fine. It adds a month to the date until it hits the end date.
//    The problem is that this method can’t be reused.
//    Our zookeeper wants to try different schedules to see which works best.

}


