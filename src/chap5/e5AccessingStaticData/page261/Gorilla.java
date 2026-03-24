package chap5.e5AccessingStaticData.page261;

//Do you understand why the following lines fail to compile?

public class Gorilla {
    public static int count;

    public static void addGorilla() {
        count++;
    }

    public void babyGorilla() {
        count++;
    }

    public void announceBabies() {
        addGorilla();
        babyGorilla();
    }

    public static void announceBabiesToEveryone() {
        addGorilla();
//        babyGorilla();     // DOES NOT COMPILE
    }

    public int total;
//    public static double average = total / count;  // DOES NOT COMPILE

}

//Lines 7 and 8 are fine because both static and instance methods can refer to a static variable.
// Lines 9-12 are fine because an instance method can call a static method.
// Line 15 doesn’t compile because a static method cannot call an instance method. Similarly,
// line 19 doesn’t compile because a static variable is trying to use an instance variable.



