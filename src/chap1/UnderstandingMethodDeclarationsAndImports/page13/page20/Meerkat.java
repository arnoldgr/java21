/* header */       //comments can be anywhere
package chap1.UnderstandingMethodDeclarationsAndImports.page13.page20; // package must be first non-comment, not required

public class Meerkat {  // then comes the class after imports if any, not required
    double weight;       // fields and methods can go in either order within class , not required

    public double getWeight() {
        return weight;
    }

    double height;    // another field - they don't need to be together
}

// DO NOT PUT IMPORT BEFORE PACKAGE ABD DO NOT PUT FIELD OUTSIDE OF CLASS
//import java.util.*;
//        package structure;       // DOES NOT COMPILE
//String name;             // DOES NOT COMPILE
//public class Meerkat { } // DOES NOT COMPILE

//NB: must be in this order, only class is required
//PIC package, import, class

