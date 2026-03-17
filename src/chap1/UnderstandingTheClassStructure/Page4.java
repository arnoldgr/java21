package chap1.UnderstandingTheClassStructure;

public class Page4 {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;

    }

/*On line 3, we define a variable named name.
We also declare the type of that variable to be String.
A String is a value that we can put text into, such as "this is a string".
String is also a class supplied with Java. Next we can add methods.*/

/*On lines 5-6, we define a method.
A method is an operation that can be called.
Again, public is used to signify that this method may be called from other classes.
Next comes the return type—in this case, the method returns a String.

On lines 9–10 is another method. This one has a special return type called void.
The void keyword means that no value at all is returned.
This method requires that information be supplied to it from the calling method;
this information is called a parameter.
The setName() method has one parameter named newName, and it is of type String.
This means the caller should pass in one String parameter and expect nothing to be returned
//The method name and parameter types are called the method signature. In this example, can you identify the method name and parameters?
    public int numberVisitors(int month) {
        return 10;
    }

//Comments

// comment until end of line

    /* Multiple
     * line comment
     */

/**
 * Javadoc multiple-line comment
 * @author Jeanne and Scott
 */
}



