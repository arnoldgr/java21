package chap6.creatingclasses.page299;

//Now let’s look at some examples that aren’t common but that you might see on the exam:
public class Duck {
    private String color;
    private int height;
    private int length;

    public void setData(int length, int theHeight) {
        length = this.length;  // Backwards -- no good!
        height = theHeight;    // Fine, because a different name
        this.color = "white";  // Fine, but this. reference not necessary
    }

    public static void main(String[] args) {
        Duck b = new Duck();
        b.setData(1, 2);
        System.out.print(b.length + " " + b.height + " " + b.color);
    }
}
//This code compiles and prints the following:
//        0 2 white

//This might not be what you expected, though.
// Line 10 is incorrect, and you should watch for it on the exam.
// The instance variable length starts out with a 0 value.
// That 0 is assigned to the method parameter length.
// The instance variable stays at 0.
// Line 11 is more straightforward.
// The parameter theHeight and instance variable height have different names.
// Since there is no naming collision, this is not required. Finally,
// line 12 shows that a variable assignment is allowed to use the this reference
// even when there is no duplication of variable names.
