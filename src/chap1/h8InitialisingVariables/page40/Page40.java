package chap1.h8InitialisingVariables.page40;
//instance and class variables
public class Page40 {
static boolean classVar;
int instanceVar;

    public static void main(String[] args) {
        System.out.println(classVar); // has access to class variable without instantiating the class
       // System.out.println(instanceVar); has to instatiate the class first
        Page40 p40 = new Page40();
        System.out.println(p40.instanceVar);
        //variable will have the default values. no need to initialise class and instance variables.
    }
}
