package chap6.inheritingmembers.page335;


//    Spotting Invalid Declarations
//    We conclude our discussion of abstract classes with a review of potential issues
//    you’re more likely to encounter on the exam than in real life.
//    The exam writers are fond of questions with methods marked as abstract for
//    which an implementation is also defined.
//    For example, can you see why each of the following methods does not compile?

    abstract class Turtle {
//        public abstract long eat()      // DOES NOT COMPILE
//        public abstract void swim() {}; // DOES NOT COMPILE
//        public abstract int getAge() {  // DOES NOT COMPILE
//            return 10;
//        }
//        public abstract void sleep;     // DOES NOT COMPILE
//        public void goInShell();        // DOES NOT COMPILE
    }

//    The first method, eat(), does not compile because it is marked abstract but does not end with a semicolon (;).
//    The next two methods, swim() and getAge(), do not compile because they are marked abstract,
//    but they provide an implementation block enclosed in braces ({}). For the exam,
//    remember that an abstract method declaration must end in a semicolon without any braces.
//    The next method, sleep, does not compile because it is missing parentheses, (), for method arguments.
//    The last method, goInShell(), does not compile because it is not marked abstract and therefore
//    must provide a body enclosed in braces.

//    Make sure you understand why each of the previous methods does not compile and that you can
//    spot errors like these on the exam. If you come across a question on the exam in which a class
//    or method is marked abstract, make sure the class is properly implemented before attempting to solve the problem.


