package chap2.ApplyingUnaryOperators;
//Increment and decrement
public class Page69 {
    public static void main(String[] args) {

        int parkAttendance = 0;
        System.out.println(parkAttendance);    // 0
        System.out.println(++parkAttendance);  // 1
        System.out.println(parkAttendance);    // 1
        System.out.println(parkAttendance--);  // 1
        System.out.println(parkAttendance);    // 0
    }
}
//The first pre-increment operator updates the value for parkAttendance and outputs the new value of 1.
// The next post-decrement operator also updates the value of parkAttendance but outputs the value before
// the decrement occurs.

