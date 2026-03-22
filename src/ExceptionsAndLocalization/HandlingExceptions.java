package ExceptionsAndLocalization;


public class HandlingExceptions {

    // fall() throws an unchecked RuntimeException
    void fall() {
        throw new RuntimeException();
    }

    void getUp() {
        System.out.println("getting up...");
    }

    void seeAnimals() {
        System.out.println("seeing animals!");
    }

    void explore() {
        try {
            fall();                            // throws RuntimeException
            System.out.println("never get here"); // unreachable, fall() always throws
        } catch (RuntimeException e) {
            getUp();                           // catch handles the exception and recovers
        }
        seeAnimals();                          // runs normally after catch block finishes
    }

    public static void main(String[] args) {
        HandlingExceptions obj = new HandlingExceptions();
        obj.explore();
    }
}



