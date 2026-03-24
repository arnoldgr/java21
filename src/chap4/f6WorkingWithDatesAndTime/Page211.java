package chap4.WorkingWithDatesAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Page211 {
    public static void main(String[] args) {
//        It is common for date and time methods to be chained.
//        For example, without the print statements, the previous example could be rewritten as follows:
        var date = LocalDate.of(2025, Month.JANUARY, 20);
        var time = LocalTime.of(5, 15);
        var dateTime = LocalDateTime.of(date, time)
                .minusDays(1).minusHours(10).minusSeconds(30);

//        When you have a lot of manipulations to make, this chaining comes in handy.
//        There are two ways that the exam creators can try to trick you.
//        What do you think this prints?
        var date2 = LocalDate.of(2025, Month.JANUARY, 20);
        date2.plusDays(10);
        System.out.println(date2);

//        It prints 2025 - 01 - 20. Adding 10 days was useless because the program ignored the result.Whenever you
//        see immutable types, pay attention to make sure that the return value of a method call isn’t ignored.The exam
//        also may test to see if you remember what each of the date and time objects includes.Do you see what is wrong
//        here ?
        var date3 = LocalDate.of(2025, Month.JANUARY, 20);
//        date3 = date3.plusMinutes(1);       // DOES NOT COMPILE

//        LocalDate does not contain time.This means you cannot add minutes to it.This can be tricky in a chained sequence
//        of addition/subtraction operations, so make sure you know which methods in Table 4.6 can be called on
//        which types.
    }
}
