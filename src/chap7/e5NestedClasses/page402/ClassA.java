package chap7.e5NestedClasses.page402;

//Referencing Members of an Inner Class
//Inner classes can have the same variable names as outer classes, making scope a little tricky.
// There is a special way of calling this to say which variable you want to access.
// This is something you might see on the exam but, ideally, not in the real world.
// In fact, you aren’t limited to just one inner class.
// While the following is common on the exam, please never do this in code you write.
// Here is how to nest multiple classes and access a variable with the same name in each:
class A {
    private int x = 10;

    class B {
        private int x = 20;

        class C {
            private int x = 30;

            public void allTheX() {
                System.out.println(x);        // 30
                System.out.println(this.x);   // 30
                System.out.println(B.this.x); // 20
                System.out.println(A.this.x); // 10
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = a.new B();
        B.C c = b.new C();
        c.allTheX();
    }
}


// Yes, this code makes us cringe too.
// It has two nested classes.
// Line 29 instantiates the outermost one.
// Line 30 uses the awkward syntax to instantiate a B.
// Notice that the type is A.B.
// We could have written B as the type because that is available at the member level of A.
// Java knows where to look for it.
// On line 31, we instantiate a C.
// This time, the A.B.C type is necessary to specify. C is too deep for Java to know where to look.
// Then line 32 calls a method on the instance variable c.
//  20 and 21 are the type of code that we are used to seeing.
// They refer to the instance variable on the current class—the one declared on line 17,
// to be precise.
// Line 22 uses this in a special way.
// We still want an instance variable.
// But this time, we want the one on the B class, which is the variable on line 14.
// Line 23 does the same thing for class A, getting the variable from line 11.
