package chap6.declaringconstructors.page306;
//There’s one last rule for overloaded constructors that you should be aware of.
// Consider the following definition of the Gopher class:
//public class Gopher {
//    public Gopher(int dugHoles) {
//        this(5);  // DOES NOT COMPILE calling itself infinitely
//    }
//}

//The compiler is capable of detecting that this constructor is calling itself infinitely.
// This is often referred to as a cycle and is similar to the infinite loops that we discussed in Chapter 3,
// “Making Decisions.” Since the code can never terminate, the compiler stops and reports this as an error.

// Likewise, this also does not compile.

//public Gopher() {
//    this(5);  // DOES NOT COMPILE
//}
//
//public Gopher(int dugHoles) {
//    this();   // DOES NOT COMPILE
//}
//}
//In this example, the constructors call each other, and the process continues infinitely.
// Since the compiler can detect this, it reports an error.


//Here we summarize the rules you should know about constructors that we covered in this section.
// Study them well!

//1. A class can contain many overloaded constructors, provided the signature for each is distinct.
//2. The compiler inserts a default no-argument constructor if no constructors are declared.
//3. If a constructor calls this(), then it must be the first line of the constructor.
//4. Java does not allow cyclic constructor calls.
