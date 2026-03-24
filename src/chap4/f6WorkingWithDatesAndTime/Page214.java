package chap4.WorkingWithDatesAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

//Using Period
public class Page214 {
    public static void main(String[] args) {
//        LocalDate and LocalDateTime have a method to convert themselves into long values,
//        equivalent to the number of milliseconds that have passed since January 1, 1970,
//        referred to as the epoch. What’s special about this date?
//        That’s what Unix started using for date standards, so Java reused it.

//        Luckily, Java has a Period class that we can pass in. This code does the same thing as the previous example:

        var start = LocalDate.of(2025, Month.JANUARY, 1);
        var end = LocalDate.of(2025, Month.MARCH, 30);
        var period = Period.ofMonths(1);    // create a period
        performAnimalEnrichment(start, end, period);

//        The method can add an arbitrary period of time that is passed in.
//        This allows us to reuse the same method for different periods of
//        time as our zookeeper changes their mind.
//        A Period can be positive (forward in time) or negative (backwards in time.)
//        There are five ways to create a Period class.

        var annually = Period.ofYears(1);            // every 1 year
        var quarterly = Period.ofMonths(3);          // every 3 months
        var everyThreeWeeks = Period.ofWeeks(-3);    // every 3 weeks going backwards
        var everyOtherDay = Period.ofDays(2);        // every 2 days
        var everyYearAndAWeek = Period.of(1, 0, 7);  // every year plus 1 week


        System.out.println(annually);
        System.out.println(quarterly);
        System.out.println(everyThreeWeeks);
        System.out.println(everyOtherDay);
        System.out.println(everyYearAndAWeek);
//        There’s one catch. You cannot chain methods when creating a Period. The following code looks like
//        it is equivalent to the everyYearAndAWeek example,
//        but it’s not. Only the last method is used because the methods are static methods.
        var wrong = Period.ofYears(1).ofWeeks(1); // every week
//
//        This tricky code is really like writing the following:
        var wrong2 = Period.ofYears(1);
        wrong = Period.ofWeeks(1);

//        This is clearly not what you intended! That’s why the of() method allows
//        you to pass in the number of years, months, and days.
//        They are all included in the same period.
//        You will get a compiler warning about this.
//        Compiler warnings tell you that something is wrong or suspicious without failing compilation.
//        The of() method takes only years, months, and days.
//        The ability to use another factory method to pass weeks is merely a convenience.
//        As you might imagine, the actual period is stored in terms of years, months, and days.

    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end,
                                                Period period) {             // uses the generic period

        var upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period
        }
    }

}

