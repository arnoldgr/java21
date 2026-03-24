package chap4.CreatingAndManipulatingStrings;


public class Page170 {
    public static void main(String[] args) {
//        substrings
//        The method signatures are as follows:
//        public String substring(int beginIndex)
//        public String substring(int beginIndex, int endIndex)

//        The following code shows how to use substring():
        var name = "animals";
        System.out.println(name.substring(3));                   // mals
        System.out.println(name.substring(name.indexOf('m')));   // mals
        System.out.println(name.substring(3, 4));                // m
        System.out.println(name.substring(3, 7));                // mals

//        The next examples are less obvious:
        System.out.println(name.substring(3, 3));  // empty string
        System.out.println(name.substring(3, 2));  // exception
        System.out.println(name.substring(3, 8));  // exception
    }
}
