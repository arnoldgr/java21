package chap7.e5NestedClasses.page404;

//Nested Records are Implicitly static

//If you see a nested record, it is implicitly static.
// This means it can be used without a reference to the outer class.
// It also means it cannot access member variables of the outer class.
// We can compare and contrast this with two implementations of Emu,
// one that uses a record and the other that uses a class.
class Emu1 {
    String name = "Emmy";

    static Feathers createFeathers() {
        return new Feathers("grey");
    }

    record Feathers(String color) {
        void fly() {
//            System.out.print(name + "  is flying");  // DOES NOT COMPILE
        }
    }
}

class Emu2 {
    String name = "Emmy";

//    static Feathers createFeathers() {
//                return new Feathers("grey");  // DOES NOT COMPILE
//    }

    class Feathers {
        void fly() {
            System.out.print(name + "  is flying");
        }
    }
}
// Line 14 compiles without issue because the record is implicitly static.
// Line 28 does not compile, though, as the class version of Feathers is not static
// and would require an instance of Emu2 to create.
// Likewise, the outer variable, name, is only visible to the nested class if it
// is not static, as shown by line 33 compiling and line 19 not compiling.

