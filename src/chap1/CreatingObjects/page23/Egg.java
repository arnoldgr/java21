package chap1.CreatingObjects.page23;

//You should expect to see a question about initialization on the exam.
// Let’s try one more. What do you think this code prints out?


public class Egg {
    public Egg() {
        number = 5;
    }
    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }
    private int number = 3;
    { number = 4; } }