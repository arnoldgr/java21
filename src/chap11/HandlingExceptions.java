package chap11;//package ExceptionsAndLocalization;

public class HandlingExceptions {

    void fall() {
        throw new RuntimeException();
    }

    void getUp() {
        System.out.println("getting up...");
    }

    void seeAnimals() {
        System.out.println("seeing animals!");
    }

    void seeAnimal() {}


    // Using try and catch Statements

    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            getUp();
        }
        seeAnimals();
    }


    // Chaining catch Blocks

    class AnimalsOutForAWalk extends RuntimeException {}
    class ExhibitClosed extends RuntimeException {}
    class ExhibitClosedForLunch extends ExhibitClosed {}

    void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {
            System.out.print("try back later");
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        }
    }

    // subclass first, superclass second — order matters when exceptions inherit each other
    void visitMonkeys() {
        try {
            seeAnimal();
        } catch (ExhibitClosedForLunch e) {
            System.out.print("try back later");
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        }
    }

    // superclass first makes subclass unreachable — DOES NOT COMPILE
    // void visitMonkeys() {
    //     try {
    //         seeAnimal();
    //     } catch (ExhibitClosed e) {
    //         System.out.print("not today");
    //     } catch (ExhibitClosedForLunch e) {  // DOES NOT COMPILE
    //         System.out.print("try back later");
    //     }
    // }

    // NumberFormatException is a subclass of IllegalArgumentException — DOES NOT COMPILE
    // void visitSnakes() {
    //     try {
    //     } catch (IllegalArgumentException e) {
    //     } catch (NumberFormatException e) {  // DOES NOT COMPILE
    //     }
    // }

    // e1 is only in scope inside its own catch block
    void visitManatees() {
        try {
            seeAnimal();
        } catch (NumberFormatException e1) {
            System.out.println(e1);
        } catch (IllegalArgumentException e2) {
            System.out.println(e2); // using e1 here would not compile
        }
    }


    // Applying a Multi-catch Block


    // without multi-catch — duplicate logic in both catch blocks
    // catch (ArrayIndexOutOfBoundsException e) { System.out.println("Missing or invalid input"); }
    // catch (NumberFormatException e)           { System.out.println("Missing or invalid input"); }

    // with multi-catch — combine using | to avoid duplicate logic
    void multiCatch(String[] args) {
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Missing or invalid input");
        }
    }


    // Adding a finally Block


    void getHugFromDaddy() {
        System.out.println("got a hug!");
    }

    void seeMoreAnimals() {
        System.out.println("seeing more animals!");
    }

    void goHome() {
        System.out.println("going home!");
    }

    // finally always runs — whether or not an exception is thrown
    void exploreWithFinally() {
        try {
            seeAnimals();
            fall();
        } catch (Exception e) {
            getHugFromDaddy();  // runs if exception is thrown
        } finally {
            seeMoreAnimals();   // always runs regardless
        }
        goHome();               // runs after the try statement completes
    }

    // finally always runs — even when there is a return statement in try or catch
    // the finally block interrupts the return and -3 is always returned
    int goHomeWithReturn() {
        try {
            System.out.print("1");
            return -1;          // would return here but finally runs first
        } catch (Exception e) {
            System.out.print("2");
            return -2;          // would return here but finally runs first
        } finally {
            System.out.print("3");
            return -3;          // always returned — overrides try and catch returns
        }
    }

    // catch and finally in wrong order — DOES NOT COMPILE
    // try {
    //     fall();
    // } finally {
    //     System.out.println("all better");
    // } catch (Exception e) {        // DOES NOT COMPILE — catch must come before finally
    //     System.out.println("get up");
    // }

    // try with no catch or finally — DOES NOT COMPILE
    // try {
    //     fall();
    // }

    // try with only finally — this is fine, catch is not required if finally is present
    void tryWithFinallyOnly() {
        try {
            fall();
        } finally {
            System.out.println("all better");
        }
    }

    // System.exit() — finally block will NOT run if System.exit() is called
    void systemExitExample() {
        try {
            System.exit(0);
        } finally {
            System.out.print("Never going to get here"); // not printed
        }
    }

    public static void main(String[] args) {
        HandlingExceptions obj = new HandlingExceptions();

        obj.explore();
        obj.visitPorcupine();
        obj.visitMonkeys();
        obj.visitManatees();
        obj.multiCatch(args);
        obj.exploreWithFinally();
        System.out.println(obj.goHomeWithReturn());
    }
}