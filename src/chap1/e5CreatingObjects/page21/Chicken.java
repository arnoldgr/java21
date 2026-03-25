//OBJECTS
package chap1.e5CreatingObjects.page21;

public class Chicken {
    int numEggs = 12;  // initialize on line
    String name;
    public Chicken() {
        name = "Duke";  // initialize in constructor
    }
}

/*The purpose of a constructor is to initialize fields, although you can put any code in there.
 Another way to initialize fields is to do so directly on the line on which they’re declared.
 This example shows both approaches:

 */
