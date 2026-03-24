package chap5.g8OverloadingMethods.page275;

public class Page275 {
    public static void main(String[] args) {
//       int[]  i = {1,2,3,4};
//        walk(i);  // do not compile, will not autobox arrays
        long[] l = {1L, 2L, 3L, 4L};
        walk(l);

//        Integer[] i2 = {1, 2, 3, 4};
//        walk(i2);  // do not compile, will not autobox arrays
        Long[] l2 = {1L, 2L, 3L, 4L};
        walk(l2);

    }

    //    Unlike the previous example, this code does not result in autoboxing:
    public static void walk(long[] longs) {
    }

    public static void walk(Long[] long2) {
    }

//    Arrays have been around since the beginning of Java.
//    They specify their actual types. What about generic types, such as List<Integer>?
//    We cover this topic in Chapter 9.
}
