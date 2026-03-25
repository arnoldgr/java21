//OBJECTS
package chap1.e5CreatingObjects.page21;

public class Swan {
    int numberEggs;                            // instance variable
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1;                  // set variable
        System.out.println(mother.numberEggs);  // read variable
    }
}

/*The “caller” in this case is the main() method, which could be in the same class or in another class.
This class sets numberEggs to 1 and then reads numberEggs directly to print it out.
 */
