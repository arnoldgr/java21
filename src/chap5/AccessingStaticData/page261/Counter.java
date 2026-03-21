package chap5.AccessingStaticData.page261;

public class Counter {
    private static int count;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count);     // 3
    }
}


//Each time the constructor is called, it increments count by one.
// This example relies on the fact that static (and instance) variables are automatically
// initialized to the default value for that type, which is 0 for int.
// See Chapter 1 to review the default values.
//Also notice that we didn’t write Counter.count. We could have.
// It isn’t necessary because we are already in that class, so the compiler can infer it.



