package chap5.a1DesigningMethods.page236;

public class ParkTrip {
    public void skip1() {
    }

    //  default void skip2() {} // DOES NOT COMPILE
//  void public skip3() {}  // DOES NOT COMPILE
    void skip4() {
    }
//            The skip1() method is a valid declaration with public access.
//            The skip4() method is a valid declaration with package access.
//            The skip2() method doesn’t compile because default is not a valid access modifier.
//            There is a default keyword, which is used in switch statements and interfaces,
//            but default is never used as an access modifier.
//            The skip3() method doesn’t compile because the access modifier is specified after the return type.
}



