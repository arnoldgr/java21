package chap9.i9WorkingWithGenerics.page536;

import java.util.ArrayList;
import java.util.List;

public class Page536 {
    public static void main(String[] args) {

//Creating Upper-Bounded Wildcards
//Let’s try to write a method that adds up the total of a list of numbers.
//We’ve established that a generic type can’t just use a subclass.
//ArrayList<Number> list = new ArrayList<Integer>(); // DOES NOT COMPILE

//Instead, we need to use a wildcard:
        List<? extends Number> list = new ArrayList<Integer>();

        System.out.println(total(list));
        System.out.println(total2(list));
    }

    //The upper-bounded wildcard says that any class that extends Number or Number itself can be used as the formal parameter type:
    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number : list)
            count += number.longValue();
        return count;
    }

    //Remember how we kept saying that type erasure makes Java think that a generic type is an Object? That is still happening here. Java converts the previous code to something equivalent to the following:
    public static long total2(List list) {
        long count = 0;
        for (Object obj : list) {
            Number number = (Number) obj;
            count += number.longValue();
        }
        return count;
    }
}
