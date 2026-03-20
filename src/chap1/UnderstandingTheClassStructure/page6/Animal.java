package chap1.UnderstandingTheClassStructure.page6;
//run from terminal to test in a file call Animal.java

/*Most of the time, each Java class is defined in its own .java file.
In this chapter, the only top-level type is a class.
A top-level type is a data structure that can be defined independently within a source file.
For the majority of the book, we work with classes as the top-level type,
but in Chapter 7, “Beyond Classes,” we present other top-level types, as well as nested types.
A top-level class is often public, which means any code can call it.
Interestingly, Java does not require that the type be public. For example, this class is just fine:
 You can even put two types in the same file. When you do so, at most one of the top-level types in the file is allowed to be public. That means a file containing the following is also fine:
If you do have a public type, it needs to match the filename.
The declaration public class Animal2 would not compile in a file named Animal.java.
In Chapter 5, “Methods,” we discuss what access options are available other than public.

*/

class Animal2 {


}

public class Animal {

}

