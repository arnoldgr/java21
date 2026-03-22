package chap6.understandinginheritance.page292;

public class Jaguar extends BigCat {
    public Jaguar() {
        size = 10.2;
    }

    public void printDetails() {
        System.out.print(size);
    }
}

//Jaguar is a subclass or child of BigCat, making BigCat a superclass or parent of Jaguar. I
// n the Jaguar class, size is accessible because it is marked protected.
//Via inheritance, the Jaguar subclass can read or write size as if it were its own member.
