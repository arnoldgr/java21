package chap5.PassingDataAmongMethods.page266;

public class Page266 {
    //    Passing Data among Methods
//    Java is a “pass-by-value” language. This means that a copy of the variable is made and the method receives that copy. Assignments made in the method do not affect the caller. Let’s look at an example:
    public static void main(String[] args) {
        int num = 4;
        newNumber(num);
        System.out.print(num);     // 4
    }

    public static void newNumber(int num) {
        num = 8;
    }


//    On line 7, num is assigned the value of 4.
//    On line 8, we call a method.
//    On line 12, the num parameter in the method is set to 8.
//    Although this parameter has the same name as the variable on line 7,
//    this is a coincidence.
//    The name could be anything. The exam will often use the same name to try to confuse you.
//    The variable on line 7 never changes because no assignments are made to it.

}
