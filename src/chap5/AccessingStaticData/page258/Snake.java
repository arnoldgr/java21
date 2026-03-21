package chap5.AccessingStaticData.page258;

//Usually, accessing a static member is easy.
public class Snake {
    public static long hiss = 2;

    public static void main(String[] args) {


//You just put the class name before the method or variable, and you are done. Here’s an example:
        System.out.println(Snake.hiss);

//Nice and easy. There is one rule that is trickier.
        Snake s = new Snake();
        System.out.println(s.hiss);  // s is a Snake
        s = null;
        System.out.println(s.hiss);  // s is still a Snake

//Believe it or not, this code outputs 2 twice.
// Line 17 sees that s is a Snake and hiss is a static variable,
// so it reads that static variable.
// Line 20 does the same thing. Java doesn’t care that s happens to be null.
// Since we are looking for a static variable, it doesn’t matter.

//Remember to look at the reference type for a variable when you see a static method or variable.
// The exam creators will try to trick you into thinking a NullPointerException is thrown because
// the variable happens to be null. Don’t be fooled!

//One more time, because this is really important: what does the following output?
        Snake.hiss = 4;
        Snake snake1 = new Snake();
        Snake snake2 = new Snake();
        snake1.hiss = 6;
        snake2.hiss = 5;
        System.out.println(Snake.hiss);

//We hope you answered 5. There is only one hiss variable since it is static. It is set to 4 and then 6 and finally winds up as 5. All the Snake variables are just distractions.
    }
}