package chap2.AssigningValues;

//return values of assignment operators
public class Page80 {
    public static void main(String[] args) {
//        One final thing to know about assignment operators is that the result of an assignment
//        is an expression in and of itself equal to the value of the assignment.
//        For example, the following snippet of code is perfectly valid, if a little odd-looking:
        long wolf = 5;
        long coyote = (wolf = 3);
        System.out.println(wolf);   // 3
        System.out.println(coyote); // 3

//        The key here is that(wolf = 3) does two things.First, it sets the value of the variable wolf to be 3.
//        Second, it returns a value of the assignment, which is also 3.
//        The exam creators are fond of inserting the assignment operator ( =)in the middle of an expression and using
//        the value of the assignment as part of a more complex expression.For example, don’t be surprised
//        if you see an if statement on the exam similar to the following:

        boolean healthy = false;
        if (healthy = true)
            System.out.print("Good!");

//        While this may look like a test if healthy is true, it’s actually assigning healthy a value of true.The
//        result of the assignment is the value of the assignment, which is true, resulting in this snippet printing
//        Good!.We’ll cover this in more detail in the upcoming “Equality Operators”section.

    }
}
