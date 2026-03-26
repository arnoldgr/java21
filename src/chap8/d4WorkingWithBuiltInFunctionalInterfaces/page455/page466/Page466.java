package chap8.d4WorkingWithBuiltInFunctionalInterfaces.page455.page466;

public class Page466 {
    public static void main(String[] args) {

//        Parameter List Formats

//        You have three formats for specifying parameter types within a lambda: without types, with types,
//        and with var. The compiler requires all parameters in the lambda to use the same format.
//        Can you see why the following are not valid?


//        (var x, y) -> "Hello"                  // DOES NOT COMPILE
//        (var x, Integer y) -> true             // DOES NOT COMPILE
//        (String x, var y, Integer z) -> true   // DOES NOT COMPILE
//        (Integer x, y) -> "goodbye"            // DOES NOT COMPILE


//        Lines 5 needs to remove var from x or add it to y.
//        Next, lines 6 and 7 need to use the type or var consistently.
//        Finally, line 8 needs to remove Integer from x or add a type to y.

//        Using Local Variables Inside a Lambda Body
//        While it is most common for a lambda body to be a single expression, it is legal to define a block.
//        That block can have anything that is valid in a normal Java block, including local
//        variable declarations.
//        The following code does just that. It creates a local variable named c that is scoped to the lambda block:
//        (a, b) -> { int c = 0; return 5; }
//
//        Now let’s try another one. Do you see what’s wrong here?
//                (a, b) -> { int a = 0; return 5; }     // DOES NOT COMPILEE

//        We tried to redeclare a, which is not allowed. Java doesn’t let you create a local variable with
//        the same name as one already declared in that scope.
//        While this kind of error is less likely to come up in real life,
//        it has been known to appear on the exam!
//        Now let’s try a hard one. How many syntax errors do you see in this method?
    }
//        public void variables ( int a){
//            int b = 1;
//            Predicate<Integer> p1 = a -> {
//                int b = 0;
//                int c = 0;
//                return b == c;
//            }
//        }

//        There are three syntax errors. The first is on line 13.
//        The variable a was already used in this scope as a method parameter, so it cannot be reused.
//        The next syntax error comes on line 14, where the code attempts to redeclare local variable b.
//        The third syntax error is quite subtle and on line 16. See it? Look really closely.
//        The variable p1 is missing a semicolon at the end. There is a semicolon before the }, but that is inside the block. While you don’t normally have to look for missing semicolons, lambdas are tricky in this space, so beware!



}
