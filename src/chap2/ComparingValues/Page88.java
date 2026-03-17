package chap2.ComparingValues;


public class Page88 {
    public static void main(String[] args) {
        //Conditional operators
        boolean a = false;
        boolean b = true;
        boolean c = true;
        boolean d = false;
        System.out.println(a && b);  //The value is true only if both values are true.
        // If the left side is false, then the right side will not be evaluated.
        System.out.println(c || d);  //The value is true if at least one of the values is true.
        // If the left side is true, then the right side will not be evaluated

//        The conditional operators, often called short-circuit operators,
//        are nearly identical to the logical operators, & and |,
//        except that the right side of the expression may never be evaluated if the final result
//        can be determined by the left side of the expression. For example, consider the following snippet:
        int hour = 10;
        boolean zooOpen = true || (hour < 4);
        System.out.println(zooOpen);  // true

//        Referring to the truth tables, the value zooOpen can be false only if
//        both sides of the expression are false. Since we know the left side is true,
//        there’s no need to evaluate the right side, since no value of hour will ever
//        make this code print false. In other words, hour could have been -10 or 892;
//        the output would have been the same.
//        Try it yourself with different values for hour!

//        Avoiding a NullPointerException
//        A more common example of where conditional operators are used is checking for
//        null objects before performing an operation.
//        In the following example, if duck is null, the program will throw a NullPointerException at runtime:
        //Duck duck = new Duck();
        Duck duck = null;
       // if (duck != null & duck.getAge() < 5) { // Could throw a NullPointerException

            // Do something }


//        The issue is that the logical AND (&) operator evaluates both sides of the expression.
//        We could add a second if statement, but this could get unwieldy if we have a lot of variables to check.
//        An easy-to-read solution is to use the conditional AND operator (&&):

        if (duck != null && duck.getAge() < 5) {
            System.out.println("found age < 5");
        } else {
            System.out.println(duck);
        }

//        In this example, if duck is null, the conditional prevents a
//        NullPointerException from ever being thrown, since the evaluation of duck.getAge() < 5 is never reached.

//        Checking for Unperformed Side Effects
//        Be wary of short-circuit behavior on the exam, as questions are known to alter a
//        variable on the right side of the expression that may never be reached.
//        This is referred to as an unperformed side effect. For example, what is the output of the following code?
        int rabbit = 6;
        boolean bunny = (rabbit>= 6) || (++rabbit <= 7);
        System.out.println(rabbit);

//        Because rabbit >= 6 is true, the increment operator on the right side of the expression
//        is never evaluated, so the output is 6.

    }
}

class Duck {
    double getAge() {
        return 4;
    }
}
