package chap1.i9ManagingVariableScope.page47;

public class Mouse {
    //try to figure out the type of the four variables and when they go into and out of scope.

    final static int MAX_LENGTH = 5;
    int length;

    public void grow(int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
        }
    }
}

    /*In this class, we have one class variable, MAX_LENGTH; one instance variable,
    length; and two local variables, inches and newSize.
    The MAX_LENGTH variable is a class variable because it has the static keyword in its declaration.
    In this case, MAX_LENGTH goes into scope on line 2 where it is declared.
    It stays in scope until the program ends.
    Next, length goes into scope on line 3 where it is declared. It stays in scope as long as this
     Mouse object exists. inches goes into scope where it is declared on line 4.
    It goes out of scope at the end of the method on line 9.
    newSize goes into scope where it is declared on line 6.
    Since it is defined inside the if statement block, it goes out of scope when that block ends on line 8.

     */