package chap4.CreatingAndManipulatingStrings;

public class Page171 {
    public static void main(String[] args) {
//        The method signatures are as follows:
//        public int indexOf(int ch)
//        public int indexOf(int ch, int fromIndex)
//        public int indexOf(int ch, int fromIndex, int endIndex)
//        public int indexOf(String str)
//        public int indexOf(String str, int fromIndex)
//        public int indexOf(String str, int fromIndex, int endIndex)

//        The following code shows you how to use indexOf():

        var name = "animals";
        System.out.println(name.indexOf('a'));         // 0
        System.out.println(name.indexOf("al"));        // 4
        System.out.println(name.indexOf('a', 4));      // 4
        System.out.println(name.indexOf("al", 5));     // -1
        System.out.println(name.indexOf('a', 2, 4));   // -1
        System.out.println(name.indexOf("al", 2, 6));  // 4
    }
}
