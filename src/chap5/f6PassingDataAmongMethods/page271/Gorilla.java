package chap5.f6PassingDataAmongMethods.page271;
//As before, the same limitation around autoboxing and numeric promotion applies to method calls.
// For example, the following does not compile:
public class Gorilla {
    public void rest(Long x) {
        System.out.print("long");
    }
    public static void main(String[] args) {
        var g = new Gorilla();
//        g.rest(8);  // DOES NOT COMPILE

//        Finally, autoboxing can be used when initializing an array.
//        The following creates two arrays with Integer and Double values, respectively.
        Integer[] openingHours     = { 9, 12 };
        Double[] temperaturesAtZoo = { 74.1, 93.2 };

//        The types have to be compatible, though, as shown in the following examples.
//        Integer[] winterHours = { 10.5, 17.0 };  // DOES NOT COMPILE
//        Double[] summerHours  = { 9, 21 };       // DOES NOT COMPILE
    }
}

//Java will cast or autobox the value automatically, but not both at the same time.
// Finally, autoboxing can be used when initializing an array.
// The following creates two arrays with Integer and Double values, respectively.
