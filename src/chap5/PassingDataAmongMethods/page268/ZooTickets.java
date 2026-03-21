package chap5.PassingDataAmongMethods.page268;

//Returning Objects
//Getting data back from a method is easier. A copy is made of the primitive or reference and returned from the method. Most of the time, this returned value is used. For example, it might be stored in a variable. If the returned value is not used, the result is ignored. Watch for this on the exam. Ignored returned values are tricky.
//Let’s try an example. Pay attention to the return types.
public class ZooTickets {
    public static void main(String[] args) {
        int tickets = 2;
        String guests = "abc";                    // guests  = abc// tickets = 2
        addTickets(tickets);                      // tickets = 2
        guests = addGuests(guests);               // guests  = abcd
        System.out.println(tickets + guests);     // 2abcd
    }

    public static int addTickets(int tickets) {
        tickets++;
        return tickets;
    }

    public static String addGuests(String guests) {
        guests += "d";
        return guests;
    }
}
//This is a tricky one because there is a lot to keep track of.
// When you see such questions on the exam, write down the values of each variable.
// Lines 8 and 9 are straightforward assignments.
// Line 10 calls a method.
// Line 16 increments the method parameter to 3 but leaves the tickets variable in the main() method as 2.
// While line 17 returns the value, the caller ignores it.
// The method call on line 11 doesn’t ignore the result, so guests becomes "abcd".
// Remember that this is happening because of the returned value and not the method parameter.
