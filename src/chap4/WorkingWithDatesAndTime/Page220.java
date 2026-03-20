package chap4.WorkingWithDatesAndTime;

import java.time.*;

public class Page220 {
    public static void main(String[] args) {
//        Some countries observe daylight saving time.
//        This is where the clocks are adjusted by an hour twice a year to make better use of the sunlight.
//        Not all countries participate, and those that do use different weekends for the change.
//        You only have to work with U.S. daylight saving time on the exam, and that’s what we describe here.
//        The exam question will let you know if a date/time mentioned falls on a weekend
//        when the clocks are scheduled to be changed.
//        If it is not mentioned in a question, you can assume that it is a normal weekend.
//        The act of moving the clock forward or back occurs at 2:00 a.m., which falls very early Sunday morning.

//        For example, on March 9, 2025, we move our clocks forward an hour and jump from 2:00 a.m. to 3:00 a.m. This means that there is no 2:30 a.m. that day. If we wanted to know the time an hour later than 1:30, it would be 3:30.

        var date = LocalDate.of(2025, Month.MARCH, 9);
        var time = LocalTime.of(1, 30);
        var zone = ZoneId.of("US/Eastern");
        var dateTime = ZonedDateTime.of(date, time, zone);

        System.out.println(dateTime);  // 2025–03-09T01:30-05:00[US/Eastern]
        System.out.println(dateTime.getHour());   // 1
        System.out.println(dateTime.getOffset()); // -05:00

        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime);  // 2025–03-09T03:30-04:00[US/Eastern]
        System.out.println(dateTime.getHour());   // 3
        System.out.println(dateTime.getOffset()); // -04:00

//        Notice that two things change in this example. The time jumps from 1:30 to 3:30. The UTC offset also changes. Remember when we calculated GMT time by subtracting the time zone from the time? You can see that we went from 6:30 GMT (1:30 minus –5:00) to 7:30 GMT (3:30 minus –4:00). This shows that the time really did change by one hour from GMT’s point of view. We printed the hour and offset fields separately for emphasis.
//                Similarly, in November, an hour after the initial 1:30 a.m. is also 1:30 a.m. because at 2:00 a.m. we repeat the hour. This time, try to calculate the GMT time yourself for all three times to confirm that we really do move only one hour at a time.
        var date2 = LocalDate.of(2025, Month.NOVEMBER, 2);
        var time2 = LocalTime.of(1, 30);
        var zone2 = ZoneId.of("US/Eastern");
        var dateTime2 = ZonedDateTime.of(date2, time2, zone2);
        System.out.println(dateTime); // 2025-11-02T01:30-04:00[US/Eastern]

        dateTime2 = dateTime2.plusHours(1);
        System.out.println(dateTime2); // 2025-11-02T01:30-05:00[US/Eastern]

        dateTime2 = dateTime2.plusHours(1);
        System.out.println(dateTime2); // 2025-11-02T02:30-05:00[US/Eastern]

//        Did you get it? We went from 5:30 GMT to 6:30 GMT, to 7:30 GMT.
//                Finally, trying to create a time that doesn’t exist just rolls forward:
        var date3 = LocalDate.of(2025, Month.MARCH, 9);
        var time3 = LocalTime.of(2, 30);
        var zone3 = ZoneId.of("US/Eastern");
        var dateTime3 = ZonedDateTime.of(date3, time3, zone3);
        System.out.println(dateTime3);    // 2025–03–09T03:30–04:00[US/Eastern]

//        Java is smart enough to know that there is no 2:30 a.m. that night and switches over to the appropriate GMT offset.
//        Yes, it is annoying that Oracle expects you to know this even if you aren’t in the United States—or for that matter, in a part of the United States that doesn’t follow daylight saving time. The exam creators are in the United States, and they decided that everyone needs to know how U.S. time zones work.


    }
}
