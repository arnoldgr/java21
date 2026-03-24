package chap5.e5AccessingStaticData.page257;

public class Penguin {
    String name;
    static String nameOfTallestPenguin;

    //    In this class, every Penguin instance has its own name like Willy or Lilly, but only one Penguin among all the instances is the tallest. You can think of a static variable as being a member of the single class object that exists independently of any instances of that class. Consider the following example:
    public static void main(String[] unused) {
        var p1 = new Penguin();
        p1.name = "Lilly";
        nameOfTallestPenguin = "Lilly";
        var p2 = new Penguin();
        p2.name = "Willy";
        nameOfTallestPenguin = "Willy";

        System.out.println(p1.name);                  // Lilly
        System.out.println(p1.nameOfTallestPenguin);  // Willy
        System.out.println(p2.name);                  // Willy
        System.out.println(p2.nameOfTallestPenguin);  // Willy
    }

//    We see that each penguin instance is updated with its own unique name.
//    The nameOfTallestPenguin field is static and therefore shared,
//    though, so anytime it is updated, it impacts all instances of the class.


}
