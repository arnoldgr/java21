package chap1.DeclaringVariables;

public class Page36 {
    public static void main(String[] args) {
        //Another way the exam could try to trick you is to show you code like this line:

        //int num, String value; // DOES NOT COMPILE

        //This code doesn’t compile because it tries to declare multiple variables of different types in the same statement.

        //Which is legal?
        boolean b1, b2;
        String s1 = "1", s2;
       // double d1, double d2;
        int i1;
        int i2;
        //int i3;i4;

    }

    void sandFence() {
        //How many variables do you think are declared and initialized in the following example?
        String s1, s2;
        String s3 = "yes", s4 = "no";
    }

    //Four String variables were declared: s1, s2, s3, and s4. You can declare many variables in the same declaration as long as they are all of the same type

    //how many variables do you think are declared and initialized in the following code?
    void paintFence() {
        int i1, i2, i3 = 0;
    }
    //As you should expect, three variables were declared: i1, i2, and i3. However, only one of those values was initialized: i3

}
