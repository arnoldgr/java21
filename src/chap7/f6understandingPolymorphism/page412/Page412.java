package chap7.f6understandingPolymorphism.page412;


class Primate {
    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    public abstract boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;
}

public class Page412 {
//    Object vs. Reference
//    In Java, all objects are accessed by reference, so as a developer you never have
//    direct access to the object itself.
//    Conceptually, though, you should consider the object as the entity that exists in memory,
//    allocated by the Java. Regardless of the type of the reference you have for
//    the object in memory, the object itself doesn’t change. For example, since all objects inherit
//    java.lang.Object, they can all be reassigned to java.lang.Object, as shown in the following example:

    Lemur lemur = new Lemur();
    Object lemurAsObject = lemur;

//    Even though the Lemur object has been assigned to a reference with a different type, the object itself has not changed and still exists as a Lemur object in memory. What has changed, then, is our ability to access methods within the Lemur class with the lemurAsObject reference. Without an explicit cast back to Lemur, as you see in the next section, we no longer have access to the Lemur properties of the object.
//    We can summarize this principle with the following two rules:
//
//    The type of the object determines which properties exist within the object in memory.
//    The type of the reference to the object determines which methods and variables are accessible to the Java program.
//
//    It therefore follows that successfully changing a reference of an object to a new reference type may give you access to new properties of the object; but remember, those properties existed before the reference change occurred.
//    Using the Lemur example, we illustrate this property in Figure 7.8.
//    A sample structure of a object versus reference in a Java script. On the left, the reference of interface has tail, class lemur, and class primate ponting towards the lemur object in memory on the right.
//
//    see book FIGURE 7.8 Object versus reference
//
//
//    As you can see in the figure, the same object exists in memory regardless of
//    which reference is pointing to it.
//    Depending on the type of the reference, we may only have access to certain methods.
//    For example, the hasTail reference has access to the method isTailStriped()
//    but doesn’t have access to the variable age defined in the Lemur class.
//    As you learn in the next section, it is possible to reclaim access to the
//    variable age by explicitly casting the hasTail reference to a reference of type Lemur.

//    Using Interface References
//
//    When working with a group of objects that implement a common interface,
//    it is considered a good coding practice to use an interface as the reference type.
//    This is especially common with collections that you learn about in Chapter 9. Consider the following method:
//    public void sortAndPrintZooAnimals(List<String> animals) {
//        Collections.sort(animals);
//        for(String a : animals) System.out.println(a);
//    }
//    This method sorts and prints animals in alphabetical order.
//    At no point is this class interested in what the actual underlying object for animals is.
//    It might be an ArrayList or another type.
//    The point is, our code works on any of these types because we used the
//    interface reference type rather than a class type.
//

}
