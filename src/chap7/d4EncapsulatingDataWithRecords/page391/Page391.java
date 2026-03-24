package chap7.d4EncapsulatingDataWithRecords.page391;

//Transforming Parameters
//Compact constructors give you the opportunity to apply transformations to any of the input values.
// See if you can figure out what the following compact constructor does:
record Crane(int numberEggs, String name) {
    public Crane {
        if (name == null || name.length() < 1)
            throw new IllegalArgumentException();
        name = name.substring(0, 1).toUpperCase()
                + name.substring(1).toLowerCase();
    }
}
public class Page391 {
    public static void main(String[] args) {
        Crane c = new Crane(10,"SHERYL");
        System.out.println(c.name());
    }
}

//Give up? It validates the string, then formats it such that only the first letter is capitalized.
// As before, Java calls the full constructor after the compact constructor but with
// the modified constructor parameters.
// While compact constructors can modify the constructor parameters, they cannot modify the fields of the record.
// For example, this does not compile:
//record Crane(int numberEggs, String name) {
//    public Crane {
//        this.numberEggs = 10;  // DOES NOT COMPILE
//    }
//}

//Removing the this reference allows the code to compile, as the constructor parameter is modified instead.

//Although we covered both the long and compact forms of record constructors in this section,
// it is highly recommended that you stick with the compact form unless you have a good reason not to.
