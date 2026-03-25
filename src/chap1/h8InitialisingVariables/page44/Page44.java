package chap1.h8InitialisingVariables.page44;

public class Page44 {
    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    }

    //There are two variables with local scope.
    // The bitesOfCheese variable is declared inside the method.
    // The piecesOfCheese variable is a method parameter.
    // Neither variable can be used outside of where it is defined.

    public void eatIfHungry1(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        }  // bitesOfCheese goes out of scope here
      //  System.out.println(bitesOfCheese);  // DOES NOT COMPILE
    }
     public void eatIfHungry2(boolean hungry) {
           if (hungry) {
                  int bitesOfCheese = 1;
               {
                        var teenyBit = true;
                         System.out.println(bitesOfCheese);
                       }
                }
         // System.out.println(teenyBit);  // DOES NOT COMPILE out of scope

         }
}
