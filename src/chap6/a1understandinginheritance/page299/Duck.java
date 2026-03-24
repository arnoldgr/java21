package chap6.understandinginheritance.page299;

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