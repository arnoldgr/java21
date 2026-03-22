package chap6.understandinginheritance;

public class Page295 {
//    Inheriting Object
//    Throughout our discussion of Java in this book, we have thrown around the word object numerous times—and with good reason. In Java, all classes inherit from a single class:
//    java.lang.Object, or Object for short. Furthermore, Object is the only class that doesn’t have a parent class.
//    You might be wondering, “None of the classes I’ve written so far extend Object, so how do all classes inherit from it?” The answer is that the compiler has been automatically inserting code into any class you write that doesn’t extend a specific class. For example, the following two are equivalent:
    class Zoo { }

//    class Zoo extends java.lang.Object { }
}

//Primitive types such as int and boolean do not inherit from Object,
// since they are not classes. As you learned in Chapter 5, through
// autoboxing they can be assigned or passed as an instance of an
// associated wrapper class, which does inherit Object.
